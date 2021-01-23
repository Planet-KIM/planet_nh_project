package com.example.planetcat_nh2.models.P2P;

import com.example.planetcat_nh2.models.Header;
import com.google.gson.annotations.SerializedName;

public class P2PNInterestRepayment {

    private Header Header;

    @SerializedName("P2pCmtmNo")
    private String P2pCmtmNo;

    @SerializedName("ChidSqno")
    private String ChidSqno;

    @SerializedName("LoanNo")
    private String LoanNo;

    @SerializedName("Vran")
    private String Vran;

    @SerializedName("RpaySumAmt")
    private String RpaySumAmt;

    @SerializedName("RpayYmd")
    private String RpayYmd;

    @SerializedName("DractOtlt")
    private String DractOtlt;

    @SerializedName("MractOtlt")
    private String MractOtlt;

    @SerializedName("Rec")
    private Rec[] Rec;

    public Header getHeader() { return Header; }
    public Rec[] getRec() { return Rec; }
    
    public P2PNInterestRepayment(Header Header, String P2pCmtmNo,String ChidSqno, String LoanNo, String Vran,
                                 String RpaySumAmt, String RpayYmd, String DractOtlt, String MractOtlt, Rec[] Rec){
        this.Header = Header;
        this.P2pCmtmNo = P2pCmtmNo;
        this.ChidSqno = ChidSqno;
        this.LoanNo = LoanNo;
        this.Vran = Vran;
        this.RpaySumAmt = RpaySumAmt;
        this.RpayYmd = RpayYmd;
        this.DractOtlt = DractOtlt;
        this.MractOtlt = MractOtlt;
        this.Rec = Rec;
    }

}
