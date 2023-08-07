package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        }
        if (month == 2) {
            System.out.println(28);
        } else {
            System.out.println(31);
        }
    }
}

// Months with 30 days - April, June, September, and November
//Implement the program that will consume a number month from method
//        argument and print amount of days in that month,
//        if number is not a month number -> print: "wrong number!":
