package controlador;

import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;

public class ControladorAudios {

    private Clip comprar; // Clip para reproducir sonido de "comprar"

    public ControladorAudios() {
        // Constructor vacío
    }

    public void comprar() {
        if (!isClipPlaying(comprar)) {
            try {
                URL url = getClass().getResource("/audio/Buhonero/comprar1.wav");
                comprar = AudioSystem.getClip();
                comprar.open(AudioSystem.getAudioInputStream(url));
                comprar.start();
            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
                e.printStackTrace();
            }
        }
    }

    public void comeback() {
        URL url = getClass().getResource("/audio/Buhonero/comeback.wav");
        playSound(url);
    }

    public void gracias() {
        URL url = getClass().getResource("/audio/Buhonero/thankyou.wav");
        playSound(url);
    }

    public void vender() {
        URL url = getClass().getResource("/audio/Buhonero/vender.wav");
        playSound(url);
    }

    public void red9() {
        URL url = getClass().getResource("/audio/Buhonero/red9.wav");
        playSound(url);
    }

    public void nodinero() {
        URL url = getClass().getResource("/audio/Buhonero/nodinero.wav");
        playSound(url);
    }

    public void tengocosas() {
        URL url = getClass().getResource("/audio/Buhonero/tengocosas.wav");
        playSound(url);
    }

    public void trucar() {
        URL url = getClass().getResource("/audio/Buhonero/comprarv2.wav");
        playSound(url);
    }

    public void musica() {
        try {
            URL url = getClass().getResource("/audio/re4Musica.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-17.0f); // Reducir la ganancia en 30 decibelios para ponerla muy bajito
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }

    public void boton() {
        URL url = getClass().getResource("/audio/Buhonero/boton.wav");
        playSound(url);
    }

    public void locomprareaunaltoprecio() {
        URL url = getClass().getResource("/audio/Buhonero/buhonerotecompra.wav");
        playSound(url);
    }

    public void jejethankyou() {
        URL url = getClass().getResource("/audio/Buhonero/vendido.wav");
        playSound(url);
    }

    public void interactuar() {
        URL url = getClass().getResource("/audio/Buhonero/swing.wav");
        playSound(url);
    }

    public void interactuar2() {
        URL url = getClass().getResource("/audio/Buhonero/droideka.wav");
        playSound(url);
    }

    public void interactuar3() {
        URL url = getClass().getResource("/audio/Buhonero/hierba.wav");
        playSound(url);
    }

    public void elephant() {
        URL url = getClass().getResource("/audio/Buhonero/francotirador.wav");
        playSound(url);
    }

    public void lanzacohetes() {
        URL url = getClass().getResource("/audio/Buhonero/lanzacohetes.wav");
        playSound(url);
    }

    public void escopeta() {
        URL url = getClass().getResource("/audio/Buhonero/escopeta.wav");
        playSound(url);
    }

    public void tmp() {
        URL url = getClass().getResource("/audio/Buhonero/tmp1.wav");
        playSound(url);
    }

    public void estodo() {
        URL url = getClass().getResource("/audio/Buhonero/estodo.wav");
        playSound(url);
    }

    private void playSound(URL url) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }

    private boolean isClipPlaying(Clip clip) {
        return clip != null && clip.isActive();
    }
}
