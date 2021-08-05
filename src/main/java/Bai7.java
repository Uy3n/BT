import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args){
        float dt,dl,dh,t,l,h,tb;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem mon toan: ");
        dt = sc.nextFloat();
        System.out.print("Nhap he so mon toan: ");
        t = sc.nextFloat();
        System.out.print("Nhap diem mon li: ");
        dl = sc.nextFloat();
        System.out.print("Nhap he so mon li: ");
        l = sc.nextFloat();
        System.out.print("Nhap diem mon hoa: ");
        dh = sc.nextFloat();
        System.out.print("Nhap he so mon hoa: ");
        h = sc.nextFloat();
        tb = ((dt*t)+(dl*l)+(dh*h))/(t+l+h);
        System.out.println("Diem trung binh cua hoc sinh do la: "+ tb);
    }
}
