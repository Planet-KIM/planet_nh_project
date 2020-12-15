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
import com.example.planetcat_nh2.models.PinItem;
import com.example.planetcat_nh2.models.PostItem;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class sub_Activity_Pin extends AppCompatActivity {

    private final String BASEURL = "https://developers.nonghyup.com";
    private JsonHandle jsonHandle;

    private TextView now_Date;
    private TextView logs;

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
        pintest();
    }


    // pin 번호를 입력 받아야 함
    private void pintest() {
        
        // pin account 얻기
        //HashMap<String, Object> Pins = new HashMap<>();
        //HashMap<String, String> Header = new HashMap<>();

        JSONObject Pins = new JSONObject();
        JSONObject Headers = new JSONObject();

        try {
            Headers.put("ApiNm", "OpenFinAccountDirect");

            // 날짜 지정해주고 date 화면에 보여주기
            long now = System.currentTimeMillis();
            Date mDate = new Date(now);
            SimpleDateFormat simpleDate = new SimpleDateFormat("yyyyMMdd");
            String getTime = simpleDate.format(mDate);

            //now_Date = findViewById(R.id.date1);
            //ow_Date.setText(getTime);

            Headers.put("Tsymd", getTime);
            Headers.put("Trtm", "112428");

            // 농협계좌랑 농협상호 계좌 중 선택 가능해서 넣어야 함.(xml 추가해야함 선택박스 or radiobox)
            Headers.put("Iscd", "000629");
            Headers.put("FintechApsno", "001");
            Headers.put("ApiSvcCd", "DrawingTransferA");
            Headers.put("IsTuno", "005678");
            Headers.put("AccessToken", "1359eaae22b5c2625ceeb1e66a7f71f8db11ee1e09890a21c852f7631d5d3039");

            Pins.put("Header", Headers);
            Pins.put("DrtrRgyn", "Y");
            //생년월일
            Pins.put("BrdtBrno", "19950610");
            Pins.put("Bncd", "012");
            Pins.put("Acno", "3020000002639");
        }catch(JSONException e){e.printStackTrace();}

        //Toast.makeText(getApplicationContext(), String.valueOf(Pins), Toast.LENGTH_LONG).show();


        //Gson gson = new Gson();
        //String json = gson.toJson(Pins);
        Log.d("Header", String.valueOf(Headers));
        Log.d("Pins", String.valueOf(Pins));

        PinItem item = new PinItem(Headers, "Y", "19950610", "011", "3020000002639");

        Call<PinItem> call = jsonHandle.postPinAccount2(item);
        call.enqueue(new Callback<PinItem>() {
            @Override
            public void onResponse(Call<PinItem> call, Response<PinItem> response) {
                // response를 실패했을 모든 경우를 여기서 처리
                if (!response.isSuccessful()) {

                    String headers = String.valueOf(response.headers());
                    String code = String.valueOf(response.code());
                    PinItem postResponse = response.body();

                    String content = "";
                    content += "Code : " + code + "\n";
                    content += "Header : " + headers + "\n";
                    content += "message : "  + response.message()+ "\n";
                    content += " Row : "  + response.raw()+ "\n";
                    content += " Body : "  + response.body()+ "\n";
                    content += " request : "  + call.request() + "\n";

                    Log.d("content", content);

                    Toast.makeText(getApplicationContext(), content, Toast.LENGTH_LONG).show();
                    // Intent로 sub_category.class로 이동하게 해주는 것입니다.
                    //Intent intent = new Intent(getApplicationContext(), sub_category.class);
                    //startActivity(intent);
                    return;
                }//성공했을 때의 처리
                else{
                    String headers = String.valueOf(response.headers());
                    String code = String.valueOf(response.code());
                    PinItem postResponse = response.body();
                    String content = "";
                    content += "Code : " + code + "\n";
                    content += "Header : " + headers + "\n";
                    content += "message : "  + response.message()+ "\n";
                    content += " Row : "  + response.raw()+ "\n";
                    content += " Body : "  + response.body()+ "\n";
                    content += " request : "  + call.request().toString() + "\n";

                    Log.d("content", content);

                    Toast.makeText(getApplicationContext(), content, Toast.LENGTH_LONG).show();
                }

            }
            
            @Override
            public void onFailure(Call<PinItem> call, Throwable t) {
                String message = t.getMessage();
                Toast.makeText(getApplicationContext(), "message : " + message , Toast.LENGTH_SHORT).show();
            }
        });

    }


    // 값을 반환해야합니다. lscd에 따른 값을 반환
    public void event_lscd(View view){
        boolean isChecked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.lscd1:
                if(isChecked){
                    Toast.makeText(this, ((RadioButton) view).getText() + ":" + "011" , Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.lscd2:
                if(isChecked){
                    Toast.makeText(this, ((RadioButton) view).getText() + ":" + "012" , Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

}
