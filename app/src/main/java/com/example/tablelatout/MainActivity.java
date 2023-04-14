package com.example.tablelatout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero,suma,resta,multiplicar,dividir,igual;
    private TextView tv1,tv_valor1,tv_valor2,tv_signo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno= (Button) findViewById(R.id.b1);
        dos= (Button) findViewById(R.id.b2);
        tres= (Button) findViewById(R.id.b3);
        cuatro= (Button) findViewById(R.id.b4);
        cinco= (Button) findViewById(R.id.b5);
        seis= (Button) findViewById(R.id.b6);
        siete= (Button) findViewById(R.id.b7);
        ocho= (Button) findViewById(R.id.b8);
        nueve= (Button) findViewById(R.id.b9);
        cero= (Button) findViewById(R.id.b0);
        suma=(Button)findViewById(R.id.suma);
        tv1=(TextView) findViewById(R.id.tv1);
        resta=(Button)findViewById(R.id.resta);
        multiplicar=(Button)findViewById(R.id.multiplicar);
        dividir=(Button)findViewById(R.id.dividir);
        tv_valor1=(TextView) findViewById(R.id.tv_valor1);
        tv_valor2=(TextView) findViewById(R.id.tv_valor2);
        tv_signo=(TextView)findViewById(R.id.tv_signo);
        igual=(Button) findViewById(R.id.igual);

    }
    public void mostrar(View view){
        String resultado= tv1.getText().toString();
        String campo2= tv_valor2.getText().toString();

        if (resultado.equals("0")){
            resultado = "";

        }

        switch (view.getId()) {
            case R.id.b1:
                tv1.setText(resultado + "1");
                if(tv_signo.getText().equals("vacio")){
                    tv_valor1.setText( resultado +"1");
                }else{
                    tv_valor2.setText( campo2 + "1");

                }

                break;
            case R.id.b2:
                tv1.setText(resultado + "2");
                if(tv_signo.getText().equals("vacio")){
                    tv_valor1.setText( resultado +"2");
                }else{
                    tv_valor2.setText( campo2 + "2");

                }
                break;
            case R.id.b3:
                tv1.setText(resultado + "3");
                if(tv_signo.getText().equals("vacio")){
                    tv_valor1.setText( resultado +"3");
                }else{
                    tv_valor2.setText( campo2 + "3");

                }
                break;
            case R.id.b4:
                tv1.setText(resultado + "4");
                if(tv_signo.getText().equals("vacio")){
                    tv_valor1.setText( resultado +"4");
                }else{
                    tv_valor2.setText( campo2 + "4");

                }
                break;
            case R.id.b5:
                tv1.setText(resultado + "5");
                if(tv_signo.getText().equals("vacio")){
                    tv_valor1.setText( resultado +"5");
                }else{
                    tv_valor2.setText( campo2 + "5");

                }
                break;
            case R.id.b6:
                tv1.setText(resultado + "6");
                if(tv_signo.getText().equals("vacio")){
                    tv_valor1.setText( resultado +"6");
                }else{
                    tv_valor2.setText( campo2 + "6");

                }
                break;
            case R.id.b7:
                tv1.setText(resultado + "7");
                if(tv_signo.getText().equals("vacio")){
                    tv_valor1.setText( resultado +"7");
                }else{
                    tv_valor2.setText( campo2 + "7");

                }
                break;
            case R.id.b8:
                tv1.setText(resultado + "8");
                if(tv_signo.getText().equals("vacio")){
                    tv_valor1.setText( resultado +"8");
                }else{
                    tv_valor2.setText( campo2 + "8");

                }
                break;
            case R.id.b9:
                tv1.setText(resultado + "9");
                if(tv_signo.getText().equals("vacio")){
                    tv_valor1.setText( resultado +"9");
                }else{
                    tv_valor2.setText( campo2 + "9");

                }
                break;
            case R.id.b0:
                tv1.setText(resultado + "0");
                if(tv_signo.getText().equals("vacio")){
                    tv_valor1.setText( resultado +"0");
                }else{
                    tv_valor2.setText( campo2 + "0");

                }
                break;

            case R.id.suma:
                tv1.setText(resultado + "+");
                tv_signo.setText("+");
                break;
            case R.id.resta:
                tv1.setText(resultado + "-");
                tv_signo.setText("-");
                break;
            case R.id.multiplicar:
                tv1.setText(resultado + "*");
                tv_signo.setText("*");
                break;
            case R.id.dividir:
                tv1.setText(resultado + "/");
                tv_signo.setText("/");
                break;


        }
    }
    public void Restaurar(View view){

        tv1.setText("0");
        tv_valor1.setText("");
        tv_valor2.setText("");
        tv_signo.setText("vacio");
    }

    public void operar(View view){

        if(tv_signo.getText().equals("+")){
            String valor1_String= tv_valor1.getText().toString();
            String valor2_String= tv_valor2.getText().toString();

            int valor1_int= Integer.parseInt(valor1_String);
            int valor2_int= Integer.parseInt(valor2_String);

            int resultado_int= valor1_int + valor2_int;
            tv1.setText("=" +resultado_int);

        }
        if(tv_signo.getText().equals("-")){
            String valor1_String= tv_valor1.getText().toString();
            String valor2_String= tv_valor2.getText().toString();

            int valor1_int= Integer.parseInt(valor1_String);
            int valor2_int= Integer.parseInt(valor2_String);

            int resultado_int= valor1_int - valor2_int;
            tv1.setText("=" + resultado_int);

        }
        if(tv_signo.getText().equals("*")){
            String valor1_String= tv_valor1.getText().toString();
            String valor2_String= tv_valor2.getText().toString();

            int valor1_int= Integer.parseInt(valor1_String);
            int valor2_int= Integer.parseInt(valor2_String);

            int resultado_int= valor1_int * valor2_int;
            tv1.setText("=" + resultado_int);

        }
        if(tv_signo.getText().equals("/")){
            String valor1_String= tv_valor1.getText().toString();
            String valor2_String= tv_valor2.getText().toString();

            int valor1_int= Integer.parseInt(valor1_String);
            int valor2_int= Integer.parseInt(valor2_String);

            int resultado_int= valor1_int / valor2_int;
            tv1.setText("=" + resultado_int);

        }

    }


}