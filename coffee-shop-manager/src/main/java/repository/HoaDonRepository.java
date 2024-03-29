/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.HibernatUtil;
import domainmodel.HoaDon;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author hungn
 */
public class HoaDonRepository {

    private String fromTable = "From HoaDon";

    private Session session = HibernatUtil.getFACTORY().openSession();

    public List<HoaDon> getAll() {
        Query query = session.createQuery(fromTable, HoaDon.class);
        List<HoaDon> lists = query.getResultList();
        return lists;
    }

    public HoaDon getOne(UUID id) {
        String sql = fromTable + " WHERE IDHD = :id ";
        javax.persistence.Query query = session.createQuery(sql, HoaDon.class);
        query.setParameter("id", id);
        HoaDon hd = (HoaDon) query.getSingleResult();
        return hd;
    }

    public List<HoaDon> getHoaDonByTT(String TT) {
        String sql = fromTable + " WHERE TrangThai = :id ";
        javax.persistence.Query query = session.createQuery(sql, HoaDon.class);
        query.setParameter("id", TT);
        List<HoaDon> lists = query.getResultList();
        return lists;
    }

    public static void main(String[] args) {

        new HoaDonRepository().getAll().forEach(a -> System.out.println(a.toString()));

    }

    public List<HoaDon> getHoaDonByTT() {
        String sql = fromTable + " WHERE TrangThai = :id ";
        javax.persistence.Query query = session.createQuery(sql, HoaDon.class);
        query.setParameter("id", "CHỜ TT");
        List<HoaDon> lists = query.getResultList();
        return lists;
    }

    public List<HoaDon> getHoaDonByCheck(int IDB) {
        String sql = fromTable + " WHERE IDB =  " + IDB;
        javax.persistence.Query query = session.createQuery(sql, HoaDon.class);

        List<HoaDon> lists = query.getResultList();
        return lists;
    }

    public Boolean add(HoaDon hoaDon) {
        Transaction transaction = null;
        try ( Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean delete(HoaDon hoaDon) {
        Transaction transaction = null;
        try ( Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean update(HoaDon hoaDon, UUID IdInvoices) {
        try {
            HoaDon st = session.get(HoaDon.class, IdInvoices);
            st.setIDB(hoaDon.getIDB());
            st.setIDKH(hoaDon.getIDKH());
            st.setIDKM(hoaDon.getIDKM());
            st.setIDNV(hoaDon.getIDNV());
            st.setNgayTT(hoaDon.getNgayTT());
            st.setNgayTao(hoaDon.getNgayTao());
            st.setTienTra(hoaDon.getTienTra());
            st.setTongTien(hoaDon.getTongTien());
            st.setTrangThai(hoaDon.getTrangThai());
            session.getTransaction().begin();
            session.save(st);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<HoaDon> search(String TrangThai) {
        return (List<HoaDon>) session.get(HoaDon.class, TrangThai);
    }

    public Boolean Update(HoaDon hoaDon) {
        Transaction transaction = null;
        try ( Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.update(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
