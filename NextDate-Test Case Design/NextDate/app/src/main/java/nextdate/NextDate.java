package nextdate;

public class NextDate {
    public static String getNextDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return "Invalid date";
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonth[2] = 29; // Leap year, February has 29 days
        }

        if (day < daysInMonth[month]) {
            return String.format("%04d-%02d-%02d", year, month, day + 1); // Next day
        } else if (month < 12) {
            return String.format("%04d-%02d-%02d", year, month + 1, 1); // Next month
        } else {
            return String.format("%04d-%02d-%02d", year + 1, 1, 1); // Next year
        }
    }

    private static boolean isValidDate(int year, int month, int day) {
        if (year < 1812 || year > 2212 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonth[2] = 29; // Leap year, February has 29 days
        }

        return day <= daysInMonth[month];
    }
}
