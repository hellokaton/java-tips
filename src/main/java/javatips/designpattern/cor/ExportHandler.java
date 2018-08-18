package javatips.designpattern.cor;

/**
 * 视频导出处理器你
 *
 * @author biezhi
 * @date 2018/8/2
 */
public class ExportHandler extends ClipHandler {
    @Override
    public void handle(Video video) {
        if(!video.isExport()){
            System.out.println("导出视频...");
        }
        this.invokeNext(video);
    }
}
