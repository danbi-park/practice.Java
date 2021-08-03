package object1;

public class Ex19 {
    public static void main(String[] args) {
        MyTv t = new MyTv();
        System.out.println(t);
        t.turnOnOff();
        t.channelDown();
        t.volumeDown();
        System.out.println(t);
        t.channelUp();
        t.volumeUp();
        t.turnOnOff();
        System.out.println(t);
    }
}



class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    @Override
    public String toString() {
        return "전원:"+isPowerOn+", CH:"+channel+", VOL:"+ volume;
    }

    void turnOnOff() {
        isPowerOn = !isPowerOn;
    }
    void volumeUp() {
        if(isPowerOn==true) {
            if (volume < MAX_VOLUME)
                volume++;
        }
    }
    void volumeDown() {
        if(isPowerOn==true) {
            if(volume > MIN_VOLUME)
                volume--;
        }
    }
    void channelUp() {
        if(isPowerOn==true) {
            if(channel >= MAX_CHANNEL) {
                channel = MIN_CHANNEL;
            } else {
                channel++;
            }
        }
    }
    void channelDown() {
        if(isPowerOn==true) {
            if(channel < MIN_CHANNEL) {
                channel = MAX_CHANNEL;
            } else {
                channel--;
            }
        }
    }
} // class MyTv
