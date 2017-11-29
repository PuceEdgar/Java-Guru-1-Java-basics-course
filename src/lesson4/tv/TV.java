package lesson4.tv;

public class TV {

    private int diagonal;
    private String model;
    private int channelCount;
    private int currentChannel;
    private int currentVolume;


    public TV(int diagonal, String model, int channelCount) {

        this.diagonal = diagonal;
        this.model = model;
        this.channelCount = channelCount;
        this.currentChannel = 1;
    }

    public void switchChannelUp() {
        if (currentChannel < channelCount) {
            currentChannel++;
        } else {
            currentChannel = 1;
        }
        System.out.println("Current channel: " + currentChannel);
    }

    public void switchChannelDown() {
        if (currentChannel > 1) {
            currentChannel--;
        } else {
            currentChannel = channelCount;
        }
        System.out.println("Current channel: " + currentChannel);
    }

    public void setChannel(int channel) {
        if (channel > 1 && channel <= channelCount) {
            currentChannel = channel;
        }
        System.out.println("Current channel: " + currentChannel);
    }

    public void turnVolumeUp() {
        if (currentVolume <= 100) {
            currentVolume++;
        }
        System.out.println("Current volume: " + currentVolume);
    }

    public void turnVolumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        System.out.println("Current volume: " + currentVolume);
    }

    public String toString() {
        return "TV model: " + model
                + ", diagonal: " + diagonal
                + ", channel count: " + channelCount;
    }


}
