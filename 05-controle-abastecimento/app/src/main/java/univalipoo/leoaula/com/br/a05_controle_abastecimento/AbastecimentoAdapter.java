package univalipoo.leoaula.com.br.a05_controle_abastecimento;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class AbastecimentoAdapter extends RecyclerView.Adapter{

    public ArrayList<Abastecimento> listaAbastecimento;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflando o XML
        View elementoPaiDoXML =
                LayoutInflater.from(
                        parent.getContext()
                ).inflate(
                        R.layout.abastecimento_item_lista,
                        parent,
                        false
                );

        AbastecimentoViewHolder minhaGaveta = new AbastecimentoViewHolder(elementoPaiDoXML);
        return minhaGaveta;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //método que deve vestir a gaveta
        AbastecimentoViewHolder minhaGaveta = (AbastecimentoViewHolder) holder;
        Abastecimento daVez = listaAbastecimento.get(position);
        minhaGaveta.atualizaGaveta( daVez );
    }

    @Override
    public int getItemCount() {
        //retornar o total de itens da lista
        return listaAbastecimento.size();
    }
}
