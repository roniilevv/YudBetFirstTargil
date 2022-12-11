package com.example.yudbetfirsttargil.SQLite;


    import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

    public class DatabaseHelper extends SQLiteOpenHelper {

        // Table Name
        public static final String TABLE_NAME_Q1 = "TABLE_QUESTION1";

        // Table columns
        public static final String Q1_ID = "_id";
        public static final String Q1_ANSWER = "answer";

        // Database Information
        static final String DB_NAME = "QUIZ.DB";

        // database version
        static final int DB_VERSION = 1;

        // Creating table query
        String CREATE_TABLE_Q1 = "CREATE TABLE " + TABLE_NAME_Q1 +
                "(" +
                Q1_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + // Define a primary key
                Q1_ANSWER + " INTEGER "  +
                ")";

        public DatabaseHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE_Q1);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_Q1);
            onCreate(db);
        }
    }

