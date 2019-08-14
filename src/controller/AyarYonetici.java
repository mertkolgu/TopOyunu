package controller;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.OyunAyar;

public class AyarYonetici {

    private FileWriter dosya;
    private final Gson gson = new Gson();
    private String dosyaAdi = null;
    private BufferedReader okuyucu;
    private OyunAyar ayar;

    public AyarYonetici(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    public boolean jsonOlustur(OyunAyar ayar) {
        String dosyaYolu = System.getProperty("user.dir") + "/" + dosyaAdi;
        try {
            dosya = new FileWriter(dosyaYolu);
            String json = gson.toJson(ayar);
            dosya.write(json);
            dosya.flush();
            dosya.close();

        } catch (IOException ex) {
            return false;
        }
        return true;
    }

    public OyunAyar jsonOku() {
        String dosyaYolu = System.getProperty("user.dir") + "/" + dosyaAdi;
        if (new File(dosyaYolu).exists()) {
            try {
                okuyucu = new BufferedReader(new FileReader(dosyaYolu));
                ayar = gson.fromJson(okuyucu, OyunAyar.class);
            } catch (FileNotFoundException ex) {
            }
        } else {
            ayar = new OyunAyar();
        }
        return ayar;
    }
}
