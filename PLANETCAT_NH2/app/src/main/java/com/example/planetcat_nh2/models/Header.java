package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

public class Header {
    @SerializedName("Trtm")
    private String Trtm;

    @SerializedName("ApiNm")
    private String ApiNm;

    @SerializedName("IsTuno")
    private String IsTuno;

    @SerializedName("Tsymd")
    private String Tsymd;

    @SerializedName("FintechApsno")
    private String FintechApsno;

    @SerializedName("AccessToken")
    private String AccessToken;

    @SerializedName("Iscd")
    private String Iscd;

    @SerializedName("ApiSvcCd")
    private String ApiSvcCd;

    @SerializedName("Rsms")
    private String Rsms;

    public String getTrtm ()
    {
        return Trtm;
    }

    public String getApiNm ()
    {
        return ApiNm;
    }

    public String getIsTuno ()
    {
        return IsTuno;
    }

    public String getTsymd ()
    {
        return Tsymd;
    }

    public String getFintechApsno ()
    {
        return FintechApsno;
    }

    public String getAccessToken ()
    {
        return AccessToken;
    }


    public String getIscd ()
    {
        return Iscd;
    }


    public String getApiSvcCd ()
    {
        return ApiSvcCd;
    }

    public String getRsms ()
    {
        return Rsms;
    }

    public Header(String ApiNm, String Tsymd, String Trtm, String Iscd, String FintechApsno, String ApiAvcCd, String IsTuno, String AccessToken){
        this.ApiNm = ApiNm;
        this.Tsymd = Tsymd;
        this.Trtm = Trtm;
        this.Iscd = Iscd;
        this.FintechApsno = FintechApsno;
        this.ApiSvcCd = ApiAvcCd;
        this.IsTuno = IsTuno;
        this.AccessToken = AccessToken;
    }

}
