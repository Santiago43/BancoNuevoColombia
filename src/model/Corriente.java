package model;

import java.util.*;

/**
 * 
 */
public class Corriente extends Cuenta {

    /**
     * Default constructor
     */
    public Corriente() {
    }

    public Corriente(long numeroCuenta, double monto) {
        this.numeroCuenta=numeroCuenta;
        if(monto<MONTO_INICIAL){
            this.monto=0;
        }
        else{
            this.monto=monto;
        }
    }

    /**
     * 
     */
    public static double MONTO_INICIAL=3000;

    /**
     * @param monto
     * @return
     */
    @Override
    public boolean consignarDinero(double monto) {
        if((this.monto+monto)<MONTO_INICIAL){
            return false;
        }else{
            return super.consignarDinero(monto);
        }
    }
}