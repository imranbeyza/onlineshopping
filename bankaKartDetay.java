
package com.mycompany.onlinealisveris;


public class bankaKartDetay implements Kart{
private Double tutar;
   private Double bakiye;
   private Double hesapno;

    public Double getTutar() {
        return tutar;
    }

    public void setTutar(Double tutar) {
        this.tutar = tutar;
    }

    public Double getBakiye() {
        return bakiye;
    }

    public void setBakiye(Double bakiye) {
        this.bakiye = bakiye;
    }

    public Double getHesapno() {
        return hesapno;
    }

    public void setHesapno(Double hesapno) {
        this.hesapno = hesapno;
    }

    @Override
    public double bilgiler() {
       return tutar-bakiye;  
    }

    
}
