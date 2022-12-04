/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.HibernatUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author vutuo
 */
public class ThongKeRepository1 {

    private Session session = HibernatUtil.getFACTORY().openSession();
    private static final Logger logger = Logger.getLogger(ThongKeRepository1.class);

    public List<Object[]> listThongKe() {
        try ( Session session = HibernatUtil.getFACTORY().openSession();) {
            String HQL = " select H.NgayTT, COUNT(H.NgayTT) AS TONGHD,  SUM(HD.SoLuong) as TONGSL,  SUM(H.TongTien) AS TONGTIEN from HoaDon H JOIN HDCT HD ON H.IDHD = HD.IDHD where H.TrangThai = 'DTT' GROUP BY H.NgayTT ORDER BY H.NgayTT DESC";
            Query query = session.createQuery(HQL, Object[].class);
            List<Object[]> lists = query.getResultList();
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        }

    }

    public List<Object> soLuong(String date) {
        String HQL = " SELECT SUM(HD.SoLuong) FROM HoaDon H JOIN HDCT HD ON H.IDHD = HD.IDHD WHERE H.TrangThai = 'DTT' AND H.NgayTT = :ngayTT GROUP BY H.NgayTT";
        Query query = session.createQuery(HQL, Object.class);
        query.setParameter("ngayTT", date);
        List<Object> list = query.getResultList();
        if (list.isEmpty()) {
            List<Object> listRong = new ArrayList<>();
            listRong.add("0");
            return listRong;
        } else {
            return list;
        }
    }

    public List<Object> soLuongNgay( String ngayBD, String ngayKT) {
        String HQL = "SELECT SUM(HD.SoLuong) FROM HoaDon H JOIN HDCT HD ON H.IDHD = HD.IDHD WHERE H.TrangThai = 'DTT' AND H.NgayTT = :ngayBD BETWEEN H.NgayTT = :ngayKT GROUP BY H.NgayTT";
        Query query = session.createQuery(HQL, Object.class);
         query.setParameter("ngayBD", ngayBD);
         query.setParameter("ngayKT", ngayKT);
        List<Object> list = query.getResultList();
        if (list.isEmpty()) {
            List<Object> listRong = new ArrayList<>();
            listRong.add("0");
            return listRong;
        } else {
            return list;
        }
    }

    public static void main(String[] args) {
        List<Object> xuat = new ThongKeRepository1().soLuongNgay("2022-12-02", "2022-12-04");
    }
}