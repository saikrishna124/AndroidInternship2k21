package com.example.dialogspickers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

TextView time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time=findViewById(R.id.time);
    }

    public void time(View view) {
        Calendar c=Calendar.getInstance();
        int hours=c.get(Calendar.HOUR);
        int minutes=c.get(Calendar.MINUTE);
        TimePickerDialog tpd=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
               time.setText(hourOfDay+"/"+minute);
            }
        },hours,minutes,true);
        tpd.show();


    }

    public void Alert(View view) {
        AlertDialog.Builder b=new AlertDialog.Builder(this);
        b.setIcon(R.drawable.ic_alert);
        b.setTitle("Alert Dialog");
        b.setMessage("Are you soon wana exit");
        b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();   //dialog closed
                finish();           //activity closed
            }
        });
        b.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "Alert dialog closed", Toast.LENGTH_SHORT).show();
            }
        });
        b.show();
    }
}