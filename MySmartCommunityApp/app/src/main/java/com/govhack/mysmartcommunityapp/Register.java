package com.govhack.mysmartcommunityapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.govhack.mysmartcommunityapp.database.DatabaseHandler;

import java.util.Date;
import java.util.Locale;

public class Register extends AppCompatActivity {
    private EditText edtDOB, edtName, edtEmail, edtPhNum, edtID, edtAddress;
    private EditText edtPassword, edtConfPassword;
    private Button btnRegister, btnCancel;
    private DatePicker date_picker;
    private Button button;

    private int year;
    private int month;
    private int day;
    SQLiteDatabase  db;
    static final int DATE_DIALOG_ID = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        createDatabase();
        edtName = (EditText)findViewById(R.id.name);
        edtEmail = (EditText)findViewById(R.id.email);
        edtPhNum = (EditText)findViewById(R.id.phnum);
        edtID = (EditText)findViewById(R.id.id);
        edtAddress = (EditText)findViewById(R.id.address);
        edtPassword = (EditText)findViewById(R.id.password);
        edtConfPassword = (EditText)findViewById(R.id.conf_password);

        edtDOB = (EditText)findViewById(R.id.dob);
        btnRegister = (Button)findViewById(R.id.register_here);
        btnCancel = (Button)findViewById(R.id.cancel);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertIntoDB();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    protected void insertIntoDB(){
        String user_id = edtID.getText().toString().trim();
        String email = edtEmail.getText().toString().trim();
        String name = edtName.getText().toString();
        String phnum = edtPhNum.getText().toString();
        String address = edtAddress.getText().toString();
        String dob = edtDOB.getText().toString();
        String password = edtPassword.getText().toString();
        String confPassword = edtConfPassword.getText().toString();

        if(!password.equals(confPassword)){
            Toast.makeText(getApplicationContext(),"Password mismatch", Toast.LENGTH_LONG).show();
            return;
        }

        if(user_id.equals("") || email.equals("")|| name.equals("")|| phnum.equals("")||
                address.equals("")|| dob.equals("")){
            Toast.makeText(getApplicationContext(),"Please fill all fields", Toast.LENGTH_LONG).show();
            return;
        }
        String query = "INSERT INTO persons (email,_id, password) VALUES('"+email+"', '"+user_id+"', '"+password+"');";
        db.execSQL(query);

        Intent intentHome = new Intent(Register.this, MainActivity.class);
        startActivity(intentHome);
    }

    protected void createDatabase(){
        db=openOrCreateDatabase("PersonDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS persons(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, email VARCHAR,_id VARCHAR,password VARCHAR);");
    }


}
