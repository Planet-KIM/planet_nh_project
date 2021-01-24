package com.example.planetcat_nh2.models.P2P;

import com.example.planetcat_nh2.models.Header;
import com.google.gson.annotations.SerializedName;

public class P2PNInvestmentDepositAmountReturn {

    private Header Header;

    @SerializedName("P2pCmtmNo")
    private String P2pCmtmNo;

    @SerializedName("ChidSqno")
    private String ChidSqno;

    @SerializedName("Vran")
    private String Vran;

    @SerializedName("RtnAmt")
    private String RtnAmt;

    @SerializedName("Bncd")
    private String Bncd;

    @SerializedName("Dpnm")
    private String Dpnm;

    @SerializedName("IvstrAcct")
    private String IvstrAcct;

    @SerializedName("MractOtlt")
    private String MractOtlt;

    public Header getHeader() {
        return Header;
    }

    public P2PNInvestmentDepositAmountReturn(Header Header, String P2pCmtmNo, String ChidSqno, String Vran, String RtnAmt, String Bncd, String Dpnm, String IvstrAcct, String MractOtlt){
        this.Header = Header;
        this.P2pCmtmNo = P2pCmtmNo;
        this.ChidSqno = ChidSqno;
        this.Vran = Vran;
        this.RtnAmt = RtnAmt;
        this.Bncd = Bncd;
        this.Dpnm = Dpnm;
        this.IvstrAcct = IvstrAcct;
        this.MractOtlt = MractOtlt;
    }
}
