package facade;

import subsystem.AudioMixer;
import subsystem.BitrateReader;
import subsystem.CodecFactory;
import subsystem.MetadataReader;

public class MediaConversionFacade {

    private final MetadataReader metadataReader = new MetadataReader();
    private final CodecFactory codecFactory = new CodecFactory();
    private final BitrateReader bitrateReader = new BitrateReader();
    private final AudioMixer audioMixer = new AudioMixer();

    public String convert(String fileName, String targetFormat) {
        System.out.println("Converting " + fileName + " to " + targetFormat + "...");

        String sourceFormat = metadataReader.readFormat(fileName);
        String codec = codecFactory.createCodec(targetFormat);
        int bitrate = bitrateReader.readBitrate(sourceFormat);
        String resultFileName = audioMixer.mix(fileName, codec, bitrate, targetFormat);

        System.out.println("Done: " + resultFileName + "\n");
        return resultFileName;
    }
}