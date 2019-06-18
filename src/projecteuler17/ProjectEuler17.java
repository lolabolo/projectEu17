/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler17;

import java.util.ArrayList;

/**
 *
 * @author Verosffy
 */
public class ProjectEuler17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SzamokBetuk one=new SzamokBetuk(1, "one");
       SzamokBetuk two=new SzamokBetuk(2, "two");
       SzamokBetuk three=new SzamokBetuk(3, "three");
       SzamokBetuk four=new SzamokBetuk(4, "four");
       SzamokBetuk five=new SzamokBetuk(5, "five");
       SzamokBetuk six=new SzamokBetuk(6, "six");
       SzamokBetuk seven=new SzamokBetuk(7, "seven");
       SzamokBetuk eight=new SzamokBetuk(8, "eight");
       SzamokBetuk nine=new SzamokBetuk(9, "nine");
       SzamokBetuk ten=new SzamokBetuk(10, "ten");
       SzamokBetuk eleven=new SzamokBetuk(11, "eleven");
       SzamokBetuk twelve=new SzamokBetuk(12, "twelve");
       ArrayList<SzamokBetuk>betulista=new ArrayList<SzamokBetuk>();
       betulista.add(one);
       betulista.add(two);
       betulista.add(three);
       betulista.add(four);
       betulista.add(five);
       betulista.add(six);
       betulista.add(seven);
       betulista.add(eight);
       betulista.add(nine);
       betulista.add(ten);
       betulista.add(eleven);
       betulista.add(twelve);
        for (int i = 14; i < 20; i++) {
            int vegszam=i-10;
            String nev=betulista.get(vegszam).getNev()+"teen";
            SzamokBetuk uj=new SzamokBetuk(i, nev);
            betulista.add(uj);
            
        }
        for (SzamokBetuk szamokBetuk : betulista) {
            System.out.println(szamokBetuk.getErtek());
        }
       
    }
    
}
