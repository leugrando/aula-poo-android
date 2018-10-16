package univalipoo.leoaula.com.br.calculadoraareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class resultadoCirculoActivity extends AppCompatActivity {

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
}
