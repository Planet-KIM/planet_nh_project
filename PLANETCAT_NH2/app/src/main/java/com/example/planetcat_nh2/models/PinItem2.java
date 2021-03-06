package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class PinItem2 {

    // Response할 값을 가져오는 부분입니다.
    @SerializedName("Rgno")
    private String Rgno;

    private String Bncd;

    private String DrtrRgyn;

    private Header Header;

    private String BrdtBrno;

    private String Acno;

    // Pin account 받기
    public String getRgno() {
        return Rgno;
    }

    public String getBncd ()
    {
        return Bncd;
    }

    public String getDrtrRgyn ()
    {
        return DrtrRgyn;
    }

    public Header getHeader ()
    {
        return Header;
    }

    public String getBrdtBrno ()
    {
        return BrdtBrno;
    }

    public String getAcno ()
    {
        return Acno;
    }

    // Request할 값을 해주는 것입니다.
    public PinItem2(Header Header, String DrtrRgyn, String BrdtBrno, String Bncd, String Acno){
        this.Header = Header;
        this.DrtrRgyn = DrtrRgyn;
        this.BrdtBrno = BrdtBrno;
        this.Bncd = Bncd;
        this.Acno = Acno;
        this.Acno = Acno;
    }
}
