package com.example.planetcat_nh2.apis;
import com.example.planetcat_nh2.models.ConfirmPin;
import com.example.planetcat_nh2.models.P2P.P2PNInvestmentLoanExecutionResultInquiry;
import com.example.planetcat_nh2.models.TRANSFER.DrawingTransfer;
import com.example.planetcat_nh2.models.INQUIRE.InquireBalance;
import com.example.planetcat_nh2.models.INQUIRE.InquireCreditCardAuthorizationHistory;
import com.example.planetcat_nh2.models.INQUIRE.InquireDepositor;
import com.example.planetcat_nh2.models.INQUIRE.InquireDepositor_Other;
import com.example.planetcat_nh2.models.INQUIRE.InquireExchangeRate;
import com.example.planetcat_nh2.models.INQUIRE.InquireTransactionHistory;
import com.example.planetcat_nh2.models.USER.Login;
import com.example.planetcat_nh2.models.P2P.P2PNAccountReceiveInformationList;
import com.example.planetcat_nh2.models.P2P.P2PNInvestmentPaymentOrder;
import com.example.planetcat_nh2.models.P2P.P2PNVirtualAccountNumberRequest;
import com.example.planetcat_nh2.models.PinItem2;
import com.example.planetcat_nh2.models.TRANSFER.ReceivedTransferAccountNumber;
import com.example.planetcat_nh2.models.TRANSFER.ReceivedTransferOtherBank;

import retrofit2.Call;
import retrofit2.http.Body;
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

    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("InquireExchangeRate.nh")
    Call<InquireExchangeRate> inquireExchangeRate(@Body InquireExchangeRate inquireExchangeRate);

    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("P2PNVirtualAccountNumberRequest.nh")
    Call<P2PNVirtualAccountNumberRequest> p2PNVirtualAccountNumberRequest(@Body P2PNVirtualAccountNumberRequest p2PNVirtualAccountNumberRequest);

    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("P2PNAccountReceiveInformationList.nh")
    Call<P2PNAccountReceiveInformationList> p2PNAccountReceiveInformationList(@Body P2PNAccountReceiveInformationList p2PNAccountReceiveInformationList);

    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("P2PNInvestmentPaymentOrder.nh")
    Call<P2PNInvestmentPaymentOrder> p2PNInvestmentPaymentOrder(@Body P2PNInvestmentPaymentOrder p2PNInvestmentPaymentOrder);

    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("P2PNInvestmentLoanExecutionResultInquiry.nh")
    Call<P2PNInvestmentLoanExecutionResultInquiry> p2PNInvestmentLoanExecutionResultInquiry(@Body P2PNInvestmentLoanExecutionResultInquiry p2PNInvestmentLoanExecutionResultInquiry);

    // 서버에 로그인 하기위한 영역
    @Headers("Content-Type: application/json; charset=UTF-8;")
    @POST("/user/login")
    Call<Login> login(@Body Login login);
}
