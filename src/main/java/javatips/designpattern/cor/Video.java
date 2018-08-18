package javatips.designpattern.cor;

/**
 * 视频实体
 *
 * @author biezhi
 * @date 2018/8/2
 */
public class Video {

    private String voice;
    private String subtitle;
    private boolean isExport;

    public Video(String voice, String subtitle, boolean isExport) {
        this.voice = voice;
        this.subtitle = subtitle;
        this.isExport = isExport;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public boolean isExport() {
        return isExport;
    }

    public void setExport(boolean export) {
        isExport = export;
    }
}
