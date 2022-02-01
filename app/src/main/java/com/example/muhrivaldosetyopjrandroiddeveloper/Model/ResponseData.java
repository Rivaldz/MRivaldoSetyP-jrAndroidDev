package com.example.muhrivaldosetyopjrandroiddeveloper.Model;

import com.google.gson.annotations.SerializedName;

public class ResponseData {
    @SerializedName("kode")
    private int kode;

    @SerializedName("pesan")
    private String pesan;

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "kode=" + kode +
                ", pesan='" + pesan + '\'' +
                '}';
    }
}
