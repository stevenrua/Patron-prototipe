package com.stevenrj.model;

import com.stevenrj.inter.ICuenta;

public class CuentaAHImpl implements ICuenta {
    private String tipo;
    private double monto;

    public CuentaAHImpl(){
        tipo = "AHORRO";
    }
    @Override
    public ICuenta clonar() {
        CuentaAHImpl cuenta = null;
        try {
            cuenta = (CuentaAHImpl) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cuenta;
    }

   /* @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }*/

    @Override
    public String toString() {
        return "CuentaAHImpl{" +
                "tipo='" + tipo + '\'' +
                ", monto=" + monto +
                '}';
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
