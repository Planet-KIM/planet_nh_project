package com.example.planetcat_nh2.models.P2P;

import com.example.planetcat_nh2.models.Header;
import com.google.gson.annotations.SerializedName;

public class P2PNInterestPaymentAccountReceiveResultConfirmation {

    private Header Header;

    @SerializedName("P2pCmtmNo")
    private String P2pCmtmNo;

    @SerializedName("ChidSqno")
    private String ChidSqno;

    @SerializedName("LoanNo")
    private String LoanNo;

    @SerializedName("OrtrYmd")
    private String OrtrYmd;

    @SerializedName("OrtrIsTuno")
    private String OrtrIsTuno;

    public String getP2pCmtmNo() { return P2pCmtmNo; }

    public String getChidSqno() { return ChidSqno; }

    public String getLoanNo() { return LoanNo; }

    @SerializedName("Pcrs")
    private String Pcrs;

    public String getPcrs() { return Pcrs; }

    @SerializedName("Prtm")
    private String Prtm;

    public String getPrtm() { return Prtm; }


    public P2PNInterestPaymentAccountReceiveResultConfirmation(Header Header, String P2pCmtmNo, String ChidSqno, String LoanNo, String OrtrYmd, String OrtrIsTuno){
        this.Header = Header;
        this.P2pCmtmNo = P2pCmtmNo;
        this.ChidSqno = ChidSqno;
        this.LoanNo = LoanNo;
        this.OrtrYmd = OrtrYmd;
        this.OrtrIsTuno = OrtrIsTuno;
    }
}
