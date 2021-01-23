package com.example.planetcat_nh2.models.INQUIRE;

import com.example.planetcat_nh2.models.Header;
import com.google.gson.annotations.SerializedName;


//거래 내역 조회 모델
public class InquireTransactionHistory {

    private Header Header;

    @SerializedName("Bncd")
    private String Bncd;

    @SerializedName("Acno")
    private String Acno;

    @SerializedName("Insymd")
    private String Insymd;

    @SerializedName("Ineymd")
    private String Ineymd;

    @SerializedName("TrnsDsnc")
    private String TrnsDsnc;

    @SerializedName("Lnsq")
    private String Lnsq;

    @SerializedName("PageNo")
    private String PageNo;

    @SerializedName("Dmcnt")
    private String Dmcnt;

    // RESPONSE
    @SerializedName("CtntDataYn")
    private String CtntDataYn;

    @SerializedName("TotCnt")
    private String TotCnt;

    @SerializedName("Iqtcnt")
    private String Iqtcnt;

    @SerializedName("REC")
    private String REC;

    @SerializedName("Trdd")
    private String Trdd;

    @SerializedName("Txtm")
    private String Txtm;

    @SerializedName("MnrcDrotDsnc")
    private String MnrcDrotDsnc;

    @SerializedName("AftrBlnc")
    private String AftrBlnc;

    @SerializedName("TrnsAfAcntBlncSmblCd")
    private String TrnsAfAcntBlncSmblCd;

    @SerializedName("Smr")
    private String Smr;

    @SerializedName("HnisCd")
    private String HnisCd;

    @SerializedName("HnbrCd")
    private String HnbrCd;

    @SerializedName("Ccyn")
    private String Ccyn;

    @SerializedName("Tuno")
    private String Tuno;

    @SerializedName("BnprCntn")
    private String BnprCntn;

    public String getCtntDataYn() { return CtntDataYn; }

    public String getTotCnt() { return TotCnt; }

    public String getIqtcnt() { return Iqtcnt; }

    public String getREC() { return REC; }

    public String getTrdd() { return Trdd; }

    public String getTxtm() { return Txtm; }

    public String getMnrcDrotDsnc() { return MnrcDrotDsnc; }

    public String getAftrBlnc() { return AftrBlnc; }

    public String getTrnsAfAcntBlncSmblCd() { return TrnsAfAcntBlncSmblCd; }

    public String getSmr() { return Smr; }

    public String getHnisCd() { return HnisCd; }

    public String getHnbrCd() { return HnbrCd; }

    public String getCcyn() { return Ccyn; }

    public String getTuno() { return Tuno; }

    public String getBnprCntn() { return BnprCntn; }

    public InquireTransactionHistory(Header Header, String Bncd, String Acno, String Insymd, String Ineymd, String TrnsDsnc, String Lnsq, String PageNo, String Dmcnt){
        this.Header = Header;
        this.Bncd = Bncd;
        this.Acno = Acno;
        this.Insymd = Insymd;
        this.Ineymd = Ineymd;
        this.TrnsDsnc = TrnsDsnc;
        this.Lnsq = Lnsq;
        this.PageNo = PageNo;
        this.Dmcnt = Dmcnt;
    }
}
