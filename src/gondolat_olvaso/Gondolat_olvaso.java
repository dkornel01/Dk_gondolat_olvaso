
package gondolat_olvaso;

import java.util.Scanner;


public class Gondolat_olvaso {
  static   String[] pakli = new String[22];
    static Scanner scr = new Scanner(System.in);
    
    public static void main(String[] args) {
         // for(int i=0; i<3; i++){
        Kirak();
        int megoldas = Melyik();
        Kever(megoldas);
        //   }
        int x=0;
         for (int y=0; y<7; y++){
            for (int i=0;i<3;i++){
                System.out.printf("%-8s",pakli[x]);
             x++;
            }
            System.out.println();
        }
        EzVolt(megoldas);
    }

    private static String[] Kirak() {
      
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};
        int i=0;
        for (String szin:szinek){
            for (int o=0;i<22 && o<ertekek.length;o++){
                pakli[i++]=szin+"_"+ertekek[o];
            }
        }
        int x=0;
        for (int y=0; y<7; y++){
            for (int k=0;k<3;k++){
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

    private static void Kever(int oszlop) {
        String[] paklik=pakli;
        switch(oszlop){
            case(1): 
                for (int i = 1; i < 7; i++) {
                pakli[i] = paklik[20-(i-1)*3];
                pakli[i+7] = paklik[19-(i-1)*3];
                pakli[i+14] = paklik[21-(i-1)*3];
                    
                }
        case(2): 
        for (int i = 1; i < 7; i++) {
                pakli[i] = paklik[19-(i-1)*3];
                pakli[i+7] = paklik[20-(i-1)*3];
                pakli[i+14] = paklik[21-(i-1)*3];
                }
        case (3):
            for (int i = 1; i < 7; i++) {
                pakli[i] = paklik[21-(i-1)*3];
                pakli[i+7] = paklik[20-(i-1)*3];
                pakli[i+14] = paklik[19-(i-1)*3];
                }
            }
            
        }    
    }
    

