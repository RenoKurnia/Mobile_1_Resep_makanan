package com.example.renokurniarw.recycleview;

/**
 * Created by RenoKurniaRW on 10/5/2017.
 */

public class Content {
    private String judul, pembuatan;
    private int img;


    public Content(String judul, String pembuatan, int img) {
        this.judul = judul;
        this.pembuatan = pembuatan;
        this.img = img;
    }


    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPembuatan() {
        return pembuatan;
    }

    public void setPembuatan(String pembuatan) {
        this.pembuatan = pembuatan;
    }

    public void setImg(int img) {
        this.img = img;
    }
    public int getImg(){
        return  img;
    }
}
