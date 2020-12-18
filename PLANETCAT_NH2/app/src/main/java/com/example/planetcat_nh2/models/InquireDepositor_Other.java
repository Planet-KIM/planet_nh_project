package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

public class InquireDepositor_Other {

    private Header Header;

    private String Bncd;

    @SerializedName("Acno")
    private String Acno;

    @SerializedName("Dpnm")
    private String Dpnm;

    public Header getHeader() { return Header; }
    public String getBncd () { return Bncd; }
    public String getAcno() { return Acno; }

    public InquireDepositor_Other(Header Header, String Bncd, String Acno){
        this.Header = Header;
        this.Bncd = Bncd;
        this.Acno = Acno;
    }


}
