package com.example.planetcat_nh2.apis;
import com.example.planetcat_nh2.models.PinItem;
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

    // Pin 발급
    @FormUrlEncoded
    @Headers("Content-Type: application/json")
    @POST("/OpenFinAccountDirect.nh")
    Call<PostItem> postPinAccount(@FieldMap HashMap<String, Object> params);

    // Pin 발급 2
    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/OpenFinAccountDirect.nh")
    Call<PinItem> postPinAccount2(@Body PinItem item);

    // Pin 발급확인
    @FormUrlEncoded
    @Headers("Content-Type: application/json")
    @POST("/CheckOpenFinAccountDirect.nh")
    Call<PostItem> postPinAccountConfirm(@FieldMap HashMap<String, Object> params);

    // 예금주 확인
    @FormUrlEncoded
    @Headers("Content-Type: application/json")
    @POST("/InquireDepositorAccountNumber.nh")
    Call<PostItem> postDespoitorAccNum(@FieldMap HashMap<String, Object> params);

    // 타행 예금주 확인
    @FormUrlEncoded
    @Headers("Content-Type: application/json")
    @POST("/InquireDepositorOtherBank.nh")
    Call<PostItem> postDepositorOtherBank(@FieldMap HashMap<String, Object> params);


    @POST("/user/login")
    @Headers("Content-Type: application/json")
    @FormUrlEncoded
    Call<PostItem> login(
            @Field("name") String name,
            @Field("password") String password);
}
