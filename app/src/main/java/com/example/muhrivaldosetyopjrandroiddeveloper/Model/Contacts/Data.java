package com.example.muhrivaldosetyopjrandroiddeveloper.Model.Contacts;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("data")
    List<GetData> result;

    public List<GetData> getResult() {
        return result;
    }

    public void setResult(List<GetData> result) {
        this.result = result;
    }
}
