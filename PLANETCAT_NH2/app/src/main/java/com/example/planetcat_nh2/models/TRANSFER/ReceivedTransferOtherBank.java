package com.example.planetcat_nh2.models.TRANSFER;

import com.example.planetcat_nh2.models.Header;
import com.google.gson.annotations.SerializedName;

public class ReceivedTransferOtherBank {

    private Header Header;

    @SerializedName("Bncd")
    private String Bncd;

    @SerializedName("Acno")
    private String Acno;

    @SerializedName("Tram")
    private String Tram;

    @SerializedName("DractOtlt")
    private String DractOtlt;

    @SerializedName("MractOtlt")
    private String MractOtlt;

    public Header getHeader ()
    {
        return Header;
    }

    public ReceivedTransferOtherBank(Header Header, String Bncd, String Acno, String Tram, String DractOtlt, String MractOtlt){
        this.Header = Header;
        this.Bncd = Bncd;
        this.Acno = Acno;
        this.Tram = Tram;
        this.DractOtlt = DractOtlt;
        this.MractOtlt = MractOtlt;
    }
}
