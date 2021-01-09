package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

//기능 : 핀-어카운트 연결계좌에 대한 잔액을 조회합니다.
public class InquireBalance {

    private Header Header;

    // 여기서 부터 RESPONSE
    @SerializedName("FinAcno")
    private String FinAcno;

    @SerializedName("AthrCnfrTckt")
    private String AthrCnfrTckt;

    @SerializedName("WebUrl")
    private String WebUrl;

    @SerializedName("AndInltUrl")
    private String AndInltUrl;

    @SerializedName("AndAppUrl")
    private String AndAppUrl;

    @SerializedName("AndWebUrl")
    private String AndWebUrl;

    @SerializedName("Ldbl")
    private String Ldbl;

    @SerializedName("RlpmAbamt")
    private String RlpmAbamt;

    public String getFinAcno() { return FinAcno; }

    public String getAthrCnfrTckt() { return AthrCnfrTckt; }

    public String getWebUrl() { return WebUrl; }

    public String getAndInltUrl() { return AndInltUrl; }

    public String getAndWebUrl() { return AndWebUrl; }

    public String getLdbl() { return Ldbl; }

    public String getRlpmAbamt() { return RlpmAbamt; }

    public InquireBalance(Header Header, String FinAcno){

        this.Header = Header;
        this.FinAcno = FinAcno;
    }
}
