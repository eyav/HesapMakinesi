import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        double sayi1, sayi2, sonuc;
        int select;

        Scanner input= new Scanner(System.in);
        System.out.println("İlk sayiyi giriniz:");
        sayi1= input.nextDouble();
        System.out.println("İkinci sayiyi giriniz:");
        sayi2= input.nextDouble();
        System.out.println("Seçiminizi yapınız");
        select=input.nextInt();

        switch(select) {
            case 1:
                System.out.println("Toplama İşlemini Seçtiniz:");
                sonuc = sayi1 + sayi2;
                System.out.println("Toplam = " + sonuc);
                break;
            case 2:
                System.out.println("Çıkarma İşlemini Seçtiniz:");
                sonuc = sayi1 - sayi2;
                System.out.println("Çıkan Sonuç = " + sonuc);
                break;
            case 3:
                System.out.println("Bölme İşlemini Seçtiniz:");
                sonuc = sayi1 / sayi2;
                System.out.println("Bölüm = " + sonuc);
                break;
            case 4:
                System.out.println("Çarpma İşlemini Seçtiniz:");
                sonuc = sayi1 * sayi2;
                System.out.println("Çarpım = " + sonuc);
                break;
            default:
                System.out.println("Hatalı Komut girdiniz");
        }

    }
}
