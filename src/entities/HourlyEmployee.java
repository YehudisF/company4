package entities;


public class HourlyEmployee extends Employee{
    private  int hours;
    private  float wages;

    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wages) {
        super(firstName, lastName, id);
        this.hours = hours;
        this.wages = wages;
    }

    public HourlyEmployee(int hours, float wages) {
        this.hours = hours;
        this.wages = wages;
    }

    @Override
    public float earnings() {
        return 0;
    }
}
