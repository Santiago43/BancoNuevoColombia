package model;

import java.util.*;

/**
 * 
 */
public class Préstamo {

    /**
     * Default constructor
     */
    public Préstamo() {
    }

    public Préstamo(long id, double monto, double interés, int mesesPorPagar, double cuota) {
        this.id = id;
        this.monto = monto;
        this.interés = interés;
        this.mesesPorPagar = mesesPorPagar;
        this.cuota = cuota;
    }

    /**
     * 
     */
    private long id;

    /**
     * 
     */
    private double monto;

    /**
     * 
     */
    private double interés;

    /**
     * 
     */
    private int mesesPorPagar;

    /**
     * 
     */
    private double cuota;

}