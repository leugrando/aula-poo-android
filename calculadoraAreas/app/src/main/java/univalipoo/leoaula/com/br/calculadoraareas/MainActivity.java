package univalipoo.leoaula.com.br.calculadoraareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CALLBACK_LCA", "Método onpause da mainactivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CALLBACK_LCA", "Método onresume da mainactivity");
    }

    public void onClickCirculo(View v) {
        Intent intencaoAbrirCirculoResultado = new Intent(this.getApplicationContext(), passo1Circulo.class);
        this.startActivity(intencaoAbrirCirculoResultado);
    }

    public void onClickQuadrado(View v) {
        Intent intencaoAbrirQuadradoResultado = new Intent(this.getApplicationContext(), passo1Quadrado.class);
        this.startActivity(intencaoAbrirQuadradoResultado);

    }

    public void onClickTriangulo(View v) {
        Intent intencaoAbrirTrianguloResultado = new Intent(this.getApplicationContext(), passo1Triangulo.class);
        this.startActivity(intencaoAbrirTrianguloResultado);


    }
}

