package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

public class ReceivedTransferAccountNumber {
    private Header Header;

    private String Bncd;

    private String Acno;

    private String Tram;

    private String DractOtlt;

    private String MractOtlt;

    public Header getHeader() { return Header; }
    public String getBncd() { return Bncd; }
    public String getAcno() { return Acno; }
    public String getTram() { return Tram; }
    public String getDractOtlt() { return DractOtlt; }
    public String getMractOtlt() {return MractOtlt; }

    public ReceivedTransferAccountNumber(Header Header, String Bncd, String Acno, String Tram, String DractOtlt, String MractOtlt){
        this.Header = Header;
        this.Bncd = Bncd;
        this.Acno = Acno;
        this.Tram = Tram;
        this.DractOtlt = DractOtlt;
        this.MractOtlt = MractOtlt;
    }
}
