/*
6. Bài tập nâng cao hơn một chút

Viết chương trình quản lý sinh viên đơn giản: nhập tên, tuổi, điểm rồi in danh sách.

Viết game đoán số: máy chọn ngẫu nhiên số từ 1–100, người chơi đoán cho đến khi đúng.

Viết chương trình quản lý danh bạ (tên + số điện thoại) bằng mảng.
 */
import java.util.Scanner;
public class bai_tap_1 {
    public class sinh_vien {
        String ten;
        int tuoi;
        double diem;
        //constructor

        public sinh_vien(String _ten,int _tuoi, double _diem  )
        {
            this.ten = _ten;
            this.tuoi= _tuoi;
            this.diem= _diem;
        }

        void hien_thi(){
        System.out.println("ten: "+this.ten+";tuoi: "+this.tuoi+"diem: "+this.diem);
        }


        public void nhap_danh_sach(sinh_vien[] sv){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hoc sinh: ");
        n = sc.nextInt();
        int b;String a;Double c; 
        
        for (int i = 0; i<n ; i++)
        {
            System.out.println("nhap ten sinh vien: ");
            a = sc.nextLine();
            System.out.println("nhap tuoi sinh vien: ");
            b = sc.nextInt();
            System.out.println("nhap diem sinh vien: ");
            c = sc.nextDouble();
            
        }
        sc.close();
    }

    }
    
}
