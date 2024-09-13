//this code is incomplete
public static int[] addDays2(int[] currentDate,int increment){
        //currentDate is in the format of dd,mm,yy
        int day = currentDate[0];
        int month = currentDate[1];
        int year = currentDate[2];
        //create a data structure for storing no of days a month has
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
        //the concept of leap year
        // Leap year checker
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            daysInMonth[1] = 29;  // Adjust February days for a leap year
        }

        
        
        //start incrementing
        while(increment>0){
            if (increment >= 365) {  // More than or equal to a year
                if (isLeapYear && month <= 2) {
                    increment -= 366;
                } else {
                    increment -= 365;
                }
                year++;
                // Update for the next year
                isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                daysInMonth[1] = isLeapYear ? 29 : 28;
            } else if () {//no of days is greater than the number of days in the month

            }else{//// Less than the days in the current month
                day+=increment;
                increment=0;
            }
        }
        return new int[]{day, month, year};
    }
