package com.example.yudbetfirsttargil.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DBManager {

    private DatabaseHelper dbHelper;

    private Context context;

    private SQLiteDatabase database;

    public DBManager(Context c) {
        context = c;
    }

    public DBManager open() throws SQLException {
        dbHelper = new DatabaseHelper(context);
        database = dbHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        dbHelper.close();
    }

    public void insert(int answer) {
        ContentValues contentValue = new ContentValues();
        //@@contentValue.put(DatabaseHelper.Q1_ANSWER, answer);
        contentValue.put(DatabaseHelper.Q1_ANSWER, answer);
        database.insert(DatabaseHelper.TABLE_NAME_Q1, null, contentValue);
    }

    public Cursor fetch() {
        String[] projection = new String[] { DatabaseHelper.Q1_ANSWER};
        Cursor cursor = database.query(DatabaseHelper.TABLE_NAME_Q1, projection, null, null, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        return cursor;
    }

/*
    public int update(long _id, String name, String desc) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.SUBJECT, name);
        contentValues.put(DatabaseHelper.DESC, desc);
        int i = database.update(DatabaseHelper.TABLE_NAME, contentValues, DatabaseHelper._ID + " = " + _id, null);
        return i;
    }

    public void delete(long _id) {
        database.delete(DatabaseHelper.TABLE_NAME, DatabaseHelper._ID + "=" + _id, null);
    }
*/
}
