import java.util.Scanner;

public class Tuoi {
        public static void main(String[] args){
                int a,b;
                System.out.print("Nhap vao nam sinh cua ban: ");
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
                b = 2021 - a;
                System.out.print("Tuoi cua ban la: "+ b);
        }
}
