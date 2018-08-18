package javatips.designpattern.cor;

/**
 * 字幕处理器
 *
 * @author biezhi
 * @date 2018/8/2
 */
public class SubtitleHandler extends ClipHandler {
    @Override
    public void handle(Video video) {
        if(video.getSubtitle() == null){
            System.out.println("添加字幕...");
        }
        this.invokeNext(video);
    }
}
