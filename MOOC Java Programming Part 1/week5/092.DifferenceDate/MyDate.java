
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {

        // first version start //
        int first = this.day + this.month * 30 + this.year * 12 * 30;
        int second = comparedDate.day + comparedDate.month * 30 + comparedDate.year * 12 * 30;
        int differences = Math.abs((first - second));

        return differences / 360;
        // first version end //

    }

    // second version start //
//       int thisDate = convertToDate(this);
//        int otherDate = convertToDate(comparedDate);
//
//        int differenceInDates = Math.abs(thisDate - otherDate);
//        return differenceInDates / 360;
//    public int convertToDate(MyDate date){
//        int inDate =  date.day + date.month * 30 + date.year * 12 * 30;
//        return inDate;
//    }
    // second version end //
}
