import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int sl, dg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        String sp = sc.nextLine();
        System.out.print("Nhap so luong: ");
        sl = sc.nextInt();
        System.out.print("Nhap don gia cua "+ sp + ": ");
        dg = sc.nextInt();
        System.out.println("So tien phai tra la: "+ (sl*dg));
        System.out.println("Thue gia tri gia tang = "+(10*sl*dg/100));
    }
}
