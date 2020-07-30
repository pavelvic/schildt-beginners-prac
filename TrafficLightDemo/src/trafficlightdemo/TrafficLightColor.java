package trafficlightdemo;

public enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);
    private int delay;

    private TrafficLightColor(int delay) {
        this.delay = delay;
    }
    
    int getDelay () {return delay;}
    
}
