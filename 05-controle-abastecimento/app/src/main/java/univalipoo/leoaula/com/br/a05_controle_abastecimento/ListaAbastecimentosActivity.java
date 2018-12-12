package univalipoo.leoaula.com.br.a05_controle_abastecimento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;





public class ListaAbastecimentosActivity extends AppCompatActivity {

    private AbastecimentoAdapter adaptador;
    private boolean permissao;
    public static final int RC_ADICIONAR_ABASTECIMENTO = 1312;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_abastecimentos);

        RecyclerView rvListaAbastecimento = findViewById(R.id.rvListaAbastecimentos);

        this.permissao = this.getIntent().getBooleanExtra("permissao", false);
        this.adaptador = new AbastecimentoAdapter();
        this.adaptador.listaAbastecimento = AbastecimentoDao.getList(this.getApplicationContext());

        rvListaAbastecimento.setAdapter(this.adaptador);
        rvListaAbastecimento.setLayoutManager( new LinearLayoutManager(this.getApplicationContext()));
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RC_ADICIONAR_ABASTECIMENTO){

            if(resultCode == 1){
                Toast.makeText(this.getApplicationContext(), "Abastecimento salvo", Toast.LENGTH_LONG).show();
            }
                this.adaptador.notifyDataSetChanged();
                }else{
                Toast.makeText(this.getApplicationContext(), "Erro ao salvar", Toast.LENGTH_LONG).show();
            }

    }


    public void telaAdicionarAbastecimento(View view) {
        Intent intent =  new Intent(this.getApplicationContext(), adicionarAbastecimentoActivity.class);
        if(this.adaptador.listaAbastecimento.size()>0) {
            intent.putExtra("kmAntigo", this.adaptador.listaAbastecimento.get(this.adaptador.listaAbastecimento.size() - 1).getQuilometragem());
        }
        intent.putExtra("permissao", this.permissao);
        startActivityForResult(intent, RC_ADICIONAR_ABASTECIMENTO);
    }

    public void atualizaDatasetLista(){
        this.adaptador.listaAbastecimento = AbastecimentoDao.getList(this.getApplicationContext());
        this.adaptador.notifyDataSetChanged();
    }
}