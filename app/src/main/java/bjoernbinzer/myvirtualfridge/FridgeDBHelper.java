package bjoernbinzer.myvirtualfridge;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Alina on 27.10.2015.
 */

public class FridgeDBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "fridge.db";
    public static final int DB_VERSION = 1;
    public static final String TABLE_NAME = "ProductList";
    public static final String COLUMN_ENTRY_ID = "entryid";
    public static final String COLUMN_PRODUCT = "product";
    public static final String COLUMN_DURABILITY = "durability";
    public static final String COLUMN_QUANTITY = "quantity";
    public static final String COLUMN_UOM = "unit of measure";
    public static final String COLUMN_PRICE = "price";
    public static final String COLUMN_CATEGORY = "category";

    public static final String SQL_CREATE =
            "create table " + TABLE_NAME + "(" +
                    COLUMN_ENTRY_ID + " integer primary key autoincrement, " +
                    COLUMN_PRODUCT + " text not null, " +
                    COLUMN_DURABILITY + " date not null, " +
                    COLUMN_QUANTITY + " double(6,2) not null, " +
                    COLUMN_UOM + " text not null, " +
                    COLUMN_PRICE + " double(5,2), " +
                    COLUMN_CATEGORY + " text not null);";

    public FridgeDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
