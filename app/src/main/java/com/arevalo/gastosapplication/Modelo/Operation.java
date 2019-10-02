package com.arevalo.gastosapplication.Modelo;

public class Operation {

    private String tipo, tipoCuenta;
    private double monto;

    public Operation() {
    }

    public Operation(String tipo, String tipoCuenta, double monto) {
        this.tipo = tipo;
        this.tipoCuenta = tipoCuenta;
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
