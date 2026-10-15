package subsystem;

public class CodecFactory {

    public String createCodec(String targetFormat) {
        String format = targetFormat.toLowerCase();
        String codec;

        if (format.equals("mp3")) {
            codec = "MP3 Codec";
        } else if (format.equals("wav")) {
            codec = "WAV Codec";
        } else if (format.equals("flac")) {
            codec = "FLAC Codec";
        } else {
            throw new IllegalArgumentException("Unsupported target format: " + targetFormat);
        }

        System.out.println("[CodecFactory] target format " + targetFormat + " -> " + codec);
        return codec;
    }
}