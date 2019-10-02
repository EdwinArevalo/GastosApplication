package com.arevalo.gastosapplication.Repositories;

import com.arevalo.gastosapplication.Modelo.Operation;

import java.util.ArrayList;
import java.util.List;

public class Repository extends Operation {

    private static List<Operation> gastos;

    static {
        gastos = new ArrayList<>();
        gastos.add( new Operation("Ingreso","Ahorro",1200) );
    }

    public static void registrar(Operation gasto){
        gastos.add(gasto);
    }

    public static double sumaAhorro(){
        double monto = 0;
        for (int i=0; i < gastos.size();i++){
            if (gastos.get(i).getTipoCuenta().equals("Ahorro")){
                monto = monto + gastos.get(i).getMonto();
            }
        }
        return monto;
    }

    public static double sumaCredito(){
        double monto = 0;
        for (int i=0; i < gastos.size();i++){
            if (gastos.get(i).getTipoCuenta().equals("Credito")){
                monto = monto + gastos.get(i).getMonto();
            }
        }
        return monto;
    }

    public static double sumaEfectivo(){
        double monto = 0;
        for (int i=0; i < gastos.size();i++){
            if (gastos.get(i).getTipoCuenta().equals("Efectivo")){
                monto = monto + gastos.get(i).getMonto();
            }
        }
        return monto;
    }


}
