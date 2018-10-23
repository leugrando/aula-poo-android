package univalipoo.leoaula.com.br.a04_calculadoraarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class passo1_quadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passo1_quadrado);
    }
    public void onClickAvancar(View v){
        EditText etLado = findViewById(R.id.etLadoQuadrado);

        double lado = Double.parseDouble(etLado.getText().toString());



        Intent intencaoAbrirQuadradoResultado = new Intent(this.getApplicationContext(), resultado_quadrado.class);

        intencaoAbrirQuadradoResultado.putExtra("lado", lado);


        this.startActivity(intencaoAbrirQuadradoResultado);

    }
}
