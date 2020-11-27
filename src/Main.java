/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: menghitung gradien garis lurus
 * anime Naruto berbasis OOP dan implementasi pewarisan dan abstrak.
 */

public class Main {
   public static void main(String[] args) {
       Koordinat koordinat = new Koordinat(2, 10, 5, 7);
       System.out.println("Garis yang melalui titik " + "(" + koordinat.getX1() + "," +
               koordinat.getY1() + ")" + " dan " + koordinat.getX2() + "," + koordinat.getY2() +
               ")" + " memiliki gradien sebesar " + koordinat.hitungGradien());

       Koordinat koordinat1 = new Koordinat(5, 1, 3, 12);
       System.out.println("Garis yang melalui titik " + "(" + koordinat1.getX1() + "," +
               koordinat1.getY1() + ")" + " dan " + "(" + koordinat1.getX2() + "," + koordinat1.getY2() +
               ")" + " memiliki gradien sebesar " + koordinat1.hitungGradien());

   }
}
