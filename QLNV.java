package BT2;
import BT1.NhanVien;

public class QLNV implements IQuanLy {
    NhanVien[] NV = new NhanVien[100];
    int n = 0;
    
 
    public void themNV(NhanVien nv) {
        NV[n] = new NhanVien();
        NV[n] = nv;
        n++;
    }
    
   
    public void inDS() {
        for(int i = 0; i<n; i++) {
            System.out.println("\nNhân viên thứ " + i);
            NV[i].getThongTin();
        }
    }
}
