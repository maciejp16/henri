package pl.teb;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarzywniakTest {

    @Test
    public void czyKupicJablka() {
        Warzywniak warzywniakNaUlicyMilej= new Warzywniak();
        assertEquals(warzywniakNaUlicyMilej.czyKupicJablka(11),"tak");
    }
    public void czyKupicJablka2() {
        Warzywniak warzywniakNaUlicyMilej= new Warzywniak();
        assertEquals(warzywniakNaUlicyMilej.czyKupicJablka(9),"nie");
    }
}