/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_3;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Zyref
 */
public class Tugas_3 {
private String[] Nama = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Paijo"};
    
     private int[][] DataGAJI = {
         {101, 2000, 1000, 500, 200},
         {102, 1750, 900, 500, 200},
         {103, 2150, 1000, 300, 375},
         {104, 1500, 750, 600, 200},
         {105, 2500, 850, 500, 300},
         {106, 1500, 350, 450, 250},
         {107, 2000, 1000, 500, 200},
         {108, 1500, 1250, 500, 300},
         {109, 1000, 1000, 500, 200},
         {110, 2250, 1000, 200, 200}
     };

    public Tugas_3(int nik, String nama, int gajiPokok, int tunjangan, int bonus, int denda) {
        nik = nik;
        gajiPokok = gajiPokok;
        tunjangan = tunjangan;
        bonus = bonus;
        denda = denda;
        nama = nama;
    }

    public void Data() {
         System.out.println("   DATA KARYAWAN   ");
         System.out.println("--------------------------------");
         System.out.printf("%s %9s %17s %15s %12s %15s \n",
                 "Nik", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
         
         for (int a = 0; a < Nama.length; a++) {
             System.out.print(DataGAJI[a][0] + "\t");
             System.out.print(Nama[a] + "\t\t");
           
             for (int s = 1; s < 5; s++) {
                 System.out.print(DataGAJI[a][s] + "\t\t");
             }
             System.out.println();
         }
         System.out.println("\n");
     }

}
