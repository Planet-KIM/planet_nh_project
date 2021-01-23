package com.example.planetcat_nh2.models.P2P;

import com.example.planetcat_nh2.models.Header;
import com.google.gson.annotations.SerializedName;


public class P2PNInvestmentPaymentOrder {

    private Header Header;

    @SerializedName("P2pCmtmNo")
    private String P2pCmtmNo;

    @SerializedName("ChidSqno")
    private String ChidSqno;

    @SerializedName("SlctAmt")
    private String SlctAmt;

    @SerializedName("LonTrm")
    private String LonTrm;

    @SerializedName("InvSumAmt")
    private String InvSumAmt;

    @SerializedName("NewTrnsYn")
    private String NewTrnsYn;

    @SerializedName("LoanNo")
    private String LoanNo;

    @SerializedName("Bncd")
    private String Bncd;

    @SerializedName("BrwAcno")
    private String BrwAcno;

    @SerializedName("Dpnm")
    private String Dpnm;

    @SerializedName("LonApcYmd")
    private String LonApcYmd;

    @SerializedName("DractOtlt")
    private String DractOtlt;

    @SerializedName("MractOtlt")
    private String MractOtlt;

    @SerializedName("Rec")
    private String Rec;

    @SerializedName("Vran")
    private String Vran;

    @SerializedName("InvAmt")
    private String InvAmt;

    // Response //
    public String getP2pCmtmNo() { return P2pCmtmNo; }

    public String getChidSqno() { return ChidSqno; }

    public String getLoanNo() { return LoanNo; }

    private String InvAccAmt;
    public String getInvAccAmt() { return InvAccAmt; }

    public String InvSumAmt() { return InvSumAmt; }
    //  ~~~~~~ //


    // 생성자에서 받을 변수처리
    public P2PNInvestmentPaymentOrder(Header Header, String P2pCmtmNo, String ChidSqno, String SlctAmt,
                                      String LonTrm, String InvSumAmt, String NewTrnsYn, String LoanNo,
                                      String Bncd, String BrwAcno, String Dpnm, String LonApcYmd, String DractOtlt,
                                      String MractOtlt, String Rec, String Vran, String InvAmt){
        this.Header = Header;
        this.P2pCmtmNo = P2pCmtmNo;
        this.ChidSqno = ChidSqno;
        this.SlctAmt = SlctAmt;
        this.LonTrm = LonTrm;
        this.InvSumAmt = InvSumAmt;
        this.NewTrnsYn = NewTrnsYn;
        this.LoanNo = LoanNo;
        this.Bncd = Bncd;
        this.BrwAcno = BrwAcno;
        this.Dpnm = Dpnm;
        this.LonApcYmd = LonApcYmd;
        this.DractOtlt = DractOtlt;
        this.MractOtlt = MractOtlt;
        this.Rec = Rec;
        this.Vran = Vran;
        this.InvAmt = InvAmt;
    }
}
