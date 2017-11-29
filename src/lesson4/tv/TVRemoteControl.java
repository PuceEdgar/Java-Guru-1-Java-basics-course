package lesson4.tv;

public class TVRemoteControl {

    private TV tv;

    //creates remote controller and connects it to specific TV
    public TVRemoteControl(TV tv) {
        connect(tv);
    }

    //empty constructor, gives us option to connect remote controller to any TV
    public TVRemoteControl() {

    }

    public void connect(TV tv){
        if (tv != null) {
            this.tv = tv;
        }
    }

    public void disconnect() {
        this.tv = null;
    }

    public void switchChannelUp(){
        if (tv != null) {
            tv.switchChannelUp();
        }
    }

    public void switchChannelDown() {
        if (tv != null) {
            tv.switchChannelDown();
        }
    }

    public void turnVolumeUp() {
        if (tv != null) {
            tv.turnVolumeUp();
        }
    }

    public void turnVolumeDown() {
        if (tv != null) {
            tv.turnVolumeDown();
        }
    }

    public void setChannel(int channel) {
        if (tv != null) {
            tv.setChannel(channel);
        }
    }
}
