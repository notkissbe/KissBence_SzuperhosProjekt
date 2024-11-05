package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

abstract class Bosszzuallo implements Szuperhos {
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszzuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract Boolean megmentiAvilagot();

    @Override
    public Float mekkoraAzEreje() {
        //commit-test
        return szuperero;
    }

    @Override
    public Boolean legyoziE(Szuperhos szuperhos) {
        return null;
    }
}
