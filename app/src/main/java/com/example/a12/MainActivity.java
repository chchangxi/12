package com.example.a12;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Student student = new Student();
        student.setName("张三");
        student.setSex(1);

        StudentDao studentDao = new StudentDao(this);
        studentDao.addStudent(student);
        studentDao.deleteStudent(1);
//        MyHelper myHelper = new MyHelper(this);
//        SQLiteDatabase db = myHelper.getWritableDatabase();
//        db.close();


    }
}