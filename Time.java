public class Time{
    int hour;
    int minute;
    int second;
 public Time(int hour,int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
 }
 public int getHour(){
    return hour;
 }
 public int getMinute(){
    return minute;
 }
 public int getSecond(){
    return second;
 }
 public void setHour(int newhour){
    this.hour = newhour;
 }
 public void setMinute(int newminute){
    this.minute = newminute;
 }
 public void setSecond(int newsecond){
    this.second = newsecond;
 }
 public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // Method to increment the time by one second
    public Time nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Method to decrement the time by one second
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
 }
