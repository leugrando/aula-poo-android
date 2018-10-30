package univalipoo.leoaula.com.br.a04_calculadora_area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class resultado_quadradoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_quadrado);

        double lado = this.getIntent().getDoubleExtra("lado", -1);;
        double resultadoQ = lado*lado;

        TextView tvResultado = findViewById(R.id.tvResultado);
        NumberFormat nf = DecimalFormat.getInstance();
        nf.setMaximumFractionDigits(1);
        tvResultado.setText(nf.format(resultadoQ));


    }
    public void onClickVoltar(View v) {
        Intent intencaoVoltarTelaInicial = new Intent(this.getApplicationContext(), MainActivity.class);
        this.startActivity(intencaoVoltarTelaInicial);
    }
}

