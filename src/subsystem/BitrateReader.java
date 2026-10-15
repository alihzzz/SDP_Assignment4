package subsystem;

public class BitrateReader {

    public int readBitrate(String sourceFormat) {
        String format = sourceFormat.toLowerCase();
        int bitrate;

        if (format.equals("mp3")) {
            bitrate = 128;
        } else if (format.equals("wav")) {
            bitrate = 1411;
        } else if (format.equals("flac")) {
            bitrate = 900;
        } else {
            throw new IllegalArgumentException("Unsupported source format: " + sourceFormat);
        }

        System.out.println("[BitrateReader] source bitrate: " + bitrate + " kbps");
        return bitrate;
    }
}