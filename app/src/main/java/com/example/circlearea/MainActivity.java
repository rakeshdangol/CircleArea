package com.example.circlearea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn,btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,btneight,btnnine,btnadd,btndiv,btnmin,btnmul,btncalc,btncl;
    private TextView txtone,txttwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btnone = findViewById(R.id.btnone);
        btntwo = findViewById(R.id.btntwo);
        btnthree = findViewById(R.id.btnthree);
        btnfour = findViewById(R.id.btnfour);
        btnfive = findViewById(R.id.btnfive);
        btnsix = findViewById(R.id.btnsix);
        btnseven = findViewById(R.id.btnseven);
        btneight = findViewById(R.id.btneight);
        btnnine = findViewById(R.id.btnnine);
        btnadd = findViewById(R.id.btnadd);
        btnmin = findViewById(R.id.btnmin);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btncalc = findViewById(R.id.btn);
        btncl = findViewById(R.id.btncl);
        txtone = findViewById(R.id.txtone);
        txttwo = findViewById(R.id.txttwo);


    }
}
