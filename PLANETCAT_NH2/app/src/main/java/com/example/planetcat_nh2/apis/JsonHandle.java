package com.example.planetcat_nh2.apis;
import com.example.planetcat_nh2.models.ConfirmPin;
import com.example.planetcat_nh2.models.DrawingTransfer;
import com.example.planetcat_nh2.models.InquireBalance;
import com.example.planetcat_nh2.models.InquireCreditCardAuthorizationHistory;
import com.example.planetcat_nh2.models.InquireDepositor;
import com.example.planetcat_nh2.models.InquireDepositor_Other;
import com.example.planetcat_nh2.models.InquireTransactionHistory;
import com.example.planetcat_nh2.models.Login;
import com.example.planetcat_nh2.models.PinItem;
import com.example.planetcat_nh2.models.PinItem2;
import com.example.planetcat_nh2.models.PostItem;
import com.example.planetcat_nh2.models.ReceivedTransferAccountNumber;
import com.example.planetcat_nh2.models.ReceivedTransferOtherBank;
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
    Call<DrawingTransfer> drawingTransfer(@Body DrawingTransfer drawingTransfer);


    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/ReceivedTransferAccountNumber.nh")
    Call<ReceivedTransferAccountNumber> receivedTransferAccountNumber(@Body ReceivedTransferAccountNumber receivedTransferAccountNumber);

    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/ReceivedTransferOtherBank.nh")
    Call<ReceivedTransferOtherBank> receivedTransferOtherBank(@Body ReceivedTransferOtherBank receivedTransferOtherBank);

    //거래 내역 조회 Handler
    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/InquireTransactionHistory.nh")
    Call<InquireTransactionHistory> inquireTransactionHistory(@Body InquireTransactionHistory inquireTransactionHistory);

    //핀-어카운트 연결계좌에 대한 잔액을 조회합니다.
    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/InquireBalance.nh")
    Call<InquireBalance> inquireBalance(@Body InquireBalance inquireBalance);

    //핀-카드에 연결된 개인카드의 승인내역을 조회한다.
    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("InquireCreditCardAuthorizationHistory.nh")
    Call<InquireCreditCardAuthorizationHistory> inquireCreditCardAuthorizationHistory(@Body InquireCreditCardAuthorizationHistory inquireCreditCardAuthorizationHistory);

    // 서버에 로그인 하기위한 영역
    @Headers("Content-Type: application/json; charset=UTF-8;")
    @POST("/user/login")
    Call<Login> login(@Body Login login);
}
