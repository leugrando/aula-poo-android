package univalipoo.leoaula.com.br.a05_controle_abastecimento;

import java.io.Serializable;

public class Abastecimento implements Serializable {
    private String quilometragem;
    private String litro;
    private String nomePosto;
    private String data;


    public String getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(String quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getLitro() {
        return litro;
    }

    public void setLitro(String litro) {
        this.litro = litro;
    }

    public String getNomePosto() {
        return nomePosto;
    }

    public void setNomePosto(String nomePosto) {
        this.nomePosto = nomePosto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}