package com.xiawei.administrator.day29_down_continue.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.xiawei.administrator.day29_down_continue.db.DBHelper;
import com.xiawei.administrator.day29_down_continue.entities.DownloadInfo;

/**
 * Created by Administrator on 2017/1/12.1233144444444444
 */
public class DownLoadeDAO implements  DownLoadeDAOImpl {
    private SQLiteDatabase mDb;
//。。。。。

    public DownLoadeDAO(Context context) {
       if(mDb==null){
           mDb=new DBHelper(context).getWritableDatabase();
       }
    }

    @Override
    public void save(DownloadInfo downloadInfo) {
        mDb.execSQL("insert into "+DBHelper.TB_NAME+" (fileName,url,progress,length) value(?,?,?,?)",
                new Object[]{downloadInfo.getFilenName(),downloadInfo.getUrl(),
                        downloadInfo.getProgress(),downloadInfo.getProgress()});

    }

    @Override
    public DownloadInfo query(String url) {
   Cursor cursor= mDb.rawQuery("select * from "+DBHelper.TB_NAME+" where=?",new String[]{url});
   while(cursor.moveToFirst()){
       DownloadInfo  downloadInfo=new DownloadInfo();
       downloadInfo.setId(cursor.getInt(cursor.getColumnIndex("_id")));
       downloadInfo.setUrl(cursor.getString(cursor.getColumnIndex("url")));
       downloadInfo.setFilenName(cursor.getString(cursor.getColumnIndex("fileName")));
       downloadInfo.setLength(cursor.getInt(cursor.getColumnIndex("length")));
       downloadInfo.setProgress(cursor.getInt(cursor.getColumnIndex("progress")));
       return   downloadInfo;
   }
        return null;
    }

    @Override
    public void updateProgress(String url, long progress) {
        mDb.execSQL("update "+DBHelper.TB_NAME+" set progress=? where url=?",
                new Object[]{progress , url});

    }

    @Override
    public void updateLength(String url, long length) {
         mDb.execSQL("update "+DBHelper.TB_NAME+" set length=? where url=?",
                 new Object[]{length,url});
    }

    @Override
    public void delete(String url) {
        mDb.execSQL("delete from "+DBHelper.TB_NAME+"where url=?",
                new String[]{url});

    }

    @Override
    public void close() {

    }
}
