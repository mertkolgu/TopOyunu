package controller;

import model.Top;

public class OyunYonetici {

    private SaatYonetici saatYonetici;
    private Top top;
    private int oyunHizi;

    public OyunYonetici(Top top) {
        this.top = top;
        saatYonetici = new SaatYonetici(top);
    }

    public void oyunHiziniAyarla(int oyunHizi) {
        this.setOyunHizi(oyunHizi);
        getSaatYonetici().oyunHiziAyarla(oyunHizi);
    }

    public void oyunuBaslat() {
        getSaatYonetici().baslat();
    }

    public void topHiziAyarla(double xHizi, double yHizi) {
        getTop().setxHizi(xHizi);
        getTop().setYedekXHizi(xHizi);
        getTop().setyHizi(yHizi);
        getTop().setYedekYHizi(yHizi);
    }

    public void oyunuDurdur() {
        getSaatYonetici().durdur();
    }

    /**
     * @return the saatYonetici
     */
    public SaatYonetici getSaatYonetici() {
        return saatYonetici;
    }

    /**
     * @param saatYonetici the saatYonetici to set
     */
    public void setSaatYonetici(SaatYonetici saatYonetici) {
        this.saatYonetici = saatYonetici;
    }

    /**
     * @return the top
     */
    public Top getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(Top top) {
        this.top = top;
    }

    /**
     * @return the oyunHizi
     */
    public int getOyunHizi() {
        return oyunHizi;
    }

    /**
     * @param oyunHizi the oyunHizi to set
     */
    public void setOyunHizi(int oyunHizi) {
        this.oyunHizi = oyunHizi;
    }
}
