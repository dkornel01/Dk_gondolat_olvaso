
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
        String[] pakli = new String[21];
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};
        int s = 0;
        int e = 0;
        int lap = 0;
        while (s < szinek.length) {
            while (e < ertekek.length) {
                pakli[lap] = szinek[s] + ertekek[e];
                if (s==3 && e==2){
                e=6;
                }
                //System.out.println(pakli[lap]);
                e++;
                lap++;
            }
            e = 0;
            s++;
        }
        int x=0;
        for (int y=0;y<7;y++){
            for (int i=0;i<3;i++){
                System.out.printf("%-8s",pakli[x]);
             x++;
            }
            System.out.println();
        }
        return pakli;
    }

    private static int Melyik() {
        int oszlop=1;
        boolean jo;
        do{
            System.out.print(("oszlop(1-3): "));
            oszlop = scr.nextInt();
            jo = oszlop>=1 && oszlop <=3;
        } while (!jo);
        return oszlop;
    }

    private static void EzVolt(int megoldas) {
        System.out.println(megoldas + " Ez a szam volt a megoldas");
    }

    private static void Kever(String[] pakli) {
        
    }
    
}
