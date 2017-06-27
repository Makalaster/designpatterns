package com.example.ari.designpatterns.Prototype;
import com.example.ari.designpatterns.DAOandSingleton.DataHelper;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Ari on 6/25/2017.
 */
@DatabaseTable(tableName = "school")
/*
IMPLEMENTS CLONEABLE INTERFACE, WHICH DOES NOT REQUIRE ANY METHOD IMPLEMENTATIONS,
BUT WE WILL BE OVERRIDING THE CLONE METHOD, REGARDLESS, AS THE ORIGINAL CLONE METHOD
PROVIDES A SHALLOW COPY, INSTEAD OF DEEP
 */

public class School implements Cloneable {

    @DatabaseField
    private String schoolName;
    @DatabaseField
    private String schoolCity;
    @DatabaseField(generatedId = true)
    private int id;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    private String getSchoolCity() {
        return schoolCity;
    }

    private void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }


    //ALL PROTOTYPE DESIGN PATTERNS REQUIRE DEEP CLONING
    @Override
    public School clone() throws CloneNotSupportedException {

        /*
        return super.clone() IS THE DEFAULT FOR THE CLONE METHOD, BUT THIS WOULD RETURN A SHALLOW CLONE
        (REFERENCE TO THE SAME OBJECT), INSTEAD OF A DEEP CLONE, WHICH CLONES THE OBJECT ITSELF
         */
        super.clone();

        School school = new School();
        school.setSchoolCity(this.getSchoolCity());
        school.setSchoolName(this.getSchoolName());

        return school;
    }

    public School loadSchool(int id) throws SQLException {
        //CALLING THE SINGLE DATAHELPER INSTANCE (SINGLETON)
        DataHelper helper = DataHelper.getInstance();
        //PULLING THE RECORD FROM LOCAL STORAGE
        return helper.findSchool(id);
    }

}
