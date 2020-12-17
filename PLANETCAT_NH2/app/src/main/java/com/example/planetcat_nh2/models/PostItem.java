package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

public class PostItem {

    @SerializedName("body")
    private String Header;

    @SerializedName("body")
    private String DrtRgyn;

    @SerializedName("body")
    private String BrdtBrno;

    @SerializedName("body")
    private String Bncd;

    @SerializedName("body")
    private String Acno;

    public String getHeader() {
        return Header;
    }
    
    public void setHeader(String Header){
        this.Header = Header;
    }

    public String getDrtRgyn() {
        return DrtRgyn;
    }

    public void setDrtRgyn(String DrtRgyn){
        this.DrtRgyn = DrtRgyn;
    }

    public String getBrdtBrno(){ return BrdtBrno; }

    public void setBrdtBrno(String BrdtBrno){
        this.BrdtBrno = BrdtBrno;
    }
    
    public String getBncd() { return Bncd; }

    public void setBncd(String Bncd){
        this.Bncd = Bncd;
    }
    
    public String getAcno(){ return Acno; }

    public void setAcno(String Acno){
        this.Acno = Acno;
    }
}
