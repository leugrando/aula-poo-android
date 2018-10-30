package univalipoo.leoaula.com.br.a04_calculadora_area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class resultado_circuloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_circulo);


        double raio = this.getIntent().getDoubleExtra("raio", -1);
        double resultadoC = (raio*raio)*3.14;

        TextView tvResultado = findViewById(R.id.tvResultado);
        NumberFormat nf = DecimalFormat.getInstance();
        nf.setMaximumFractionDigits(1);
        tvResultado.setText(nf.format(resultadoC));


    }
    public void onClickVoltar(View v) {
        Intent intencaoVoltarTelaInicial = new Intent(this.getApplicationContext(), MainActivity.class);
        this.startActivity(intencaoVoltarTelaInicial);
    }

}
