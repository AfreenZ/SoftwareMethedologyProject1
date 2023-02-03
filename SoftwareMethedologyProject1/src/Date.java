import java.util.Calendar;
private int ye;
public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;

    /**
     Constructor which provides today's date if no date is given
     */
    public Date(){
        Calendar newCal = Calendar.getInstance(); // Calendar with current date and time
        int year = newCal.get(Calendar.YEAR);
        int month = newCal.get(Calendar.MONTH);
        int day = newCal.get(Calendar.DATE);

        this.year = year;
        this.month = month;
        this.day = day;
    }
    /**
     Constructor which provides the date given by user
     */
    public Date (String date){
        String [] splitDate = date.split("/");
        int year = Integer.parseInt(splitDate[2]);
        int month = Integer.parseInt(splitDate[0]);
        int day = Integer.parseInt(splitDate[1]);
        this.year = year;
        this.month = month;
        this.day = day;

    }

    /**
     Compares two dates. Will first check if the types are the same.
     */
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Date){
            Date compareDate = (Date)obj; //Typecasting obj to Date type
            if(compareDate.year == (this.year) && compareDate.month ==(this.month) && compareDate.day == (this.day)){
                return true;
            }
        }
        return false;
    }


    /**
     Presents the date in a String.
     */
    @Override
    public String toString(){
        return this.month+"/"+this.day+"/"+this.year;
    }

    /**
     Checks if it is a valid date
     Not a valid date if:
     The date is today or in the future
     The year is 2005 or later
     Not an actual calendar date
     */
    public boolean isValid(){
        Calendar newCal = Calendar.getInstance(); // Calendar with current date and time
        int currentYear = newCal.get(Calendar.YEAR);
        int currentMonth = newCal.get(Calendar.MONTH);
        int currentDay = newCal.get(Calendar.DATE);
        public static final int JANUARY = 1;
        public static final int FEBRUARY = 2;
        public static final int MARCH = 3;
        public static final int APRIL = 4;
        public static final int MAY = 5;
        public static final int JUNE = 6;
        public static final int JULY = 7;
        public static final int AUGUST = 8;
        public static final int SEPTEMBER = 9;
        public static final int OCTOBER = 10;
        public static final int NOVEMBER = 11;
        public static final int DECEMBER = 12;
        public static final int MAX_MONTH= 12;
        public static final int MAX_DAYS_IN_MONTH = 31;
        public static final int MID_DAYS_IN_MONTH = 30;
        public static final int MIN_DAYS_IN_MONTH = 28;
        public static final int MIN_YEAR = 2005;
        public static final int LEAP_YEAR_DAY = 29;
        public static final int QUADRENNIAL = 4;
        public static final int CENTENNIAL = 100;
        public static final int QUATERCENTENNIAL = 400;
        public static final int ZERO = 0;

        if(this.year>=MIN_YEAR){ //Student is less than 16 years old
            return false;
        }

        if(this.month>MAX_MONTH || this.month<ZERO) { // Valid month check
            return false;
        }

        if(this.month == JANUARY||this.month ==MARCH||this.month ==MAY||this.month ==JULY||this.month ==AUGUST||this.month ==OCTOBER||this.month ==DECEMBER){ //Checking valid date for months with number of days 31
            if(this.day>MAX_DAYS_IN_MONTH||this.day<=ZERO){
                return false;
            }
        }

        if(this.month == APRIL||this.month ==JUNE||this.month ==SEPTEMBER||this.month ==NOVEMBER){ //Checking valid date for months with number of days of 30
            if(this.day>MID_DAYS_IN_MONTH||this.day<=ZERO){
                return false;
            }
        }

        if(this.month == FEBRUARY){ //Checking valid date for month of February
            if(this.year%QUADRENNIAL==ZERO){
                if(this.year%CENTENNIAL==ZERO){
                    if(this.year%QUATERCENTENNIAL==ZERO){
                        if(this.day<ZERO || this.day>LEAP_YEAR_DAY){
                            return false;
                        }
                    }
                    else{
                        if(this.day<ZERO || this.day>MIN_DAYS_IN_MONTH){
                            return false;
                        }
                    }
                }
                else{
                    if(this.day<ZERO || this.day>LEAP_YEAR_DAY){
                        return false;
                    }
                }
            }
            else{
                if(this.day<ZERO || this.day>MIN_DAYS_IN_MONTH){
                    return false;
                }
            }
        }

        return true;


    }


    /**
     Testbed with test cases to check if it is valid.  CHANGE UP
     */
    public static void main(String[] args){
        String[] testCases = {"-1/31/2023","9/2/2022","13/31/2003","3/32/2003","2/29/2003","3/1/2002","7/11/2002"};

        for ( int i = 0; i < testCases.length; i++){
            Date testCase = new Date(testCases[i]);

            if (testCase.isValid()){
                System.out.println("Test Case #" + String.valueOf(i+1)  + ": " + testCases[i] + " " + "Passed");
            } else {
                System.out.println("Test Case #" + String.valueOf(i+1)  + ": " + testCases[i] + " " + "Failed");
            }
        }
    }
}





}



