package univalipoo.leoaula.com.br.a04_calculadoraarea;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class resultado_triangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_triangulo);

        double base = this.getIntent().getDoubleExtra("base", -1);
        double altura = this.getIntent().getDoubleExtra("altura", -1);
        double resultadoT = (base*altura)/2;

        TextView tvResultado = findViewById(R.id.tvResultado);
        NumberFormat nf = DecimalFormat.getInstance();
        nf.setMaximumFractionDigits(1);
        tvResultado.setText(nf.format(resultadoT));


    }
    public void onClickVoltar(View v) {
        Intent intencaoVoltarTelaInicial = new Intent(this.getApplicationContext(), MainActivity.class);
        this.startActivity(intencaoVoltarTelaInicial);
    }
}

