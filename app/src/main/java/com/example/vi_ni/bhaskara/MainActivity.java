package com.example.vi_ni.bhaskara;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText edtA,edtB,edtC;
    private TextView txtDelta,txtRaiz1,txtRaiz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtC = findViewById(R.id.edtC);
        txtDelta = findViewById(R.id.txtDelta);
        txtRaiz1 = findViewById(R.id.txtRaiz1);
        txtRaiz2 = findViewById(R.id.txtRaiz2);

    }

    public void calcular(View view){
        double a = Double.parseDouble(edtA.getText().toString());
        double b = Double.parseDouble(edtB.getText().toString());
        double c = Double.parseDouble(edtC.getText().toString());
        double delta = Math.pow(b,2) - (4 * a * c);
        double x1;
        double x2;

        if (delta < 0){
            txtDelta.setText("Delta: " + String.valueOf(delta) +". Não possui raízes reais");
        }else{
            x1 = ((-b) + (Math.sqrt(delta))) / (2 * a);
            x2 = ((-b) - (Math.sqrt(delta))) / (2 * a);

            txtDelta.setText("Delta: "+String.valueOf(delta));
            txtRaiz1.setText("Raiz 1: "+ String.valueOf(x1));
            txtRaiz2.setText("Raiz 2: "+ String.valueOf(x2));
        }
    }
}
