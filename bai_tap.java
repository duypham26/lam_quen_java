/*
 3. Bài tập câu lệnh điều kiện if/else

Kiểm tra một số là chẵn hay lẻ.

Kiểm tra số nhập vào là số dương, âm hay bằng 0.

Tính điểm trung bình 3 môn → xếp loại (Giỏi, Khá, Trung bình, Yếu).

4. Bài tập vòng lặp

In ra các số từ 1 đến 10.

In bảng cửu chương.

Tính tổng các số từ 1 đến n.

Tính giai thừa của một số n.

5. Bài tập với mảng

Nhập vào một mảng số nguyên, in ra các phần tử.

Tìm số lớn nhất/nhỏ nhất trong mảng.

Tính tổng các phần tử trong mảng.

Đếm xem có bao nhiêu số chẵn, bao nhiêu số lẻ trong mảng.

6. Bài tập nâng cao hơn một chút

Viết chương trình quản lý sinh viên đơn giản: nhập tên, tuổi, điểm rồi in danh sách.

Viết game đoán số: máy chọn ngẫu nhiên số từ 1–100, người chơi đoán cho đến khi đúng.

Viết chương trình quản lý danh bạ (tên + số điện thoại) bằng mảng.
 */
import java.util.Scanner;
public class bai_tap {
    //bai tap co ban
    public static void check_chan_le(int x)
    {
        if ( x==0 ) System.out.println("so 0");
        else 
        {
            if ( x % 2 == 0) System.out.println("so chan");
            else System.out.println("so le");
        }
    } 
    public static void check_am_duong(int x)
    {
        if ( x==0 ) System.out.println("so 0");
        else 
        {
            if ( x < 0) System.out.println("so am");
            else System.out.println("so duong");
        }
    } 
    public static float trung_binh_3(int x,int y,int z)
    {
        float r = (x+y+z)/3;
        return (r%2f);
    }
    //bai tap if/else
    public static void in_tu_1_toi_10()
    {
        for (int i =1; i<=10;i++)
        System.out.print(i+" ");
        System.out.println();
    }
    public static void bang_cuu_chuong()
    {
        for (int i =2; i<10;i++)
        {
            for (int j =1;j<=10;j++)
            {
                System.out.println(i +" x "+j+" = "+ i*j);
            }
            System.out.println();
        }
    }
    public static void tong_tu_1_toi_n(double n)
    {
        double tong = n*((n+1)/2);
        int b = (int)tong;
        System.out.println(b);
    }
    public static int giai_thua(int n)
    {
        if (n == 0) return 1;
        else return n * giai_thua(n-1);
    }
    public static int giai_thua_(int n)
    {
        int kq = 1;
        if (n == 0) return 1;
        else{
        for (int i = 1; i<=n; i++)
        {
            kq = kq*i;       
        }
        return kq;
    }
    }
    public static void main(String[] abc)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap x vao: ");
        int x = sc.nextInt();
        System.out.println(giai_thua_(x));;
        sc.close();
    }
    
}
 