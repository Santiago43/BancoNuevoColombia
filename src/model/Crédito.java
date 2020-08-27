package model;

import java.util.*;

/**
 * 
 */
public class Crédito extends Tarjeta {

    /**
     * Default constructor
     */
    public Crédito() {
    }

    /**
     * 
     */
    private double gasto;

    /**
     * 
     */
    private double cupo;

    /**
     * @return
     */
    public double consultarCupo() {

        return cupo;
    }

    /**
     * @return
     */
    public double consultarGasto() {
        // TODO implement here
        return gasto;
    }

    /**
     * @return
     */
    public double pagarTarjeta(double monto) {
        this.cupo+=monto;
        this.gasto-=monto;
        return monto;
    }

    /**
     * @param monto 
     * @return
     */
    public boolean realizarCompra(double monto){
        if(monto>this.cupo){
            return false;
        }else{
            this.cupo-=monto;
            this.gasto+=monto;
            return true;
        }
    }

}