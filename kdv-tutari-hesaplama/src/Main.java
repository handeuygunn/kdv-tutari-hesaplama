import java.util.Scanner;

public class Main {

    public static void main (String[]  args) {
        // değişkenini oluştur

        double fiyat;

        Scanner input = new Scanner(System.in);
        // Kullanıcıdan değerleri al
         System.out.println("Urun fiyatini giriniz:");
         fiyat = input.nextDouble();

         double sonuc = fiyat+ (fiyat*18)/100;
         System.out.println("Kdv'li urun fiyati:"+ sonuc);



    }
}

