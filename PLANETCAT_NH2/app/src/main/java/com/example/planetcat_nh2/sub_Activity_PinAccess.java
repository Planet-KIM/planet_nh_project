package com.example.planetcat_nh2;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Date;

public class sub_Activity_PinAccess extends AppCompatActivity {

    public EditText birthEdit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinaccess);
    }

    public void dateSelect(View view) {
        birthEdit = findViewById(R.id.birthPic);
        final Calendar cal = Calendar.getInstance();
        Toast.makeText(getApplicationContext(), "생일을 입력해주세요.", Toast.LENGTH_SHORT).show();
        /*
        DatePickerDialog datePickerDialog = new DatePickerDialog(getApplicationContext(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String msg = String.format("%d 년 %d %d일", year, month+1, dayOfMonth);
                birthEdit.setText(String.valueOf(year+month+1+dayOfMonth));
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
            }
        }, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH ));
        datePickerDialog.show();*/
    }

    public void event_Access_Pinpage(View view) {
    }
}