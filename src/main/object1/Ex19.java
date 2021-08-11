package main.object1;

public class Ex19 {
    public static void main(String[] args) {
        MyTv t = new MyTv();
        System.out.println(t);
        t.turnOnOff();
        t.channelDown();
        t.volumeDown();
        t.channelUp();
        t.setChannel(20);
        t.setChannel(7);
        t.gotoPrevChannel();
        System.out.println(t);
        t.channelUp();
        t.channelUp();
        t.gotoPrevChannel();
        t.volumeUp();
        t.turnOnOff();
        System.out.println(t);
    }
}

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int prevChannel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void gotoPrevChannel(){
        System.out.println("gotoPrevChannel: "+channel+"->"+prevChannel+" changed");
        channel = prevChannel;
    }
    @Override
    public String toString() {
        return "전원:"+isPowerOn+", CH:"+channel+", VOL:"+ volume;
    }

    public void setChannel(int channel) {
        if(isPowerOn==true) {
            prevChannel = this.channel;
            if(channel >= MAX_CHANNEL) {
                this.channel = MIN_CHANNEL;
            } else {
                this.channel = channel;
            }
            System.out.println("setChannel:"+channel+"/prevCh:"+prevChannel);
        }
    }

    public void setVolume(int volume) {
        if(isPowerOn==true) {
            if (volume < MAX_VOLUME)
                this.volume = volume;
        }
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
            prevChannel = channel;
            if(channel >= MAX_CHANNEL) {
                channel = MIN_CHANNEL;
            } else {
                channel++;
            }
            System.out.println("channelUp:"+channel+"/prevCh:"+prevChannel);
        }
    }
    void channelDown() {
        if(isPowerOn==true) {
            prevChannel = channel;
            if(channel < MIN_CHANNEL) {
                channel = MAX_CHANNEL;
            } else {
                channel--;
            }
            System.out.println("channelDown:"+channel+"/prevCh:"+prevChannel);
        }
    }
} // class MyTv
