package univalipoo.leoaula.com.br.a04_calculadoraarea;

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
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void onClickCirculo(View v) {
        Intent intencaoAbrirCirculoResultado = new Intent(this.getApplicationContext(), passo1_circulo.class);
        this.startActivity(intencaoAbrirCirculoResultado);
    }

    public void onClickQuadrado(View v) {
        Intent intencaoAbrirQuadradoResultado = new Intent(this.getApplicationContext(), passo1_quadrado.class);
        this.startActivity(intencaoAbrirQuadradoResultado);

    }

    public void onClickTriangulo(View v) {
        Intent intencaoAbrirTrianguloResultado = new Intent(this.getApplicationContext(), passo1_triangulo.class);
        this.startActivity(intencaoAbrirTrianguloResultado);


    }
}
