package org.example.utils;

public class Duration {
    private int hours;
    private int minutes;
    private int seconds;

    public Duration(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        if (hours == 0 && minutes == 0 && seconds == 0) {
            throw new IllegalArgumentException("Длительность должна быть больше нуля");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0) throw new IllegalArgumentException("Часы не могут быть отрицательными");
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59)
            throw new IllegalArgumentException("Минуты должны быть в диапазоне 0..59");
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59)
            throw new IllegalArgumentException("Секунды должны быть в диапазоне 0..59");
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        if (hours > 0) {
            return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        } else {
            return String.format("%02d:%02d", minutes, seconds);
        }
    }
}
