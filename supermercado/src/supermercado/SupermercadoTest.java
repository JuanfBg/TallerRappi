/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author jojstepersan
 */
public class SupermercadoTest {

    static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static Random r = new Random();
    static Fila fila;

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String s;
        System.out.println("1. seleccione tipo de fila\n1.1 unica fila\n1.2 multiples filas");
        s = in.readLine();
        if (s.equals("1")) {
            fila = new UnicaFila();
        } else if (s.equals("2")) {
            fila = new MultipleFila();
        }
        System.out.println("2. Ingrese el numero de cajas acvitvas");
        fila.setNumeroCajas(Integer.valueOf(in.readLine()));
        System.out.println("3. Ingrese tiempo de la simulacion");
        fila.setTiempo(Integer.valueOf(in.readLine()));
        System.out.println("4. Ingrese delta de tiempo");
        fila.setDelta(Integer.valueOf(in.readLine()));
        System.out.println("start simulation:");
        int suma=0;
        for (int i = 0; i < fila.getTiempo(); i++) {
            if (fila instanceof UnicaFila) {
                System.out.println(((UnicaFila)fila).filaUnica);
            }
            if (i == 0 || i % 3 == 0) {
                fila.addClientes(r.nextInt(5));
            }
            System.out.println(fila.hayClientes());
            if (fila.hayClientes()) {
                suma+=r.nextInt(21)+4;
                fila.remove();
            }
        }
        System.out.println(suma);

    }

}
