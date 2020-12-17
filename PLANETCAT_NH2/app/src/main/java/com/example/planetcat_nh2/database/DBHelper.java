package com.example.planetcat_nh2.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    // _id integer은 필수 컬럼입니다.
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE if not exists mytable ("
                    + "_id integer PRIMARY KEY autoincrement,"
                    + "txt text);";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE if exists mystable";

        db.execSQL(sql);
        onCreate(db);
    }
}
