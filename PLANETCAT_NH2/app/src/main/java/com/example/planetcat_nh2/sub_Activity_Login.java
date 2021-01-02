package com.example.planetcat_nh2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.planetcat_nh2.apis.JsonHandle;
import com.example.planetcat_nh2.models.Login;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class sub_Activity_Login extends AppCompatActivity {

    private final String LoginUrl = "https://walkplanetcat.com";
    private JsonHandle jsonHandle;
    public EditText idText;
    public EditText passwordText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 로그인에 필요한 EditText 초기화
        idText = findViewById(R.id.edt_id1);
        passwordText = findViewById(R.id.edt_pwd1);

        // REST API를 사용하기 위한 초기화 작업
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LoginUrl)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        jsonHandle = retrofit.create(JsonHandle.class);
    }


    public void signIn(View view) {
        // EditText의 값을 받와야합니다.
        // 텍스트에서 공백(해결) and 특수문자(미해결) 제거
        String id = String.valueOf(idText.getText()).replace(" ", "");
        String password = String.valueOf(passwordText.getText()).replace(" ", "");

        Login login = new Login(id, password);
        Call<Login> call = jsonHandle.login(login);
        call.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                // 응답을 실패했을 경우에는...
                if (!response.isSuccessful()){
                    // 실패 메세지 띄우기
                    Toast.makeText(getApplicationContext(), "Login Fail : response = " + response.code(), Toast.LENGTH_SHORT).show();
                    // 실패했으니 안의 내용 초기화
                    idText.setText("");
                    passwordText.setText("");
                }
                // 응답에 성공했을 때....
                else{
                    Toast.makeText(getApplicationContext(), "Login Success : code = " + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                String message = t.getMessage();
                Toast.makeText(getApplicationContext(), "Login Failed : message = " + message, Toast.LENGTH_SHORT).show();
                Log.d("restmessage", message);
            }
        });

        //Toast.makeText(getApplicationContext(), "TEST", Toast.LENGTH_SHORT).show();
    }
}
