package model;

import java.util.*;

/**
 * 
 */
public class Débito extends Tarjeta {

    /**
     * Default constructor
     */
    public Débito(Cuenta cuenta) {
        this.cuenta=cuenta;
    }

    /**
     * 
     */
    private Cuenta cuenta;


    /**
     * @param monto 
     * @return
     */
    public boolean realizarCompra(double monto){
        if(cuenta.retirarDinero(monto)){
            return true;
        }
        else{
            return false;
        }
    }

}