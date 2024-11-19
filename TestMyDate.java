public class TestMyDate {
    public static void main(String[] args) {
        MyDate date = new MyDate(2011, 12, 28);
        
        while (!(date.getYear() == 2012 && date.getMonth() == 3 && date.getDay() == 2)) {
            System.out.println(date);
            date = date.nextDay();
        }
        System.out.println(date); // Print the final day 2 Mar 2012
    }
}
