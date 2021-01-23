package com.example.planetcat_nh2.models.INQUIRE;

import com.example.planetcat_nh2.models.Header;
import com.google.gson.annotations.SerializedName;

public class InquireCreditCardAuthorizationHistory {

    private Header Header;

    @SerializedName("FinCard")
    private String FinCard;

    @SerializedName("IousDsnc")
    private String IousDsnc;

    @SerializedName("Insymd")
    private String Insymd;

    @SerializedName("Ineymd")
    private String Ineymd;

    @SerializedName("PageNo")
    private String PageNo;

    @SerializedName("Dmcnt")
    private String Dmcnt;


    // 여기서 부터 RESPONSE
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

    @SerializedName("CtntDataYn")
    private String CtntDataYn;

    @SerializedName("TotCnt")
    private String TotCnt;

    @SerializedName("Iqtcnt")
    private String Iqtcnt;

    @SerializedName("REC")
    private String REC;

    @SerializedName("CardAthzNo")
    private String CardAthzNo;

    @SerializedName("Trdd")
    private String Trdd;

    @SerializedName("Txtm")
    private String Txtm;

    @SerializedName("Usam")
    private String Usam;

    @SerializedName("AfstNoBrno")
    private String AfstNoBrno;

    @SerializedName("AfstNo")
    private String AfstNo;

    @SerializedName("AfstNm")
    private String AfstNm;

    @SerializedName("AmslKnd")
    private String AmslKnd;

    @SerializedName("Tris")
    private String Tris;

    @SerializedName("Ccyn")
    private String Ccyn;

    @SerializedName("CnclYmd")
    private String CnclYmd;

    @SerializedName("Crcd")
    private String Crcd;

    @SerializedName("AcplUsam")
    private String AcplUsam;

    public String getAthrCnfrTckt() { return AthrCnfrTckt; }

    public String getWebUrl() { return WebUrl; }

    public String getAndInltUrl() { return AndInltUrl; }

    public String getAndWebUrl() { return AndWebUrl; }

    public String getCtntDataYn() { return CtntDataYn; }

    public String getTotCnt() { return TotCnt; }

    public String getIqtcnt() { return Iqtcnt; }

    public String getREC() { return REC; }

    public String getCardAthzNo() { return CardAthzNo; }

    public String getTrdd() { return Trdd; }

    public String getTxtm() { return Txtm; }

    public String getUsam() { return Usam; }

    public String getAfstNoBrno() { return AfstNoBrno; }

    public String getAfstNo() { return AfstNo; }

    public String getAfstNm() { return AfstNm; }

    public String getAmslKnd() { return AmslKnd; }

    public String getTris() { return Tris; }

    public String getCcyn() { return Ccyn; }

    public String getCnclYmd() { return CnclYmd; }

    public String getCrcd() { return Crcd; }

    public String getAcplUsam() { return AcplUsam; }

    public InquireCreditCardAuthorizationHistory(Header Header, String FinCard, String IousDsnc, String Insymd, String Ineymd, String PageNo, String Dmcnt){
        this.Header = Header;
        this.FinCard = FinCard;
        this.IousDsnc = IousDsnc;
        this.Insymd = Insymd;
        this.Ineymd = Ineymd;
        this.PageNo = PageNo;
        this.Dmcnt = Dmcnt;
    }
}
