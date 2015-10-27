package bjoernbinzer.myvirtualfridge;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Alina on 27.10.2015.
 */

/* Interface for FridgeDB access */

public class FridgeDB {

    private static FridgeDBHelper mDBHelper;

    public static void createFridgeDB (Context context){
        mDBHelper = new FridgeDBHelper(context);
    }

    public static long insertEntry(int id, String product, String durability,
                                   double quantity, String uom, double price,
                                   String category ){

        // Gets the data repository in write mode
        SQLiteDatabase db = mDBHelper.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FridgeDBHelper.COLUMN_ENTRY_ID, id);
        values.put(FridgeDBHelper.COLUMN_PRODUCT, product);
        values.put(FridgeDBHelper.COLUMN_DURABILITY, durability);
        values.put(FridgeDBHelper.COLUMN_QUANTITY, quantity);
        values.put(FridgeDBHelper.COLUMN_UOM, uom);
        values.put(FridgeDBHelper.COLUMN_PRICE, price);
        values.put(FridgeDBHelper.COLUMN_CATEGORY, category);

        //Insert the new row, returning the primary key of the new row
        long newRowId;
        return newRowId = db.insert(FridgeDBHelper.TABLE_NAME, null,values);
    }
}
