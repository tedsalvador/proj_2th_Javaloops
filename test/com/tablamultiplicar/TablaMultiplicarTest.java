
package com.tablamultiplicar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class TablaMultiplicarTest {

    @Test
    public void testGenerarTabla() {
        TablaMultiplicar tm = new TablaMultiplicar();
        List<String> tabla = tm.generarTabla(5);
        
        assertEquals(10, tabla.size());
        assertEquals("5 x 1 = 5", tabla.get(0));
        assertEquals("5 x 10 = 50", tabla.get(9));
        assertEquals("5 x 5 = 25", tabla.get(4));
    }
}
