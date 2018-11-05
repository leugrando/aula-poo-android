package univalipoo.leoaula.com.br.a05_controle_abastecimento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;

public class ListaAbastecimentosActivity extends AppCompatActivity {

    private AbastecimentoAdapter adaptador;

    private final int RC_ADICIONAR_ABASTECIMENTO = 1312;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_abastecimentos);

        RecyclerView rvListaAbastecimento = findViewById(R.id.rvListaAbastecimentos);

        this.adaptador = new AbastecimentoAdapter();

        this.adaptador.listaAbastecimento = AbastecimentoDao.getLista(this.getApplicationContext());

        rvListaAbastecimento.setAdapter(this.adaptador);

        rvListaAbastecimento.setLayoutManager( new LinearLayoutManager(this.getApplicationContext()));
    }

    public void telaAdicionarAbastecimento(View v){
        Intent intencao = new Intent(this.getApplicationContext(), adicionarAbastecimentoActivity.class);

        startActivityForResult(intencao, RC_ADICIONAR_ABASTECIMENTO);

//        this.adaptador.notifyDataSetChanged();
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RC_ADICIONAR_ABASTECIMENTO){
            //estou tratando o fechamento da activity AdicionarAvaliacaoActivity
            if(resultCode == 1){
                Toast.makeText(this.getApplicationContext(), "AÇÃO 1!!!!!", Toast.LENGTH_LONG).show();
                this.adaptador.notifyDataSetChanged();
            }else if (resultCode == 2){
                Toast.makeText(this.getApplicationContext(), "AÇÃO 2 -- -- - - - - - - ", Toast.LENGTH_LONG).show();
                this.adaptador.notifyDataSetChanged();
            }else if (resultCode == 0){
                Toast.makeText(this.getApplicationContext(), "BACK BUTTON (PROVÁVEL)...", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this.getApplicationContext(), "Retorno não tratado...", Toast.LENGTH_LONG).show();
            }
        }else{
            //veio de algum lugar obscuro...

        }

    }
}