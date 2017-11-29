package lesson4.tv;

public class TVMain {

    public static void main(String[] args) {

        TV sony = new TV(44, "Sony-123", 10);

        TVRemoteControl tvRemoteControl = new TVRemoteControl();

        //connecting TV "SONY" to remote controller
        tvRemoteControl.connect(sony);

        tvRemoteControl.setChannel(5);

        sony.setChannel(10);

        tvRemoteControl.setChannel(8);

    }
}
