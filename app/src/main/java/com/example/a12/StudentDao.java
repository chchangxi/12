package com.example.a12;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

/**
 *
 */
public class StudentDao {
    MyHelper helper;

    public StudentDao(Context context) {
        helper = new MyHelper(context);
    }
    public void addStudent(Student student){
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name",student.getName());
        values.put("sex",student.getSex());
        db.insert("student",null,values);
        db.insert("student",null,values);
        db.insert("student",null,values);
        db.insert("student",null,values);
        db.insert("student",null,values);
        db.insert("student",null,values);
        db.insert("student",null,values);
        db.insert("student",null,values);
        db.insert("student",null,values);
        db.insert("student",null,values);
        db.insert("student",null,values);
        db.close();

    }
    public void deleteStudent(int id){
        SQLiteDatabase db = helper.getWritableDatabase();
        db.delete("student","id=?",new String[]{id+""});
    }
    public void updateStudent(Student student) {
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", student.getName());
        values.put("sex", student.getSex());
        db.update("student",values,"id=?",new String[]{student.getId()+""});
        db.close();
    }

    public List<Student> getAll(){

    }

}
