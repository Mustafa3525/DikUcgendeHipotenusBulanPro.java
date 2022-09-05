import java.util.Scanner;
public class DıkUcgendeHipotenusBulanPro {
    public static void main(String[] args) {

        int kisaKenar, uzunKenar;
        double hipotenus , alan, taban ,yukseklik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kısa Kenarı Giriniz : ");
        kisaKenar = inp.nextInt();
        System.out.print("Uzun Kenarı Giriniz : ");
        uzunKenar = inp.nextInt();

        hipotenus = Math.sqrt((kisaKenar * kisaKenar )+ (uzunKenar *uzunKenar));
        System.out.println("Hipotenüs Değeri : " + hipotenus);

        System.out.print("Taban Değerini Giriniz : ");
        taban = inp.nextInt();
        System.out.print("Yükseklik Değerini Giriniz : ");
        yukseklik = inp.nextInt();

        alan = ((taban * yukseklik)/2);
        System.out.print("Ücgenin Alanı : " + alan );


    }
}
