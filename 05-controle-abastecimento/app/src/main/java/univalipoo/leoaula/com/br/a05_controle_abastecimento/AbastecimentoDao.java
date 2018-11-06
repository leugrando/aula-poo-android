package univalipoo.leoaula.com.br.a05_controle_abastecimento;

import android.content.Context;
import android.content.Context;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AbastecimentoDao {

    private static ArrayList<Abastecimento> AL_CACHE = new ArrayList<>();

    private static final String NOME_ARQUIVO = "Abastecimentos.txt";

    public static boolean salvar(Context c, Abastecimento aSerSalva){
        AL_CACHE.add(aSerSalva);

        String avEmString = "";
        avEmString += aSerSalva.getQuilometragem() + ";";
        avEmString += aSerSalva.getLitro() + ";";
        avEmString += aSerSalva.getNomePosto() + ";";
        avEmString += aSerSalva.getData() + ";" + "\n";

        File refArquivo = new File( c.getFilesDir().getPath() + NOME_ARQUIVO );
        try {
            FileWriter escritor = new FileWriter(refArquivo, true);
            escritor.write( avEmString );
            escritor.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<Abastecimento> getLista(Context c){
        AL_CACHE = new ArrayList<>();

        File refArquivo = new File( c.getFilesDir().getPath() + NOME_ARQUIVO );

        try {
            FileReader leitor = new FileReader(refArquivo);
            BufferedReader leitorDeLinha = new BufferedReader(leitor);

            String linhaAbastecimento = null;

            while((linhaAbastecimento = leitorDeLinha.readLine()) != null){

                String[] partesDaLinha = linhaAbastecimento.split(";");
                Abastecimento daVez = new Abastecimento();
                daVez.setQuilometragem(Float.parseFloat(partesDaLinha[0]));
                daVez.setLitro(Float.parseFloat(partesDaLinha[1]));
                daVez.setNomePosto( partesDaLinha[2] );
                daVez.setData( partesDaLinha[3] );
                AL_CACHE.add(daVez);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return AL_CACHE;
    }


}