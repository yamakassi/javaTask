package ru.afanasev.time;

public class Time {
  private   int timeSeconds;

    Time(int timeSeconds) {
        this.timeSeconds = timeSeconds%(3600*24);
    }

    Time(int hours, int minutes, int seconds) {
        this(hours * 60 * 60 + minutes * 60 + seconds);
    }

    public int manyHours() {
        System.out.println(this.timeSeconds);
        int hours = this.timeSeconds / 3600;

        System.out.println(hours);
        return hours;
    }

    public int manyMinuts() {
        int minuts = timeSeconds / 60 % 60;
        return minuts;
    }

    public int manySeconds() {
        int second = timeSeconds % 60;
        return second;
    }

    public String toString() {
        return manyHours() + ":" + manyMinuts() + ":" + manySeconds();
    }
}
