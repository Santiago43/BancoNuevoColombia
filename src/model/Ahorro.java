package model;

import java.util.*;

/**
 * 
 */
public class Ahorro extends Cuenta {

    /**
     * Default constructor
     */
    public Ahorro() {
    }

    public Ahorro(long numeroCuenta, double monto, double interés) {
        super(numeroCuenta, monto);
        this.interés = interés;
    }

    /**
     * 
     */
    private double interés;

    /**
     * @return
     */
    public void generarIntereses() {
        this.monto=this.monto*(1+this.interés);

    }

}