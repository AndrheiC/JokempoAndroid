package com.example.andrhei.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void escolhaPedra(View view){
        this.opcaoEscolhida("pedra");

    }

    public void escolhaPapel(View view){
        this.opcaoEscolhida("papel");

    }

    public void escolhaTesoura(View view){
        this.opcaoEscolhida("tesoura");

    }

    public void opcaoEscolhida(String escolhaUser){

        ImageView imageResultado = findViewById(R.id.imageApp);
        TextView textResultado = findViewById(R.id.textResultado);

        String [] opcaoApp = {"pedra", "papel", "tesoura"};
        int i = new Random().nextInt(3);
        String escolhaApp = opcaoApp[i];

        switch (escolhaApp){
            case("pedra"):
                imageResultado.setImageResource(R.drawable.pedra);
            break;

            case("papel"):
                imageResultado.setImageResource(R.drawable.papel);
            break;

            case("tesoura"):
                imageResultado.setImageResource(R.drawable.tesoura);
            break;

        }

        if(
                (escolhaApp=="pedra" && escolhaUser=="tesoura")||
                (escolhaApp=="papel" && escolhaUser=="pedra")||
                (escolhaApp=="tesoura" && escolhaUser=="papel")
           ){

            textResultado.setText("Você Perdeu!");

        }else if (

                (escolhaUser=="pedra" && escolhaApp=="tesoura")||
                (escolhaUser=="papel" && escolhaApp=="pedra")||
                (escolhaUser=="tesoura" && escolhaApp=="papel")
                ){

            textResultado.setText("Você Venceu!");

        }else{
            textResultado.setText("Empatamos!");
        }

    }
}
