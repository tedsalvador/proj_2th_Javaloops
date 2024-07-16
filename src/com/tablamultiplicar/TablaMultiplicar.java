package com.tablamultiplicar;

import java.util.ArrayList;
import java.util.List;

public class TablaMultiplicar {

    public List<String> generarTabla(int numero) {
        List<String> tabla = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tabla.add(numero + " x " + i + " = " + (numero * i));
        }
        return tabla;
    }

    public static void main(String[] args) {
        TablaMultiplicar tm = new TablaMultiplicar();
        List<String> tabla = tm.generarTabla(5);
        for (String linea : tabla) {
            System.out.println(linea);
        }
    }
}
