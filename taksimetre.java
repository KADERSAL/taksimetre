/* TAKSİMETRE başlangıç 10 tl her km için 2.20
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır. */

import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        double km, tutar;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Gidilen yolu kilometre cinsinden giriniz: ");
        km = girdi.nextDouble();
        tutar = 10 + (km*2.20);
        System.out.println(tutar< 20 ? "Tutar = 20 TL" : "Tutar = " +tutar);
    }
}
