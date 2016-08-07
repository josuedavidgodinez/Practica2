package com.example.josue.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button suma=(Button) findViewById(R.id.button);
        Button multiplicacion =(Button) findViewById(R.id.button2);
        Button resta =(Button) findViewById(R.id.button3);
        Button division =(Button) findViewById(R.id.button4);
        final EditText n1=(EditText) findViewById(R.id.editText);
        final EditText n2=(EditText) findViewById(R.id.editText2);
        res=(TextView) findViewById(R.id.textView3);
        suma.setOnClicklistener(new View.OnClickListener(){
                                    @Override
                                    public void OnClick(View v){

                                        Double no1 = Double.parseDouble(n1.getText().toString());
                                        Double no2 = Double.parseDouble(n2.getText().toString());
Double total = no1+no2;
                                        String r= String.valueOf(total);
                                        res.setText(r);
                                    }


                                }





        );
        resta.setOnClicklistener(new View.OnClickListener(){
                                    @Override
                                    public void OnClick(View v){

                                        Double no1 = Double.parseDouble(n1.getText().toString());
                                        Double no2 = Double.parseDouble(n2.getText().toString());
                                        Double total = no1-no2;
                                        String r= String.valueOf(total);
                                        res.setText(r);
                                    }


                                }





        );

        division.setOnClicklistener(new View.OnClickListener(){
                                    @Override
                                    public void OnClick(View v){

                                        Double no1 = Double.parseDouble(n1.getText().toString());
                                        Double no2 = Double.parseDouble(n2.getText().toString());
                                        Double total = no1/no2;
                                        String r= String.valueOf(total);
                                        res.setText(r);
                                    }


                                }





        );
        multiplicacion.setOnClicklistener(new View.OnClickListener(){
                                    @Override
                                    public void OnClick(View v){

                                        Double no1 = Double.parseDouble(n1.getText().toString());
                                        Double no2 = Double.parseDouble(n2.getText().toString());
                                        Double total = no1+no2;
                                        String r= String.valueOf(total);
                                        res.setText(r);
                                    }


                                }





        );

    }




}
