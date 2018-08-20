package com.barcelos.janaine.energymonitor;

public class SensorData {
    private float current;
    private String hardware;
    private String local;
    private int power;
    private long timestamp;

    public SensorData() {
    }

    public SensorData(float current, String hardware, String local, int power, long timestamp) {
        this.current = current;
        this.hardware = hardware;
        this.local = local;
        this.power = power;
        this.timestamp = timestamp;

    }

    public float getCurrent() {
        return current;
    }

    public void setCurrent(float current) {
        this.current = current;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "current=" + current +
                ", hardware='" + hardware + '\'' +
                ", local='" + local + '\'' +
                ", power=" + power +
                ", timestamp=" + timestamp +
                '}';
    }

}
