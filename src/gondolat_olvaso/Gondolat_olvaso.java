
package gondolat_olvaso;

import java.util.Random;
import java.util.Scanner;


public class Gondolat_olvaso {

    static Scanner scr = new Scanner(System.in);
    static Random rnd=new Random();
    
    public static void main(String[] args) {
         // for(int i=0; i<3; i++){
        String[] pakli=Kirak();
        int megoldas = Melyik();
        Kever(pakli);
        //   }
        EzVolt(megoldas);
    }

    private static String[] Kirak() {
        String[] pakli = new String[24];
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};
        int s = 0;
        int e = 0;
        int lap = 0;
        while (s < szinek.length) {
            while (e < ertekek.length) {
                pakli[lap] = szinek[s] + ertekek[e];
                //System.out.println(pakli[lap]);
                e++;
                lap++;
            }
            e = 0;
            s++;
        }
        int x=0;
        for (int y=0;y<8;y++){
            for (int i=0;i<3;i++){
                System.out.printf("%-8s",pakli[x]);
             x++;
            }
            System.out.println();
        }
        return pakli;
    }

    private static int Melyik() {
        System.out.print("adj meg egy oszlopot 1-3: ");
        int valasztott = scr.nextInt();
        System.out.println("");
        return valasztott;
    }

    private static void EzVolt(int megoldas) {
        System.out.println(megoldas + " Ez a szam volt a megoldas");
    }

    private static void Kever(String[] pakli) {
        
    }
    
}
