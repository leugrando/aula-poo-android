package univalipoo.leoaula.com.br.a05_controle_abastecimento;

/*    public void onClickViewInMap(View v)
    {
        Intent openMap = new Intent(v.getContext(), MapsActivity.class);
        openMap.putExtra("abastecimento", (Serializable) this.Shown);
        startActivity(openMap);

    }
}*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class AbastecimentoDetalhado extends AppCompatActivity {

    private Abastecimento abastecimento;
    private ImageView ivImagemPosto ;
    private TextView tvNomePostoDetalhado;
    private TextView tvQuilometragemDetalhada;
    private TextView tvDataDetalhada;
    private TextView tvLitrosDetalhado;
    private TextView tvLongitudeDetalhado;
    private  TextView tvLatitudeDetalhado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abastecimento_detalhado);

        tvQuilometragemDetalhada = findViewById(R.id.tvQuilometragemDetalhadaResposta);
        tvLitrosDetalhado = findViewById(R.id.tvLitrosDetalhadoResposta);
        tvDataDetalhada = findViewById(R.id.etData);
        tvNomePostoDetalhado = findViewById(R.id.tvPostoDetalheResposta);
        tvLatitudeDetalhado = findViewById(R.id.tvLatitudeDetalhadoResposta);
        tvLongitudeDetalhado = findViewById(R.id.tvLongitudeDetalhadoResposta);

        this.abastecimento = (Abastecimento) getIntent().getSerializableExtra("abastecimentos");

        if(this.abastecimento != null){
            this.tvQuilometragemDetalhada.setText(String.valueOf(this.abastecimento.getQuilometragem()));
            this.tvLitrosDetalhado.setText(String.valueOf(this.abastecimento.getLitro()));
            this.tvDataDetalhada.setText(this.abastecimento.getData());
            this.tvNomePostoDetalhado.setText(this.abastecimento.getNomePosto());
            this.tvLatitudeDetalhado.setText(String.valueOf(this.abastecimento.getLatitude()));
            this.tvLongitudeDetalhado.setText(String.valueOf(this.abastecimento.getLongitude()));
        }else{
            this.tvQuilometragemDetalhada.setText("nao encontrado");
            this.tvLitrosDetalhado.setText("nao encontrado");
            this.tvDataDetalhada.setText("nao encontrado");
            this.tvNomePostoDetalhado.setText("nao encontrado");
            this.tvLatitudeDetalhado.setText("nao encontrado");
            this.tvLongitudeDetalhado.setText("nao encontrado");
        }
    }
    public void backBtn(View view) {
        Intent intent =  new Intent(this.getApplicationContext(), ListaAbastecimentosActivity.class);
        startActivity(intent);
    }

}