package com.arevalo.gastosapplication.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.arevalo.gastosapplication.R;

public class NewOperationActivity extends AppCompatActivity {

    private RadioGroup radioGrupoTipo;
    private RadioGroup radioGroupCuenta;

    private EditText monto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_operation);

        radioGrupoTipo=findViewById(R.id.radioGroupTipo);
        radioGroupCuenta=findViewById(R.id.radioGroupTipoCuenta);

        monto= findViewById(R.id.txtMonto);

    }

    public void callRegistter(View view) {
        String tipo = "";
        String tipoCuenta = "";
        if (radioGrupoTipo.getCheckedRadioButtonId() == R.id.radioButton3) {
            tipo = "Ingreso";
            if (radioGroupCuenta.getCheckedRadioButtonId() == R.id.radioButton5) {
                tipoCuenta = "Credito";
            }else if(radioGroupCuenta.getCheckedRadioButtonId() == R.id.radioButton6){
                tipoCuenta = "Ahorro";
            }else if(radioGroupCuenta.getCheckedRadioButtonId() == R.id.radioButton7){
                tipoCuenta = "Efectivo";
            }

        }else if(radioGrupoTipo.getCheckedRadioButtonId() == R.id.radioButton4){
            tipo = "Egreso";
            if (radioGroupCuenta.getCheckedRadioButtonId() == R.id.radioButton5) {
                tipoCuenta = "Credito";
            }else if(radioGroupCuenta.getCheckedRadioButtonId() == R.id.radioButton6){
                tipoCuenta = "Ahorro";
            }else if(radioGroupCuenta.getCheckedRadioButtonId() == R.id.radioButton7){
                tipoCuenta = "Efectivo";
            }
        }


        String m = monto.getText().toString();
        double montoIngresado = Double.parseDouble(m);

        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("monto",montoIngresado);
        intent.putExtra("tipo",tipo);
        intent.putExtra("tipoCuenta",tipoCuenta);
        startActivity(intent);
    }
}
