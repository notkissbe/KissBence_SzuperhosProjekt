package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

abstract class Bosszuallo implements Szuperhos {
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Bosszuallo) {
            if (((Bosszuallo) szuperhos).vanEGyengesege && this.szuperero > szuperhos.mekkoraAzEreje()){
                return true;
            }
            return false;
        }
        if (szuperhos instanceof Batman){
            return this.szuperero >= 2 * szuperhos.mekkoraAzEreje();
        }

        return false;
    }

    public float getSzuperero() {
        return szuperero;
    }
    public void setSzuperero(float szuperero) {
        this.szuperero = szuperero;
    }
    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }
    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }


    @Override
    public String toString() {
        return MessageFormat.format("Szupererő: {0,number,#.##}; {1}", szuperero, vanEGyengesege? "van gyengesége" : "nincs gyengesége");
    }

}
