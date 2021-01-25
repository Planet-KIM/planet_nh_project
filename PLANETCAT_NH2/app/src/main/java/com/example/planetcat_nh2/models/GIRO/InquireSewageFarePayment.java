package com.example.planetcat_nh2.models.GIRO;

import com.example.planetcat_nh2.models.Header;
import com.google.gson.annotations.SerializedName;

public class InquireSewageFarePayment {

    private Header Header;

    @SerializedName("ElecCsmrNo")
    private String ElecCsmrNo;

    @SerializedName("Acno")
    private String Acno;

    @SerializedName("PageNo")
    private String PageNo;

    //RESPONSE
    @SerializedName("TotCnt")
    private String TotCnt;

    public String getTotCnt() { return TotCnt; }

    @SerializedName("IqtCnt")
    private String IqtCnt;

    public String getIqtCnt() { return IqtCnt; }

    @SerializedName("CtntDataYn")
    private String CtntDataYn;

    public String getCtntDataYn() { return CtntDataYn; }

    @SerializedName("REC")
    private String REC;

    public String getREC() { return REC;}

    @SerializedName("PbtxGroNo")
    private String PbtxGroNo;

    public String getPbtxGroNo() { return PbtxGroNo; }

    @SerializedName("PbtxInstClasCd")
    private String PbtxInstClasCd;

    public String getPbtxInstClasCd() { return PbtxInstClasCd; }

    @SerializedName("PbtxPytxno")
    private String PbtxPytxno;

    public String getPbtxPytxno() { return PbtxPytxno; }

    @SerializedName("PbtxElcrPmntNo")
    private String PbtxElcrPmntNo;

    public String getPbtxElcrPmntNo() { return PbtxElcrPmntNo; }

    @SerializedName("Isnm")
    private String Isnm;

    public String getIsnm() { return Isnm; }

    @SerializedName("TxitNm")
    private String TxitNm;

    public String getTxitNm() { return TxitNm; }

    @SerializedName("PbtxNtfFrmt")
    private String PbtxNtfFrmt;

    public String getPbtxNtfFrmt() { return PbtxNtfFrmt; }

    @SerializedName("Tram")
    private String Tram;

    public String getTram() { return Tram; }

    @SerializedName("PbtxTmpmDsnc")
    private String PbtxTmpmDsnc;

    public String getPbtxTmpmDsnc() { return PbtxTmpmDsnc; }

    @SerializedName("TmpmWthnDay")
    private String TmpmWthnDay;

    public String getTmpmWthnDay() { return TmpmWthnDay; }

    @SerializedName("PbtxAhstRcvDvCd")
    private String PbtxAhstRcvDvCd;

    public String getPbtxAhstRcvDvCd() { return PbtxAhstRcvDvCd; }

    @SerializedName("PbtxAttrRgsnYn")
    private String PbtxAttrRgsnYn;

    public String getPbtxAttrRgsnYn() { return PbtxAttrRgsnYn; }

    public InquireSewageFarePayment(Header Header, String ElecCsmrNo, String Acno){
        this.Header = Header;
        this.ElecCsmrNo = ElecCsmrNo;
        this.Acno = Acno;
    }
}
