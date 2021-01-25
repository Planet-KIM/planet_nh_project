package com.example.planetcat_nh2.models.GIRO;

import com.example.planetcat_nh2.models.Header;
import com.google.gson.annotations.SerializedName;

public class SewageFarePayment {

    private Header Header;

    @SerializedName("PbtxGroNo")
    private String PbtxGroNo;

    @SerializedName("PbtxInstClasCd")
    private String PbtxInstClasCd;

    @SerializedName("PbtxPytxno")
    private String PbtxPytxno;

    @SerializedName("PbtxElcrPmntNo")
    private String PbtxElcrPmntNo;

    @SerializedName("Acno")
    private String Acno;

    @SerializedName("PayRcrdSbjcCntn")
    private String PayRcrdSbjcCntn;

    @SerializedName("Tram")
    private String Tram;

    @SerializedName("Isnm")
    private String Isnm;

    @SerializedName("TmpmWthnDay")
    private String TmpmWthnDay;

    @SerializedName("PryNm")
    private String PryNm;

    @SerializedName("TxitNm")
    private String TxitNm;

    //RESPONSE
    public String getPbtxGroNo() { return PbtxGroNo; }

    public String getPbtxInstClasCd() { return PbtxInstClasCd; }

    public String getPbtxPytxno() { return PbtxPytxno; }

    public String getPbtxElcrPmntNo() { return PbtxElcrPmntNo; }

    public String getPayRcrdSbjcCntn() { return PayRcrdSbjcCntn; }

    @SerializedName("PryAmt")
    private String PryAmt;

    public String getPryAmt() { return PryAmt; }

    public String getIsnm() { return Isnm; }

    public String getTmpmWthnDay() { return TmpmWthnDay; }

    public String getPryNm() { return PryNm; }

    public SewageFarePayment(Header Header, String PbtxGroNo, String PbtxInstClasCd, String PbtxPytxno, String PbtxElcrPmntNo,
                                String Acno, String PayRcrdSbjcCntn, String Tram, String Isnm, String TmpmWthnDay, String PryNm, String TxitNm){
        this.Header = Header;
        this.PbtxGroNo = PbtxGroNo;
        this.PbtxInstClasCd = PbtxInstClasCd;
        this.PbtxPytxno = PbtxPytxno;
        this.PbtxElcrPmntNo = PbtxElcrPmntNo;
        this.Acno = Acno;
        this.PayRcrdSbjcCntn = PayRcrdSbjcCntn;
        this.Tram = Tram;
        this.Isnm = Isnm;
        this.TmpmWthnDay = TmpmWthnDay;
        this.PryNm = PryNm;
        this.TxitNm = TxitNm;
    }
}
