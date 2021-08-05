import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen a: ");
        a = sc.nextInt();
        System.out.print("Nhap vao so nguyen b: ");
        b = sc.nextInt();
        if(a>b){
            System.out.println("Max la "+a);
            System.out.println("Min la "+b);
        } else if (a<b){
                System.out.println("Max la "+b);
                System.out.println("Min la "+a);
        } else {
            System.out.println("a = b");
        }
    }
}
