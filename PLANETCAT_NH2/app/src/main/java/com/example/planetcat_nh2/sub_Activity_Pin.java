package com.example.planetcat_nh2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.planetcat_nh2.apis.JsonHandle;
import com.example.planetcat_nh2.models.ConfirmHeader;
import com.example.planetcat_nh2.models.ConfirmPin;
import com.example.planetcat_nh2.models.Header;
import com.example.planetcat_nh2.models.PinItem;
import com.example.planetcat_nh2.models.PinItem2;
import com.example.planetcat_nh2.models.PostItem;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class sub_Activity_Pin extends AppCompatActivity {

    private final String BASEURL = "https://developers.nonghyup.com";
    private JsonHandle jsonHandle;
    private TextView logs;
    private TextView pinnumber;
    private TextView confirms;
    private TextView confirmPin;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonHandle = retrofit.create(JsonHandle.class);
    }


    // pin 번호를 입력 받아야 함
    public void event_Pin(View view) {
        logs = findViewById(R.id.logs);
        pinnumber = findViewById(R.id.pinnumber);

        long now = System.currentTimeMillis();
        Date mDate = new Date(now);
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyyMMdd");
        String getTime = simpleDate.format(mDate);

        String randomNum = String.valueOf((int)(Math.random() * 100000));
        Log.d("random", randomNum);

        // 밑의 값들을 전부 데이터베이스에 저장해두어야합니다.
        Header header = new Header("OpenFinAccountDirect", getTime, "112428",
                "000629", "001", "DrawingTransferA", randomNum
                ,"1359eaae22b5c2625ceeb1e66a7f71f8db11ee1e09890a21c852f7631d5d3039");

        PinItem2 item = new PinItem2(header, "Y", "19950610", "012", "3510000002640");

        Call<PinItem2> call = jsonHandle.postPinAccount2(item);
        call.enqueue(new Callback<PinItem2>() {
            @Override
            public void onResponse(Call<PinItem2> call, Response<PinItem2> response) {
                // response를 실패했을 모든 경우를 여기서 처리
                if (!response.isSuccessful()) {
                    String content = "";
                    content += "Code : " + response.code() + "\n";
                    Toast.makeText(getApplicationContext(), content, Toast.LENGTH_LONG).show();
                    // Intent로 sub_category.class로 이동하게 해주는 것입니다.
                    //Intent intent = new Intent(getApplicationContext(), sub_category.class);
                    //startActivity(intent);
                    return;
                }//성공했을 때의 처리
                else{
                    // logs 기록 보기
                    PinItem2 postResponse = response.body();
                    String content = "";
                    content += "Code : " + response.code() + "\n";
                    content += " request : "  + postResponse.getHeader().getRsms() + "\n";
                    Log.d("content", content);
                    logs.setText(content);

                    // pin 번혼 확인 하고 출력해주는 부분입니다.
                    String pinnum = postResponse.getRgno();
                    pinnumber.setText(pinnum);
                }
            }

            @Override
            public void onFailure(Call<PinItem2> call, Throwable t) {
                String message = t.getMessage();
                Toast.makeText(getApplicationContext(), "message : " + message , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void confirm_Pin(View view) {

        confirms = findViewById(R.id.logs2);
        confirmPin = findViewById(R.id.confirmPin);
        // pin 번호가 있는 TextView
        pinnumber = findViewById(R.id.pinnumber);

        long now = System.currentTimeMillis();
        Date mDate = new Date(now);
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyyMMdd");
        String getTime = simpleDate.format(mDate);

        String randomNum = String.valueOf((int)(Math.random() * 100000));
        Log.d("random", randomNum);

        ConfirmHeader header = new ConfirmHeader("CheckOpenFinAccountDirect", getTime, "112428",
                "000629", "001", "DrawingTransferA", randomNum
                ,"1359eaae22b5c2625ceeb1e66a7f71f8db11ee1e09890a21c852f7631d5d3039");


        String pinnumberText = pinnumber.getText().toString();
        ConfirmPin item = new ConfirmPin(header, pinnumberText, "19950610");

        // pin이 이미 존재하면 프로그램이 더이상 실행을 할 필요가 없습니다.
        if(pinnumberText  == ""){
            confirmPin.setText("핀이 중복되어 있습니다.");
            return;
        }
        Call<ConfirmPin> call = jsonHandle.postPinAccountConfirm(item);
        call.enqueue(new Callback<ConfirmPin>() {
            @Override
            public void onResponse(Call<ConfirmPin> call, Response<ConfirmPin> response) {
                // response를 실패했을 모든 경우를 여기서 처리
                if (!response.isSuccessful()) {
                    String content = "";
                    content += "Code : " + response.code() + "\n";
                    Toast.makeText(getApplicationContext(), content, Toast.LENGTH_LONG).show();
                    // Intent로 sub_category.class로 이동하게 해주는 것입니다.
                    //Intent intent = new Intent(getApplicationContext(), sub_category.class);
                    //startActivity(intent);
                    return;
                }//성공했을 때의 처리
                else{
                    ConfirmPin postResponse = response.body();
                    String content = "";
                    content += "Code : " + response.code() + "\n";
                    content += " request : "  + postResponse.getHeader().getRsms() + "\n";
                    Log.d("content", content);
                    confirms.setText(content);

                    String confirmText = "";
                    confirmText += " MakeDate : "  + postResponse.getRgsnYmd() + "\n";
                    confirmText += " FinAcno : "  + postResponse.getFinAcno() + "\n";
                    confirmPin.setText(confirmText);

                }
            }

            @Override
            public void onFailure(Call<ConfirmPin> call, Throwable t) {
                String message = t.getMessage();
                Toast.makeText(getApplicationContext(), "message : " + message , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
