package Inheritance.Mankind;

public class Worker extends Human {
    private double salary;
    private double hoursPerDay;
    public Worker(String firstName,String lastName ,double salary,double hoursPerDay){
        super(firstName,lastName);
this.setSalary(salary);
this.setHoursPerDay(hoursPerDay);
    }

    public double getSalary() {
        return salary;
    }

    public double getHoursPerDay() {
        return hoursPerDay;
    }

    private double getSalaryPerHour(){
        double salaryForOneDay = this.getSalary() /7;
        return salaryForOneDay / this.getHoursPerDay();
    }
    public void setHoursPerDay(double hoursPerDay) {
        if(hoursPerDay>12 || hoursPerDay<1){
            throw new IllegalArgumentException("Should be in the range [1..12]");
        }
        this.hoursPerDay = hoursPerDay;
    }

    public void setSalary(double salary) {
        if(salary<10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.salary = salary;
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(super.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(super.getLastName())
                .append(System.lineSeparator())
                .append("Week Salary: ").append(String.format("%.2f", this.getSalary()))
                .append(System.lineSeparator())
                .append("Hours per day: ").append(String.format("%.2f", this.getHoursPerDay()))
                .append(System.lineSeparator())
                .append("Salary per hour: ").append(String.format("%.2f", this.getSalaryPerHour()));

        return sb.toString();

    }
}
