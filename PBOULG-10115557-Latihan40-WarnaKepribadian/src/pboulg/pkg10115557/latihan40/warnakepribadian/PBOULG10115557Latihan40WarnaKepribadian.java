/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboulg.pkg10115557.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Rayan
 * KELAS    : PBO-Ulg
 * NIM      : 10115557
 * Deskripsi Program : Membuat program Nilai Warna Kepribadian berbasis object
 */
public class PBOULG10115557Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String warnaMu;
        String namaMu;
        Warna warni = new Warna();
        Scanner scn = new Scanner(System.in);

        System.out.print(warni.ANSI_RED + "YUK "
                + warni.ANSI_RESET);
        System.out.print(warni.ANSI_GREEN + "CEK "
                + warni.ANSI_RESET);
        System.out.print(warni.ANSI_YELLOW + "KEPRIBADIANMU "
                + warni.ANSI_RESET);
        System.out.print(warni.ANSI_CYAN + "DARI "
                + warni.ANSI_RESET);
        System.out.print(warni.ANSI_PURPLE + "WARNA "
                + warni.ANSI_RESET);
        System.out.print(warni.ANSI_BLUE + "FAVORITMU "
                + warni.ANSI_RESET + "\n");

        System.out.print("\n" + warni.ANSI_RED_BACKGROUND + warni.ANSI_WHITE
                + "\t MERAH \t\t\n" + warni.ANSI_RESET);
        System.out.print(warni.ANSI_GREEN_BACKGROUND + warni.ANSI_WHITE
                + "\t HIJAU \t\t\n" + warni.ANSI_RESET);
        System.out.print(warni.ANSI_YELLOW_BACKGROUND + warni.ANSI_WHITE
                + "\t KUNING \t\n" + warni.ANSI_RESET);
        System.out.print(warni.ANSI_BLUE_BACKGROUND + warni.ANSI_WHITE
                + "\t BIRU \t\t\n" + warni.ANSI_RESET);
        System.out.print(warni.ANSI_PURPLE_BACKGROUND + warni.ANSI_WHITE
                + "\t UNGU \t\t\n\n" + warni.ANSI_RESET);

        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaMu = scn.next();
        System.out.print("NAMA KAMU : ");
        namaMu = scn.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + namaMu.toUpperCase() + "====");
        warni.hasilWarna(warnaMu);
    }
    
}
