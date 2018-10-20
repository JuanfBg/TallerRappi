/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author jojstepersan
 */
public abstract class Fila {

    protected int numeroCajas;
    protected int tiempo;
    protected int delta;

    public abstract void addClientes(int clientes);

    public int getNumeroCajas() {
        return numeroCajas;
    }

    public void setNumeroCajas(int numeroCajas) {
        this.numeroCajas = numeroCajas;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
    public abstract boolean hayClientes();
    
    public abstract void remove();
}
