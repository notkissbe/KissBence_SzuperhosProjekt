package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;
import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {
    public Vasember() {
        super(150, true);
    }
    public void kutyutKeszit(){
        Random random = new Random();
        setSzuperero(getSzuperero() + random.nextFloat(0,10));
    }
    public boolean megmentiAVilagot(){
        if (getSzuperero() > 1000){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return MessageFormat.format("Vasember: Szupererő: {0,number,#.##}; {1}", getSzuperero(), isVanEGyengesege()? "van gyengesége" : "nincs gyengesége");
    }
}

/*Interfacek – Szuperhős
Oldal 2
5. Írj egy Vasember osztályt, ami a Bosszuallo leszármazottja, és megvalósítja a
Milliardos interfészt.
▪ Az osztálynak egy default konstruktora legyen, ami beállítja a Vasember
tulajdonságait. A Vasember szuperereje 150, és van gyengesége.
▪ Ha a Vasember kütyüt készít, akkor szuperereje nőjön ereje egy 0-10 közötti
véletlenszerű lebegőpontos számmal.
▪ A Vasember akkor menti meg a világot, ha a szuperereje nagyobb, mint 1000.
▪ Az osztály legyen továbbá szöveges formára alakítható. Az adattagok értékein
kívül írja ki azt is, hogy a Vasemberről van szó.*/