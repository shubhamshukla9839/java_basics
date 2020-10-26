package assignment.object_oriented;

///////////////////////////////////////////////////////.......POJO......///////////.......class....../////

// pojo class old java object / bean class
// all variables should be private;
// genarate getter and setter 
// creat defuld constructor 
// genarate parameterized constructor 
// override  tostring() method (genarate )


public class employe {

    private String name;
    private int age;
    private double salary;
    private String address;                  // genarate getter setter right click genarate geter and seter 


    public employe(){

    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
       // parameterize construct then necesesory to add default constructor  //pojo class or bean class (one type of information club together )

    public employe(String name, int age, double salary, String address) {   

        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;

    }

    @Override
    public String toString() {
        return "employe [address=" + address + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
    }

    
}