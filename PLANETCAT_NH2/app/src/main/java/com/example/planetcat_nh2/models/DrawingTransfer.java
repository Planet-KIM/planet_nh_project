package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

public class DrawingTransfer {

    private Header Header;
    
    @SerializedName("FinAcno")
    private String FinAcno;

    private String Tram;

    private String DractOtlt;

    @SerializedName("RgsnYmd")
    private String RgsnYmd;
    

    public Header getHeader() { return Header; }
    public String getFinAcno () { return FinAcno; }
    public String getTram() { return Tram; }
    public String getDractOtlt() { return DractOtlt; }

    public DrawingTransfer(Header Header, String FinAcno, String Tram, String DractOtlt){
        this.Header = Header;
        this.FinAcno = FinAcno;
        this.Tram = Tram;
        this.DractOtlt = DractOtlt;
    }

}
