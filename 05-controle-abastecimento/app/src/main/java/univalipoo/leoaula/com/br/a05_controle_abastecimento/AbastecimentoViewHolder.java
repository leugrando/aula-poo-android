package univalipoo.leoaula.com.br.a05_controle_abastecimento;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AlertDialogLayout;
import android.support.v7.widget.RecyclerView;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class AbastecimentoViewHolder extends RecyclerView.ViewHolder {


    private TextView tvQuilometragem;
    private TextView tvLitro;
    private ImageView ivNomePosto;
    private TextView tvData;
    private Abastecimento abastecimento;

    public AbastecimentoViewHolder(@NonNull View viewItem) {
        super(viewItem);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirAtividade = new Intent(v.getContext(), AbastecimentoDetalhado.class);
                abrirAtividade.putExtra("abastecimento", AbastecimentoViewHolder.this.abastecimento);
                ((ListaAbastecimentosActivity) v.getContext()).startActivity(abrirAtividade);
            }
        });

        this.tvData = itemView.findViewById(R.id.tvData);
        this.tvQuilometragem = itemView.findViewById(R.id.tvQuilometragem);
        this.tvLitro = itemView.findViewById(R.id.tvLitro);
        this.ivNomePosto = itemView.findViewById(R.id.ivNomePosto);
    }
        public void atualizaGaveta (Abastecimento objetoAbastecimento){
            String quilometros = "Km: " + String.valueOf(objetoAbastecimento.getQuilometragem());
            String litros = String.valueOf(objetoAbastecimento.getLitro()) + " L";
            String posto = objetoAbastecimento.getNomePosto();
            String data = objetoAbastecimento.getData();


            this.tvQuilometragem.setText(quilometros);
            this.tvLitro.setText(litros);
            this.tvData.setText(objetoAbastecimento.getData());

            if (posto.equals("Ipiranga")) {
                ivNomePosto.setImageResource(R.drawable.ipi);
            } else if (posto.equals("Petrobras")) {
                ivNomePosto.setImageResource(R.drawable.petrobras);
            } else if (posto.equals("Shell")) {
                ivNomePosto.setImageResource(R.drawable.shell);
            } else if (posto.equals("Texaco")) {
                ivNomePosto.setImageResource(R.drawable.texaco);
            } else {
                ivNomePosto.setImageResource(R.drawable.postopadrao);
            }
        }

    }
