import java.util.Scanner;

import static java.lang.Math.PI;

public class Bai8 {
    public static void main(String[] args){
        float r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh cua duong tron: ");
        r = sc.nextFloat();
        System.out.println("Chu vi la: "+ (2*PI*r));
        System.out.println("Dien tich cua hinh tron la: "+ (PI*r*r));
    }
}
