package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        int ans = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? 1 : 0;

        switch (ans) {
            case 1 -> System.out.println("leap");
            case 0 -> System.out.println("not leap");
            default -> System.out.println("");
        }

    }
}
