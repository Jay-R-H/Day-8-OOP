package com.programming;

public class EmployeeWageBuilder {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;

    /*Instance variables are created*/
    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    /*After creating the instance variable
     * a constructor is a must  */
    public EmployeeWageBuilder(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }


    public static void main(String[] args) {
        /* class Employee wage builder is called to create object with the name dMart with 4 fields
        * company name , employee rate per hour , Total number of working days , Maximum hours per month */
        EmployeeWageBuilder dMart = new EmployeeWageBuilder("D-Mart", 20, 2, 10);
        int totalWorkingDays = 0;                       /*Local variables are declared*/
        int totalWorkingHrs = 0;
        int totalWage = 0;
        int workingHrs;
        /*While statement is used to iterate till either of the two parameters are met i.e, either maximum
        * working days or maximum hours */
        while (dMart.numOfWorkingDays > totalWorkingDays && dMart.maxHoursPerMonth > totalWorkingHrs) {
            int employeeCheck = (int) Math.floor((Math.random() * 10) % 3);
            totalWorkingDays++;
            /*switch case statement is used to check for the employer part time or full time working hours
            and also checking his presence to duty*/
            switch (employeeCheck) {

                case isFullTime:
                    workingHrs = 8;
                    System.out.println("The employee has worked for " + workingHrs + " hrs");
                    break;
                case isPartTime:
                    workingHrs = 4;
                    System.out.println("The employee has worked for " + workingHrs + " hrs");
                    break;
                default:
                    workingHrs = 0;
                    System.out.println("The employee has worked for " + workingHrs + " hrs");
                    break;
            }
            totalWorkingHrs += workingHrs;
            int wage = dMart.empRatePerHr * workingHrs;
            System.out.println("The employee has earned " + wage);
            totalWage += wage;
        }
        System.out.println("The employee has totally worked " + totalWorkingHrs + " hrs");
        System.out.println("The employee has  totally earned " + totalWage + "$" + " working for the company " + dMart.company);
    }
}
