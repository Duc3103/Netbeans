
package BT2;
import BT1.NhanVien;
public class BT2main {

   
    public static void main(String[] args) {
        QLNV ds = new QLNV();
        NhanVien NV1 = new NhanVien("Nguyễn Duy Khánh",22,"11 Phạm Văn Đồng",1000000.0,250);
        NhanVien NV2 = new NhanVien("Nguyễn Duy Nghĩa",23,"12 Phạm Văn Đồng",1500000.0,250);
        NhanVien NV3 = new NhanVien("Nguyễn Duy Mạnh",24,"13 Phạm Văn Đồng",1500000.0,250);
        NhanVien NV4 = new NhanVien("Nguyễn Duy Phong",25,"14 Phạm Văn Đồng",2000000.0,250);
        NhanVien NV5 = new NhanVien("Nguyễn Duy Hoài",26,"15 Phạm Văn Đồng",2500000.0,250);
        
        
        ds.themNV(NV1);
        ds.themNV(NV2);
        ds.themNV(NV3);
        ds.themNV(NV4);
        ds.themNV(NV5);
       
        for (int i=0; i<5; i++){
            System.out.println("\nNhân viên thứ " + i);
            ds.NV[i].getThongTin();
        }
    }
    
}
