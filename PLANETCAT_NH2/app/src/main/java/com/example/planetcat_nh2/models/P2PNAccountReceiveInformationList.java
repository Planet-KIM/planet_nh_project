package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

public class P2PNAccountReceiveInformationList {

    private Header Header;

    @SerializedName("P2pCmtmNo")
    private String P2pCmtmNo;

    @SerializedName("ChidSqno")
    private String ChidSqno;

    @SerializedName("Vran")
    private String Vran;

    @SerializedName("Iqds")
    private String Iqds;

    @SerializedName("Insymd")
    private String Insymd;

    @SerializedName("Ineymd")
    private String Ineymd;

    @SerializedName("PageNo")
    private String PageNo;

    public String getP2pCmtmNo() { return P2pCmtmNo; }

    public String getChidSqno() { return ChidSqno; }

    private String UseAblAmt;
    public String getUseAblAmt() { return UseAblAmt; }

    private String ThdDepsAmt;
    public String getThdDepsAmt() { return ThdDepsAmt; }

    private String TotCnt;
    public String getTotCnt() { return TotCnt; }

    private String Iqtcnt;
    public String getIqtcnt() { return Iqtcnt; }

    public String getPageNo() { return PageNo; }

    private String REC;
    public String getREC() { return REC; }

    private String Sqno;
    public String getSqno() { return Sqno; }

    public String getVran() { return Vran; }

    private String RcvYmd;
    public String getRcvYmd() { return RcvYmd; }

    private String RcvAmt;
    public String getRcvAmt() { return  RcvAmt; }

    
    public P2PNAccountReceiveInformationList(Header Header, String P2pCmtmNo, String ChidSqno, String Vran, String Iqds, String Insymd, String Ineymd){

        this.Header = Header;
        this.P2pCmtmNo = P2pCmtmNo;
        this.ChidSqno = ChidSqno;
        this.Vran = Vran;
        this.Iqds = Iqds;
        this.Insymd = Insymd;
        this.Ineymd = Ineymd;
        this.PageNo = PageNo;
    }
}
