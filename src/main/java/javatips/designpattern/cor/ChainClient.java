package javatips.designpattern.cor;

/**
 *
 * @author biezhi
 * @date 2018/8/2
 */
public class ChainClient {

    public static void main(String[] args) {
        NoiseReductionHandler noiseReductionHandler = new NoiseReductionHandler();
        SubtitleHandler subtitleHandler = new SubtitleHandler();
        ExportHandler exportHandler = new ExportHandler();

        noiseReductionHandler.setNext(subtitleHandler);
        subtitleHandler.setNext(exportHandler);

        Video video = new Video("ok", null, false);
        noiseReductionHandler.handle(video);
    }

}
