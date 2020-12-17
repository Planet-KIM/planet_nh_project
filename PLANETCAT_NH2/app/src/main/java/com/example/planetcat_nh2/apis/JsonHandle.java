package com.example.planetcat_nh2.apis;
import com.example.planetcat_nh2.models.ConfirmPin;
import com.example.planetcat_nh2.models.PinItem;
import com.example.planetcat_nh2.models.PinItem2;
import com.example.planetcat_nh2.models.PostItem;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface JsonHandle {

    // Pin 발급 2
    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/OpenFinAccountDirect.nh")
    Call<PinItem2> postPinAccount2(@Body PinItem2 item);

    // Pin 발급확인
    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/CheckOpenFinAccountDirect.nh")
    Call<ConfirmPin> postPinAccountConfirm(@Body ConfirmPin confirmPin);

    // 예금주 확인
    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/InquireDepositorAccountNumber.nh")
    Call<PostItem> postDespoitorAccNum(@FieldMap HashMap<String, Object> params);

    // 타행 예금주 확인
    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/InquireDepositorOtherBank.nh")
    Call<PostItem> postDepositorOtherBank(@FieldMap HashMap<String, Object> params);
    
    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/user/login")
    Call<PostItem> login(
            @Field("name") String name,
            @Field("password") String password);
}
