package univalipoo.leoaula.com.br.a05_controle_abastecimento;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class AbastecimentoViewHolder extends RecyclerView.ViewHolder {

    private TextView tvQuilometragem;
    private TextView tvLitro;
    private TextView tvNomePosto;
    private TextView tvData;

    public AbastecimentoViewHolder(View itemView) {
        super(itemView);
        this.tvQuilometragem = itemView.findViewById(R.id.tvQuilometragem);
        this.tvLitro = itemView.findViewById(R.id.tvLitro);
        this.tvNomePosto = itemView.findViewById(R.id.tvNomePosto);
        this.tvData = itemView.findViewById(R.id.tvData);
    }

    public void atualizaGaveta(Abastecimento objetoAbastecimento){
        this.tvQuilometragem.setText( objetoAbastecimento.getQuilometragem() );
        this.tvLitro.setText( objetoAbastecimento.getLitro() );
        this.tvNomePosto.setText( objetoAbastecimento.getNomePosto() );
        this.tvData.setText( objetoAbastecimento.getData() );
    }

}
