public class MyDateDemo {
    public static void main(String[] args) {
        MyDate date = new MyDate(2012, 2, 28);
        System.out.println(date); // Should print "Tuesday 28 Feb 2012"

        System.out.println(date.nextDay()); // Should print "Wednesday 29 Feb 2012"
        System.out.println(date.nextDay()); // Should print "Thursday 1 Mar 2012"
        System.out.println(date.nextMonth()); // Should print "Sunday 1 Apr 2012"
        System.out.println(date.nextYear()); // Should print "Monday 1 Apr 2013"

        MyDate date2 = new MyDate(2012, 1, 2);
        System.out.println(date2); // Should print "Monday 2 Jan 2012"
        System.out.println(date2.previousDay()); // Should print "Sunday 1 Jan 2012"
        System.out.println(date2.previousDay()); // Should print "Saturday 31 Dec 2011"
        System.out.println(date2.previousMonth()); // Should print "Wednesday 30 Nov 2011"
        System.out.println(date2.previousYear()); // Should print "Tuesday 30 Nov 2010"

        MyDate date3 = new MyDate(2012, 2, 29);
        System.out.println(date3.previousYear()); // Should print "Monday 28 Feb 2011"

        try {
            MyDate date4 = new MyDate(2099, 11, 31); // Invalid date
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Should print "Invalid year, month, or day!"
        }

        try {
            MyDate date5 = new MyDate(2011, 2, 29); // Invalid date
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Should print "Invalid year, month, or day!"
        }

        // Testing nextDay in a loop
        MyDate loopDate = new MyDate(2011, 12, 28);
        while (!(loopDate.getYear() == 2012 && loopDate.getMonth() == 3 && loopDate.getDay() == 2)) {
            System.out.println(loopDate);
            loopDate = loopDate.nextDay();
        }
        System.out.println(loopDate); // Print the final day 2 Mar 2012
    }
}
