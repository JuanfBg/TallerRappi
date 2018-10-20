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
public class UnicaFila extends Fila {

    protected Queue<String> filaUnica = new LinkedList<>();
    private final Random r = new Random();

    @Override
    public void addClientes(int clientes) {
        for (int i = 0; i < clientes; i++) {
            filaUnica.add((char)( 97 + r.nextInt(25)) + "");
        }
    }

    @Override
    public boolean hayClientes() {
        return !filaUnica.isEmpty();
    }

    @Override
    public void remove() {
        filaUnica.poll();
    }

}
