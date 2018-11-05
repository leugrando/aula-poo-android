package univalipoo.leoaula.com.br.a05_controle_abastecimento;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AbastecimentoViewHolder extends RecyclerView.ViewHolder {

    //esta classe representa cada gaveta que será apresentada na lista

    private TextView tvQuilometragem;
    private TextView tvLitro;
    private ImageView ivNomePosto;
    private TextView tvData;

    public AbastecimentoViewHolder(View itemView) {
        super(itemView);
        this.tvQuilometragem = itemView.findViewById(R.id.tvQuilometragem);
        this.tvLitro = itemView.findViewById(R.id.tvLitro);
        this.ivNomePosto = itemView.findViewById(R.id.ivNomePosto);
        this.tvData = itemView.findViewById(R.id.tvData);
    }

    public void atualizaGaveta(Abastecimento objetoAbastecimento){
        String quilometros = "Km: " + String.valueOf(objetoAbastecimento.getQuilometragem());
        String litros = String.valueOf(objetoAbastecimento.getLitro()) + " L";
        String posto = objetoAbastecimento.getNomePosto();




        this.tvQuilometragem.setText( quilometros);
        this.tvLitro.setText( litros );
        this.tvData.setText( objetoAbastecimento.getData() );

        if(posto.equals("Ipiranga")){
            ivNomePosto.setImageDrawable(ContextCompat.getDrawable(App.getContext(), R.drawable.ipi));
        }else if(posto.equals("Petrobras")){
            ivNomePosto.setImageDrawable(ContextCompat.getDrawable(App.getContext(), R.drawable.petrobras));
        }else if(posto.equals("Shell")){
            ivNomePosto.setImageDrawable(ContextCompat.getDrawable(App.getContext(), R.drawable.shell));
        }else{
            ivNomePosto.setImageDrawable(ContextCompat.getDrawable(App.getContext(), R.drawable.texaco));
        }
    }

}