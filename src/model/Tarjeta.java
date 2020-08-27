package model;

import java.util.*;

/**
 * 
 */
public abstract class Tarjeta {

    /**
     * Default constructor
     */
    public Tarjeta() {
    }

    /**
     * 
     */
    protected long numero;

    /**
     * @param monto 
     * @return
     */
    public abstract boolean realizarCompra(double monto);

}