package univalipoo.leoaula.com.br.calculadoraareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class resultadoTrianguloActivity extends AppCompatActivity {

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
}

