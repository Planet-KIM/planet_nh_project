package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

public class P2PNVirtualAccountNumberRequest {



    private Header Header;

    @SerializedName("P2PCmtmNo")
    private String P2PCmtmNo;

    @SerializedName("ChidSqno")
    private String ChidSqno;

    @SerializedName("P2PVractUsg")
    private String P2PVractUsg;

    @SerializedName("InvstBrwNm")
    private String InvstBrwNm;

    public String getP2PCmtmNo() { return P2PCmtmNo; }

    public String getChidSqno() { return ChidSqno; }

    private String Vran;
    public String getVran() { return Vran; }

    public String getP2PVractUsg() { return P2PVractUsg; }

    public String getInvstBrwNm() { return InvstBrwNm; }

    public P2PNVirtualAccountNumberRequest(Header Header, String P2PCmtmNo, String ChidSqno, String P2PVractUsg, String InvstBrwNm){
        this.Header = Header;
        this.P2PCmtmNo = P2PCmtmNo;
        this.ChidSqno = ChidSqno;
        this.InvstBrwNm = InvstBrwNm;
    }
}
