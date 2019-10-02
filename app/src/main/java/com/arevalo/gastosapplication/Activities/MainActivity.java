package com.arevalo.gastosapplication.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.arevalo.gastosapplication.Modelo.Operation;
import com.arevalo.gastosapplication.R;
import com.arevalo.gastosapplication.Repositories.Repository;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;

    TextView sumAhorro,sumCredito,sumEfectivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumAhorro = findViewById(R.id.totalAhorro);
        sumCredito=findViewById(R.id.totalCredito);
        sumEfectivo = findViewById(R.id.totalEfectivo);

        double sAhorro = Repository.sumaAhorro();
        double sCredito = Repository.sumaCredito();
        double sEfectivo= Repository.sumaEfectivo();
        String ahorro = String.valueOf(sAhorro);
        String credito = String.valueOf(sCredito);
        String efectivo = String.valueOf(sEfectivo);


        sumAhorro.setText(ahorro);
        sumCredito.setText(credito);
        sumEfectivo.setText(efectivo);


        if(getIntent().getExtras() != null){
            String tipo = getIntent().getExtras().getString("tipo");
            String tipoCuenta = getIntent().getExtras().getString("tipoCuenta");
            double monto = getIntent().getExtras().getDouble("monto");

            Operation g = new Operation(tipo,tipoCuenta,monto);
            Repository.registrar(g);
        }

        progressBar=findViewById(R.id.progressBar);
        progressBar.setProgress(50);
    }

    public void callAdd(View view) {
        Intent intent = new Intent(this,NewOperationActivity.class);
        startActivity(intent);
    }
}
