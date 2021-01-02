package com.example.planetcat_nh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.planetcat_nh2.apis.JsonHandle;
import com.example.planetcat_nh2.models.PostItem;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Button btn_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void access_Pin_page(View view) {
        //Toast.makeText(this, "Pin 번호 생성", Toast.LENGTH_SHORT).show();
        btn_main = findViewById(R.id.btn_main);
        Intent intent = new Intent(getApplicationContext(), sub_Activity_Pin.class);
        startActivity(intent);
    }

    public void makePin(View view) {
        Intent intent = new Intent(getApplicationContext(), sub_Activity_PinAccess.class);
        startActivity(intent);
    }

    public void access_Login_page(View view) {
        Toast.makeText(getApplicationContext(), "Access Login Page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), sub_Activity_Login.class);
        startActivity(intent);
    }
}