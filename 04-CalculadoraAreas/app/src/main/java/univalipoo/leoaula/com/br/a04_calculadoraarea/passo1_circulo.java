package univalipoo.leoaula.com.br.a04_calculadoraarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class passo1_circulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passo1_circulo);
    }

    public void onClickAvancar(View v){
        EditText etRaio = findViewById(R.id.etRaioCirculo);


        double raio = Double.parseDouble(etRaio.getText().toString());



        Intent intencaoAbrirCirculoResultado = new Intent(this.getApplicationContext(), resultado_circulo.class);

        intencaoAbrirCirculoResultado.putExtra("raio", raio);


        this.startActivity(intencaoAbrirCirculoResultado);

    }
}

