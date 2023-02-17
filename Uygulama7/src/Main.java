import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        double armutKg;
        double elmaKg;
        double domatesKg;
        double muzKg;
        double patlicanKg;
        double total;
        Scanner scan = new Scanner(System.in);
        System.out.print("Aldığınız armutun kilogramını giriniz : ");
        armutKg = scan.nextDouble();
        System.out.print("Aldığınız elmanın kilogramını giriniz : ");
        elmaKg = scan.nextDouble();
        System.out.print("Aldığınız domatesin kilogramını giriniz : ");
        domatesKg = scan.nextDouble();
        System.out.print("Aldığınız muzun kilogramını giriniz : ");
        muzKg = scan.nextDouble();
        System.out.print("Aldığınız patlıcanın kilogramını giriniz : ");
        patlicanKg = scan.nextDouble();
        total = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
        System.out.println("Toplam tutar : " + total);
    }
}