package com.example.planetcat_nh2.apis;
import com.example.planetcat_nh2.models.ConfirmPin;
import com.example.planetcat_nh2.models.DrawingTransfer;
import com.example.planetcat_nh2.models.InquireDepositor;
import com.example.planetcat_nh2.models.InquireDepositor_Other;
import com.example.planetcat_nh2.models.PinItem;
import com.example.planetcat_nh2.models.PinItem2;
import com.example.planetcat_nh2.models.PostItem;
import com.example.planetcat_nh2.models.ReceivedTransferAccountNumber;
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
    Call<InquireDepositor> postDespoitorAccNum(@Body InquireDepositor inquireDepositor);

    // 타행 예금주 확인
    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/InquireDepositorOtherBank.nh")
    Call<InquireDepositor_Other> postDepositorOtherBank(@Body InquireDepositor_Other inquireDepositor_other);


    // 출금 이체 - 고객계좌에서 핀테크 기업 약정계좌로 핀-어카운트를 이용하여 출금
    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/DrawingTransfer.nh")
    Call<DrawingTransfer> DrawingTransfer(@Body DrawingTransfer drawingTransfer);


    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/ReceivedTransferAccountNumber.nh")
    Call<ReceivedTransferAccountNumber> ReceivedTransferAccountNumber(@Body ReceivedTransferAccountNumber receivedTransferAccountNumber);

    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/user/login")
    Call<PostItem> login(
            @Field("name") String name,
            @Field("password") String password);
}
