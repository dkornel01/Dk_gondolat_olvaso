
package gondolat_olvaso;

import java.util.Scanner;


public class Gondolat_olvaso {
        
    static Scanner scr = new Scanner(System.in);
    static String[] pakli = new String[22];
    static String[] lehet = new String[7];
    
    public static void main(String[] args) {
        int oszlop=0;

        Kirak();
        for (int kor=0;kor<3;kor++){
        oszlop = Melyik();
        String[] tarto=new String[22];
        tarto=toltes(tarto,pakli);
        Kever(oszlop,pakli,tarto);
        kiiras(pakli);
        }
        EzVolt(pakli);
    }

    private static void Kirak() {
        
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};
        int i=1;
        for (String szin:szinek){
            for (int o=0;i<22 && o<ertekek.length;o++){
                pakli[i++]=szin+"_"+ertekek[o];
            }
        }
        kiiras(pakli);
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

    private static void EzVolt(String[] pakli) {
        System.out.println("ez volt a lap: "+ pakli[11]);
    }

    private static void Kever(int oszlop,String[] pakli,String[] tarto) {
        switch(oszlop){
            case(1): 
                kiiras(tarto);
                for (int i = 1; i < 8; i++) {
                pakli[i] = tarto[20-(i-1)*3];
                pakli[i+7] = tarto[19-(i-1)*3];
                pakli[i+14] = tarto[21-(i-1)*3];
                //kiiras(pakli);
                //System.out.println("hiba");
                }
                kiiras(tarto);
                break;
        case(2): 
                for (int i = 1; i < 8; i++) {
                pakli[i] = tarto[19-(i-1)*3];
                pakli[i+7] = tarto[20-(i-1)*3];
                pakli[i+14] = tarto[21-(i-1)*3];
                }
                break;
        case (3):
                for (int i = 1; i < 8; i++) {
                pakli[i] = tarto[20-(i-1)*3];
                pakli[i+7] = tarto[21-(i-1)*3];
                pakli[i+14] = tarto[19-(i-1)*3];
                }
                break;
            }
            
        }
        private static void kiiras(String[] paklik){
            int x=1;
            for (int y=0; y<7; y++){
                for (int i=0;i<3;i++){
                    System.out.printf("%-8s",paklik[x]);
                 x++;
                }
                System.out.println("");
            }
            System.out.println("-----------");
        }    

    private static String[] toltes(String[] tarto, String[] pakli) {
        int x=0;
        while (x!=pakli.length){
            tarto[x]=pakli[x];
            x++;
        }
        return tarto;
    }
}
    

