package com.xiawei.administrator.day29_down_continue.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017/1/12.
 */
public class DBHelper  extends SQLiteOpenHelper {
   public static final String DB_NAME="download.db";
    public static final String TB_NAME="tb_download";
    public static final String CREATE_TB="create table "
            +TB_NAME+" (_id integer primary key autoincrement," +
           "fileName text," +
            "url text," +
            "progress integer," +
            "length integer)";
    public static final  int  VESION=1;

    public DBHelper(Context context) {
       this(context, DB_NAME, null, VESION);
    }

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TB);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
