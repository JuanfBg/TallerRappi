/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author jojstepersan
 */
public class MultipleFila extends Fila {

    static int x=0;
    protected Queue<String> filaMultiple[] = new LinkedList[numeroCajas];
    private final Random r = new Random();

    public MultipleFila() {
    }

    @Override
    public void addClientes(int clientes) {
        for (int i = 0; i < clientes; i++) {
            int fila = filaMenosClientes();
            filaMultiple[fila].add((char) (97 + r.nextInt(25)) + "");
        }
    }

    private int filaMenosClientes() {
        int x = Integer.MAX_VALUE;
        int pos=0;
        for (int i = 0; i < filaMultiple.length; i++) {
            if (filaMultiple[i].size() < x) {
                pos = i;
                x=filaMultiple[i].size();
            }
        }
        return pos;
    }

    @Override
    public void setNumeroCajas(int numeroCajas) {
        this.numeroCajas = numeroCajas;
        filaMultiple = new LinkedList[numeroCajas];// super.setNumeroCajas(numeroCajas); //To change body of generated methods, choose Tools | Templates
        for (int i = 0; i < numeroCajas; i++) {
            filaMultiple[i]=new LinkedList<>();
        }
    }

    @Override
    public boolean hayClientes() {
        for (int i = 0; i < filaMultiple.length; i++) {
            if(filaMultiple[i].isEmpty())
                return false;
        }
        return true;
    }

    @Override
    public void remove() {
        filaMultiple[x].poll();
        x++;
        x%=numeroCajas;
    }

}
