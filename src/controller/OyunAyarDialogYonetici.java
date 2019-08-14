package controller;

import javax.swing.JDialog;

public class OyunAyarDialogYonetici {

    private final OyunYonetici oyunYonetici;
    private final JDialog dialog;

    public OyunAyarDialogYonetici(OyunYonetici oyunYonetici, JDialog dialog) {
        this.oyunYonetici = oyunYonetici;
        this.dialog = dialog;

    }

    public void dialogGoster() {

        dialog.setVisible(true);
    }

    public void dialogKapat() {
        dialog.dispose();
    }

    public void oyunBilgileriniAyarla(int oyunHizi, double topHiziX, double topHiziY) {
        oyunYonetici.oyunHiziniAyarla(oyunHizi);
        oyunYonetici.topHiziAyarla(topHiziX, topHiziY);

    }
}
