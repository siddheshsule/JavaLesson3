package inheritanceExample;

public class StudentEmployee extends Student{
    private double rateOfPayPerHour;
    private String employeeId;

    // Adding a constructor

    public StudentEmployee(String firstName, String lastName,String studentId,double rateOfPayPerHour, String employeeId){
        super(firstName, lastName, studentId);
        this.rateOfPayPerHour = rateOfPayPerHour;
        this.employeeId = employeeId;
    }

    // Adding getter method for the variables

    public double getRateOfPayPerHour() {
        return rateOfPayPerHour;
    }
    public String getEmployeeId(){
        return employeeId;
    }

    // Adding setter method for the variables
    public void setRateOfPayPerHour(double rateOfPayPerHour1){
        this.rateOfPayPerHour = rateOfPayPerHour1;
    }

    public void setEmployeeId(String employeeId1){
        this.employeeId = employeeId1;
    }
    //Overriding toString function

    @Override
    public String toString() {
        return (super.toString() + "\n" + "Hourly Rate: " + rateOfPayPerHour + "\n"+ "Employee ID: " + employeeId);
    }


    // Changing the return type of the toString
}
