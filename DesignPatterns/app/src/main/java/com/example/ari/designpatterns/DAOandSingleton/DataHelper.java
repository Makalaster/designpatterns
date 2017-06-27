package com.example.ari.designpatterns.DAOandSingleton;

import android.database.sqlite.SQLiteDatabase;

import com.example.ari.designpatterns.Prototype.School;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Ari on 6/25/2017.
 */

/*
THIS IS A DATA ACCESS OBJECT DESIGN PATTERN
ALL DIRECT INTERACTION WITH THE PHONE MEMORY WILL BE FROM THIS ONE CLASS
IT ALSO IS A SINGLETON DESIGN PATTERN
 */
public class DataHelper extends OrmLiteSqliteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "OrmLite.db";
    private static DataHelper dataHelper;



    private DataHelper() {
        super(null,DATABASE_NAME, null, DATABASE_VERSION);
    }


    /*
    THIS IS A SINGLETON DESIGN PATTERN - SO CALLED BECAUSE IT IS ONLY INITIALIZED ONCE
    AND YOU USE THE SAME INSTANCE FOR EVERY ACTIVITY WHERE YOU USE IT
    */

    public static DataHelper getInstance() {
        if (dataHelper == null) {
            dataHelper = new DataHelper();
        }
        return dataHelper;
    }


    public void createSchool(School school) throws SQLException {
        getDao(School.class).createOrUpdate(school);
    }

    public School findSchool(int id) throws SQLException {

       List<School> list =  getDao(School.class).queryForEq("id",id);
        return list.get(0);
    }





    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, School.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, School.class, true);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
