package model;

import java.net.URL;

public class OyunAyar {

    private int topXKonumu;
    private int topYKonumu;
    private URL resimYolu;
    private int topCap;
    private double topXHizi;
    private double topYHizi;
    private int oyunHizi;

    public OyunAyar() {
        topXKonumu = Sabitler.TOP_KONUMX;
        topYKonumu = Sabitler.TOP_KONUMY;
        topXHizi = Sabitler.TOP_HIZX;
        topYHizi = Sabitler.TOP_HIZY;
        oyunHizi = Sabitler.OYUN_HIZ;
        resimYolu = Sabitler.TOP_RESMI;
    }

    /**
     * @return the topXKonumu
     */
    public int getTopXKonumu() {
        return topXKonumu;
    }

    /**
     * @param topXKonumu the topXKonumu to set
     */
    public void setTopXKonumu(int topXKonumu) {
        this.topXKonumu = topXKonumu;
    }

    /**
     * @return the topYKonumu
     */
    public int getTopYKonumu() {
        return topYKonumu;
    }

    /**
     * @param topYKonumu the topYKonumu to set
     */
    public void setTopYKonumu(int topYKonumu) {
        this.topYKonumu = topYKonumu;
    }

    /**
     * @return the resimYolu
     */
    public URL getResimYolu() {
        return resimYolu;
    }

    /**
     * @param resimYolu the resimYolu to set
     */
    public void setResimYolu(URL resimYolu) {
        this.resimYolu = resimYolu;
    }

    /**
     * @return the topCap
     */
    public int getTopCap() {
        return topCap;
    }

    /**
     * @param topCap the topCap to set
     */
    public void setTopCap(int topCap) {
        this.topCap = topCap;
    }

    /**
     * @return the topXHizi
     */
    public double getTopXHizi() {
        return topXHizi;
    }

    /**
     * @param topXHizi the topXHizi to set
     */
    public void setTopXHizi(double topXHizi) {
        this.topXHizi = topXHizi;
    }

    /**
     * @return the topYHizi
     */
    public double getTopYHizi() {
        return topYHizi;
    }

    /**
     * @param topYHizi the topYHizi to set
     */
    public void setTopYHizi(double topYHizi) {
        this.topYHizi = topYHizi;
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
