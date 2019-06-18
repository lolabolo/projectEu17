/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler17;

/**
 *
 * @author Verosffy
 */
public class SzamokBetuk {
    private int ertek;
    private String nev;
    private int nevertek;

    public SzamokBetuk(int ertek, String nev) {
        this.ertek = ertek;
        this.nev = nev;
        this.nevertek = nev.length();
    }
    
    

    public int getErtek() {
        return ertek;
    }

    public void setErtek(int ertek) {
        this.ertek = ertek;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getNevertek() {
        return nevertek;
    }

    public void setNevertek(int nevertek) {
        this.nevertek = nevertek;
    }
    
    
    
}
