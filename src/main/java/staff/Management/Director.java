package staff.Management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String NI, double salary, String deptName, double budget) {
        super(name, NI, salary, deptName);
        this.budget = budget;
    }


    public double getBudget(){ return this.budget;}

    public double payBonus(){
        Double dirBonus = getSalary()*0.02;
        return dirBonus;
    }

}
