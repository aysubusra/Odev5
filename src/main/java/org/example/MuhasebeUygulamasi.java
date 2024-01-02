package org.example;
import java.util.Scanner;

public class MuhasebeUygulamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maas, calismaGunSayisi, mesaiGunSayisi, mesaiUcreti = 0, toplamMaas;

        System.out.println("Personelin bu ay içinde çalıştığı gün sayısını giriniz: ");
        calismaGunSayisi = input.nextInt();

        System.out.println("Personelin net maaş bilgisini giriniz: ");
        maas = input.nextInt();

        mesaiGunSayisi = Math.max(0, calismaGunSayisi - 25); // Negatif değerleri sıfıra çevirmek için.

        for (int i = 0; i < mesaiGunSayisi; i++) {
            mesaiUcreti += 1000; // Her mesai günü için 1000 TL eklenir.
        }

        toplamMaas = maas + mesaiUcreti;

        System.out.println("Net Maaş: " + maas);
        System.out.println("Fazla çalışılan gün sayısı: " + mesaiGunSayisi);
        System.out.println("Mesai Ücreti: " + mesaiUcreti);
        System.out.println("Toplam Ödenecek Maaş: " + toplamMaas);

        // Scanner'ı kapatır.
        input.close();
    }
}