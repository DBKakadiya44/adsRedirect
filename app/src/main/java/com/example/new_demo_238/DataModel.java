package com.example.new_demo_238;

import java.util.List;


public class DataModel {
    public DataModel(List<Datum> data) {
        this.data = data;
    }

    private List<Datum> data;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "data=" + data +
                '}';
    }
}