package model;

import java.util.*;

/**
 * 
 */
public abstract class Cuenta {

    /**
     * Default constructor
     */
    public Cuenta() {
    }

    public Cuenta(long numeroCuenta, double monto) {
        this.numeroCuenta = numeroCuenta;
        this.monto = monto;
    }

    /**
     * 
     */
    protected long numeroCuenta;

    /**
     * 
     */
    protected double monto;


    /**
     * @param monto 
     * @return
     */
    public boolean consignarDinero(double monto) {
        if(monto<0)
            return false;
        this.monto +=monto;
        return true;
    }

    /**
     * @param monto 
     * @return
     */
    public boolean retirarDinero(double monto) {
        if(monto>this.monto){
            return false;
        }
        this.monto-=monto;
        return true;
    }

    /**
     * @return
     */
    public double consultarSaldo() {

        return this.monto;
    }

    /**
     * @param monto 
     * @param cuenta 
     * @return
     */
    public boolean transferirAOtraCuenta(double monto, Cuenta cuenta) {
        if(this.retirarDinero(monto)){
            cuenta.consignarDinero(monto);
            return true;
        }
        return false;
    }

}