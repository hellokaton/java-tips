package javatips.designpattern.cor;

/**
 * 降噪处理器
 *
 * @author biezhi
 * @date 2018/8/2
 */
public class NoiseReductionHandler extends ClipHandler {
    @Override
    public void handle(Video video) {
        if(video.getVoice() != null){
            System.out.println("降噪处理...");
        }
        this.invokeNext(video);
    }
}
