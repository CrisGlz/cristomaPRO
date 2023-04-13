package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        txtResultado  = findViewById(R.id.txtResultado);

        TableLayout tl = (TableLayout) findViewById(R.id.tablelayaout);
        for (int i = 0; i <tl.getChildCount(); i++) {
            TableRow tr = (TableRow) tl.getChildAt(i);
            for (int j = 0; j <tr.getChildCount(); j++) {
                Button b = (Button) tr.getChildAt(j);
                b.setText(""+i+"."+j);
        }

    }


    }


}