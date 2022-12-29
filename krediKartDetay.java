
package com.mycompany.onlinealisveris;


public class krediKartDetay implements Kart{
   private Double tutar;
   private Double limit;
   private Double hesapno;

    public Double getTutar() {
        return tutar;
    }

    public void setTutar(Double tutar) {
        this.tutar = tutar;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }


    public Double getHesapno() {
        return hesapno;
    }

    public void setHesapno(Double hesapno) {
        this.hesapno = hesapno;
    }

    @Override
    public double bilgiler() {
       return limit-tutar;  
    }

    
}
