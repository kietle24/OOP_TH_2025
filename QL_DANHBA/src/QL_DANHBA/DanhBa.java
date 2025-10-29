package QL_DANHBA;

import java.util.*;

public class DanhBa  {
    private HashMap<String, ArrayList<String>> danhBa = new HashMap<>();
    public void themSo(String diaChi, String soDT) {
        danhBa.putIfAbsent(diaChi, new ArrayList<>());
        danhBa.get(diaChi).add(soDT);
    }
    public void timTheoDiaChi(String diaChi) {
        ArrayList<String> ds = danhBa.get(diaChi);
        if (ds != null)
            System.out.println("Các số của " + diaChi + ": " + ds);
        else
            System.out.println("Không tìm thấy địa chỉ này.");
    }
    public void timTheoSo(String soDT) {
        for (Map.Entry<String, ArrayList<String>> e : danhBa.entrySet()){
            if (e.getValue().contains(soDT)) {
                System.out.println("Số " + soDT + " thuộc địa chỉ: " + e.getKey());
                return;
            }
        }
        System.out.println("Không tìm thấy số điện thoại này.");
    }
 
}
