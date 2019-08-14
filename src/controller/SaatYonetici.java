package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import model.Top;

public class SaatYonetici {

    private Timer zamanlayici = null;
    private final SaatDinleyici saat = new SaatDinleyici();
    private final Top top;

    public SaatYonetici(Top top) {
        this.top = top;
        zamanlayici = new Timer(100, saat);
    }

    public void oyunHiziAyarla(int hiz) {
        zamanlayici.setDelay(hiz);
    }

    public void baslat() {
        zamanlayici.start();
    }

    public void durdur() {
        zamanlayici.stop();
    }

    public void guncelle() {
        top.hareketEt();
    }

    private class SaatDinleyici implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            guncelle();
        }
    }
}
