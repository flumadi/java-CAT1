public class Date{
    int day;
    int month;
    int year;

    public Date (int x, int y, int z){
        this.day = x;
        this.month = y;
        this.year = z;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int newday){
        this.day = newday;
    }
    public void setMonth(int newmonth){
        this.month = newmonth;
    }
    public void setYear(int newyear){
        this.year = newyear;
    }
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}