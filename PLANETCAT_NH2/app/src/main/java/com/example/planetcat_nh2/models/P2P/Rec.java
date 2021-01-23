package com.example.planetcat_nh2.models.P2P;

import com.google.gson.annotations.SerializedName;

public class Rec {

    @SerializedName("Vran")
    private String Vran;

    @SerializedName("RpayAmt")
    private String RpayAmt;

    public String getVran() { return Vran; }

    public String getRpayAmt() { return RpayAmt; }

    public Rec(String Vran, String RpayAmt){
        this.Vran = Vran;
        this.RpayAmt = RpayAmt;
    }
}
