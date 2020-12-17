package com.example.planetcat_nh2.models;

import com.google.gson.annotations.SerializedName;

public class ConfirmPin {

    private String Rgno;

    private ConfirmHeader Header;

    private String BrdtBrno;

    @SerializedName("FinAcno")
    private String FinAcno;

    @SerializedName("RgsnYmd")
    private String RgsnYmd;


    public String getFinAcno(){ return FinAcno;}

    public String getRgsnYmd(){ return RgsnYmd; }

    public String getRgno ()
    {
        return Rgno;
    }

    public ConfirmHeader getHeader ()
    {
        return Header;
    }

    public String getBrdtBrno ()
    {
        return BrdtBrno;
    }


    public ConfirmPin(ConfirmHeader Header, String Rgno, String BrdtBrno){
        this.Header = Header;
        this.Rgno = Rgno;
        this.BrdtBrno = BrdtBrno;
    }
}
