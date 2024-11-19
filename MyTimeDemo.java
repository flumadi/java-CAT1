public class MyTimeDemo {
    public static void main(String[] args) {
        // Test constructor and toString
        MyTime time1 = new MyTime(12, 30, 45);
        System.out.println("Initial time: " + time1);  // Should print 12:30:45

        // Test setters
        time1.setHour(23);
        time1.setMinute(59);
        time1.setSecond(59);
        System.out.println("Set time: " + time1);  // Should print 23:59:59

        // Test nextSecond
        time1.nextSecond();
        System.out.println("Next second: " + time1);  // Should print 00:00:00

        // Test nextMinute
        time1.nextMinute();
        System.out.println("Next minute: " + time1);  // Should print 00:01:00

        // Test nextHour
        time1.nextHour();
        System.out.println("Next hour: " + time1);  // Should print 01:01:00

        // Test previousSecond
        time1.previousSecond();
        System.out.println("Previous second: " + time1);  // Should print 01:00:59

        // Test previousMinute
        time1.previousMinute();
        System.out.println("Previous minute: " + time1);  // Should print 00:59:59

        // Test previousHour
        time1.previousHour();
        System.out.println("Previous hour: " + time1);  // Should print 23:59:59

        // Test input validation
        try {
            time1.setTime(24, 0, 0);  // Should throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            time1.setMinute(60);  // Should throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            time1.setSecond(60);  // Should throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
