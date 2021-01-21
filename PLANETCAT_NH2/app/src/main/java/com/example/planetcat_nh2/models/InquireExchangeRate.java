package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

public class InquireExchangeRate {

    private Header Header;

    @SerializedName("Btb")
    private String Btb;

    @SerializedName("Crcd")
    private String Crcd;
    public String getCrcd() { return Crcd; }

    @SerializedName("Inymd")
    private String Inymd;

    private String Iqtcnt;
    public String getIqtcnt(){ return Iqtcnt; }

    private String REC;
    public String getREC(){ return REC; }

    private String RgsnTmbt;
    public String getRgsnTmbt(){ return RgsnTmbt; }

    private String CshBnrt;
    public String getCshBnrt() { return CshBnrt; }

    private String CshSlrt;
    public String getCshSlrt() { return CshSlrt; }

    private String TlchPrnlBnrt;
    public String getTlchPrnlBnrt() { return TlchPrnlBnrt; }

    private String TlchPrnlSlrt;
    public String getTlchPrnlSlrt() { return TlchPrnlSlrt; }

    private String TcBnrt;
    public String getTcBnrt() { return TcBnrt; }

    private String TcSlrt;
    public String getTcSlrt() { return TcSlrt; }

    private String BrgnBsrt;
    public String getBrgnBsrt() { return BrgnBsrt; }


    public InquireExchangeRate(Header Header, String Btb, String Crcd, String Inymd){
        this.Header = Header;
        this.Btb = Btb;
        this.Crcd = Crcd;
        this.Inymd = Inymd;
    }
}
