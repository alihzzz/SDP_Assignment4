package client;
import facade.MediaConversionFacade;

public class Main {

    public static void main(String[] args) {
        MediaConversionFacade converter = new MediaConversionFacade();

        converter.convert("song.wav", "mp3");

        try {
            converter.convert("song.wav", "zip");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}