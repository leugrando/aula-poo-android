package univalipoo.leoaula.com.br.a05_controle_abastecimento;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import java.util.ArrayList;
public class AbastecimentoDao {

    private static ArrayList<Abastecimento> Cache = new ArrayList<Abastecimento>();

    public static boolean salvar(Context context, Abastecimento object){

        DBHelper helper = new DBHelper (context);
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues data = new ContentValues();
        data.put("km" , object.getQuilometragem());
        data.put("litros" , object.getLitro());
        data.put("latitude" , object.getLatitude());
        data.put("longitude" , object.getLongitude());
        data.put("data" , object.getData());
        data.put("nomeposto" , object.getNomePosto());
        long id = db.insert("abastecimentos", null, data);
        object.setId(id);

        Cache.add(object);
        return true;
    }

    public static ArrayList <Abastecimento> getList (Context context)
    {
        Cache = new ArrayList<Abastecimento>();

        DBHelper db = new DBHelper(context);
        SQLiteDatabase database = db.getReadableDatabase();

        String BuscarAbastecimentos = "SELECT km, litros, latitude, longitude, date, posto, id FROM abastecimentos";
        Cursor cursor = database.rawQuery(BuscarAbastecimentos, null);

        while (cursor.moveToNext())
        {
            Abastecimento next = new Abastecimento();
            next.setQuilometragem(cursor.getFloat(0));
            next.setLitro(cursor.getFloat(1));
            next.setLatitude(cursor.getDouble(2));
            next.setLongitude(cursor.getDouble(3));
            next.setData(cursor.getString(4));
            next.setNomePosto(cursor.getString(5));
            next.setId(cursor.getLong(6));

            Cache.add(next);
        }
        return Cache;
    }
}