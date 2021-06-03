package com.example.inputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
EditText name,mail,number;
Spinner branches;
RadioGroup rg;
CheckBox hi,tel,eng;
TextView dob;
Button submit;
RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        mail=findViewById(R.id.email);
        number= findViewById(R.id.phone);
        branches=findViewById(R.id.spinner);
        rg=findViewById(R.id.radiogroup);
        hi=findViewById(R.id.hindi);
        tel=findViewById(R.id.english);
        dob=findViewById(R.id.dob);
        submit=findViewById(R.id.submit);
    }

    public void Save(View view) {
        String n=name.getText().toString();
        String m=mail.getText().toString();
        String num=number.getText().toString();
        String branch=branches.getSelectedItem().toString();
        String db=dob.getText().toString();
        StringBuilder languagessb=new StringBuilder();
        int id=rg.getCheckedRadioButtonId();
        rb=findViewById(id);
        if(hi.isChecked()){
            languagessb.append("Hindi");
        }
        if(tel.isChecked()){
            languagessb.append("Telugu");
        }

        Log.i("APSSDC","name"+n+"mail\n"+m+"num\n"+num+"branch\n"+branch+"languages\n"+languagessb+"db\n"+db+"gender"+rb.getText());

    }

    public void Dob(View view) {
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int day=c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog d=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
             dob.setText(year+"/"+(month+1)+"/"+dayOfMonth);
            }
        },year,month,day);

  d.show();

    }
}