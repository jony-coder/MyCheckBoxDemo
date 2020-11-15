package com.example.mycheckboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milk,sugar,honey;
    private Button order;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milk = (CheckBox)findViewById(R.id.milkCheckBoxId);
        sugar = (CheckBox)findViewById(R.id.sugarCheckBoxId);
        honey = (CheckBox)findViewById(R.id.honeyCheckBoxId);

        order = (Button)findViewById(R.id.orderButtonId);
        result = (TextView)findViewById(R.id.resultTextId);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                if(milk.isChecked()){
                    String value = milk.getText().toString();
                    stringBuilder.append(value+ " is ordered\n");
                }
                if(sugar.isChecked()){
                    String value = sugar.getText().toString();
                    stringBuilder.append(value+ " is ordered\n");
                }
                if(honey.isChecked()){
                    String value = honey.getText().toString();
                    stringBuilder.append(value+ " is ordered\n");
                }
                result.setText(stringBuilder);
            }
        });

    }
}