package com.mycompany.onlinealisveris;

public class Musteri {

    private Long id;
    private String ad;
    private String soyad;
    private String adres;
    private String sifre;
    private String telefon;

    public Musteri() {
    }

    public Musteri(Long id, String ad, String soyad, String adres, String sifre, String telefon) {
        this.ad = ad;
        this.id = id;
        this.soyad = soyad;
        this.adres = adres;
        this.sifre = sifre;
        this.telefon = telefon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


    @Override
    public String toString() {
        return "Kullanici{" +
                "id=" + id +
                ", username='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sifre='" + sifre + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='"+ telefon +'\''+ 
                '}';
    }
    
}
