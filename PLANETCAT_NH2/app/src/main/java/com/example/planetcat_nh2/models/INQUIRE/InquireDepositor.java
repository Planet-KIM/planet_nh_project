package com.example.planetcat_nh2.models.INQUIRE;

import com.example.planetcat_nh2.models.Header;
import com.google.gson.annotations.SerializedName;

public class InquireDepositor {

    private Header Header;

    private String Bncd;

    @SerializedName("Acno")
    private String Acno;

    @SerializedName("Dpnm")
    private String Dpnm;


    public Header getHeader() { return Header; }
    public String getBncd ()
    {
        return Bncd;
    }
    public String getAcno() { return Acno; }

    public InquireDepositor(Header Header, String Bncd, String Acno){
        this.Header = Header;
        this.Bncd = Bncd;
        this.Acno = Acno;
    }

}
