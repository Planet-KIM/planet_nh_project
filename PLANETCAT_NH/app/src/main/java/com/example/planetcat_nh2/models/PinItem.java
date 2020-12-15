package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.util.HashMap;

public class PinItem {

    @SerializedName("Rgno")
    private String Rgno;

    @SerializedName("Header")
    private JSONObject Header;

    @SerializedName("DrtrRgyn")
    private String DrtrRgyn;

    @SerializedName("BrdtBrno")
    private String BrdtBrno;

    @SerializedName("Bncd")
    private String Bncd;

    @SerializedName("Acno")
    private String Acno;

    // Pin account 받기
    public String getRgno() {
        return Rgno;
    }

    /*public void setRgno(String Rgno){
        this.Rgno = Rgno;
    }*/

    // Header confirm
    public JSONObject getHeader() {
        return Header;
    }

    public String getDrtrRgyn() {
        return DrtrRgyn;
    }
    public String getBrdtBrno() {
        return BrdtBrno;
    }

    public String getBncd() {
        return Bncd;
    }

    public String getAcno() {
        return Acno;
    }

    /*public void setHeader(JSONObject Header){
        this.Header = Header;
    }*/

    public PinItem(JSONObject Header, String DrtrRgyn, String BrdtBrno, String Bncd, String Acno){
        this.Header = Header;
        this.DrtrRgyn = DrtrRgyn;
        this.BrdtBrno = BrdtBrno;
        this.Bncd = Bncd;
        this.Acno = Acno;
    }


}
