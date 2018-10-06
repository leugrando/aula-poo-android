package univalipoo.leoaula.com.br.tmb_calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton masc = (RadioButton) findViewById(R.id.botaoMasculino);
        final RadioButton fem = (RadioButton) findViewById(R.id.botaoFeminino);
    masc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (masc.isChecked()){
            //fazer calculo masc;
        }
            if(fem.isChecked()){
                //fazer calculo fem
            }

    });





    public void fazerAParadaAcontecer(View elementoClicado){
        EditText altura = findViewById(R.id.etAltura);
        EditText peso = findViewById(R.id.etPeso);
        EditText idade = findViewById(R.id.etIdade);
        TextView tmb = findViewById(R.id.tvTmb);

        String alturaDigitada = altura.getText().toString();
        String pesoDigitado = peso.getText().toString();
        String idadeDigitada = idade.getText().toString();

        if(alturaDigitada.equals("")  || pesoDigitado.equals("") || idadeDigitada.equals("")){
            altura.setError("Informe a altura");
            peso.setError("Informe o peso");
            idade.setError("Informe a idade");
            return;
        }

        try{
            double alturaEmDouble = Double.parseDouble(alturaDigitada);
            double pesoEmDouble = Double.parseDouble(pesoDigitado);
            double idadeEmDouble = Double.parseDouble(idadeDigitada);
            double resultadoTmb = pesoEmDouble+idadeEmDouble+alturaEmDouble;


            //tmb.setText( "TMB: "+resultadoTmb );

            tmb.setVisibility(View.VISIBLE);
        }catch (Exception e){
            Toast mensagemErro = Toast.makeText(this, "Algo errado aconteceu", Toast.LENGTH_LONG);
            mensagemErro.show();
        }



    }
});

    };
}