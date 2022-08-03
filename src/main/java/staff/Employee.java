package staff;

public abstract class Employee {
    private String name;
    private String NI;
    private double salary;

        public Employee (String name, String NI, double salary){
            this.name =name;
            this.NI = NI;
            this.salary = salary;
        }

    public String getName(){ return name;}
    public String getNI() { return NI;}
    public double getSalary(){ return salary;}

    public void setName(String newName){
        if (newName != null){
            this.name = newName;
        }
    }
    public double raiseSalary(double raise){
            if (raise < 0) {
                return salary;
        }else {
                return this.salary += raise;
            }
    }
    public double payBonus(){
            return salary*0.01;
    }
}
