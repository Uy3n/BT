import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = sc.nextInt();
        System.out.print("Nhap so b: ");
        b = sc.nextInt();
        System.out.println("Tong cua 2 so la: "+ (a+b));
        System.out.println("Hieu cua 2 so la: "+ (a-b));
        System.out.println("Tich cua 2 so la: "+ (a*b));
        System.out.println("Thuong cua 2 so la: "+ (a/b));
    }
}
