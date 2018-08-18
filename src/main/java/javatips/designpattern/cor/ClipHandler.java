package javatips.designpattern.cor;

/**
 * 责任链模式中抽象处理角色
 *
 * @author biezhi
 * @date 2018/8/2
 */
public abstract class ClipHandler {

    private ClipHandler next;

    public abstract void handle(Video video);

    public void invokeNext(Video video){
        if(next != null){
            next.handle(video);
        }
    }

    public ClipHandler getNext() {
        return next;
    }

    public void setNext(ClipHandler next) {
        this.next = next;
    }
}
