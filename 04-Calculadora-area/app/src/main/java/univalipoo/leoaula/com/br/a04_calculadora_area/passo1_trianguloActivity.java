package univalipoo.leoaula.com.br.a04_calculadora_area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class passo1_trianguloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passo1_triangulo2);
    }

    public void onClickAvancar(View v) {
        EditText etBase = findViewById(R.id.etBaseTriangulo);
        EditText etAltura = findViewById(R.id.etAlturaTriangulo);

        double base = Double.parseDouble(etBase.getText().toString());
        double altura = Double.parseDouble(etAltura.getText().toString());


        Intent intencaoAbrirTrianguloResultado = new Intent(this.getApplicationContext(), resultado_trianguloActivity.class);

        intencaoAbrirTrianguloResultado.putExtra("base", base);
        intencaoAbrirTrianguloResultado.putExtra("altura", altura);


        this.startActivity(intencaoAbrirTrianguloResultado);

    }
}
