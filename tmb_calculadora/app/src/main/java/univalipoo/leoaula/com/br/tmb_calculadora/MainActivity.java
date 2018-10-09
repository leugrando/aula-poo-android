package univalipoo.leoaula.com.br.tmb_calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void fazerAParadaAcontecer(View elementoClicado){
        EditText valor = findViewById(R.id.etValor);
        EditText porcentagem = findViewById(R.id.etPorcentagem);
        TextView juros = findViewById(R.id.tvJuros);

        String valorDigitado = valor.getText().toString();
        String porcentagemDigitada = porcentagem.getText().toString();


        if(valorDigitado.equals("")  || porcentagemDigitada.equals("")){
            valor.setError("Informe o valor");
            porcentagem.setError("Informe a porcentagem");

            return;
        }

        try{
            float porcentagemEmFloat = Float.parseFloat(porcentagemDigitada);
            float valorEmFloat = Float.parseFloat(valorDigitado);

            float resultadoEmFloat = (valorEmFloat*porcentagemEmFloat)/100;


            juros.setText( "JUROS: "+resultadoEmFloat);

            juros.setVisibility(View.VISIBLE);
        }catch (Exception e){
            Toast mensagemErro = Toast.makeText(this, "Algo errado aconteceu", Toast.LENGTH_LONG);
            mensagemErro.show();
        }



    }
}


