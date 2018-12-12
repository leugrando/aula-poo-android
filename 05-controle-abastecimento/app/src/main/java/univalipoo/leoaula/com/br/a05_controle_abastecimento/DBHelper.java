package univalipoo.leoaula.com.br.a05_controle_abastecimento;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    private static final int databaseVersion = 1;

    public DBHelper(Context context)
    {
        super(context, "BancoDeDados", null,  DBHelper.databaseVersion);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String SQLCreatingTable = "CREATE TABLE abastecimentos (" + "ID INTEGER PRIMARY KEY AUTOINCREMENT," + "KM FLOAT,"
                + "LITROS FLOAT," + "LATITUDE DOUBLE," + "LONGITUDE DOUBLE," + "DATA TEXT," + "NOMEPOSTO TEXT "
                + ");";
        db.execSQL(SQLCreatingTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE abastecimentos");
        this.onCreate(db);
    }
}