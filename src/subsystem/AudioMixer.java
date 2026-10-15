package subsystem;

public class AudioMixer {

    public String mix(String fileName, String codec, int bitrate, String targetFormat) {
        System.out.println("[AudioMixer] mixing audio using " + codec + " at " + bitrate + " kbps");
        String nameWithoutExtension = fileName.substring(0, fileName.lastIndexOf('.'));
        return nameWithoutExtension + "." + targetFormat.toLowerCase();
    }
}