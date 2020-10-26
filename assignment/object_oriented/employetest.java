package assignment.object_oriented;

public class employetest {

    public static void main(String[] args ){

    employe obj = new employe();
    obj.setAddress("renukoot");
    obj.setAge(20);
    obj.setName("shubham");
    obj.setSalary(5000);
    
    /// System.out.println(obj);   // we can print using this or we can make array of objects 
    ///obj.name="shubham";  name is private so how can i acess

     employe obj1 = new employe();

     obj1.setName("saurabh");
     obj1.setAddress("renukoot1");
     obj1.setAge(22);
     obj1.setSalary(20000);

     employe obj2= new employe("shubham",10,100,"renukoot ");       // we can use another way also but it is less readable 

    

     employe [] employess=new employe[3];
     employess[0]=obj;
     employess[1]=obj1;
     employess[2]=obj2;

     for(employe emp:employess){
         System.out.println("name=="+emp.getName()+"\t age =="+emp.getAge()+"\t address=="+emp.getAddress());
     }



        }
    
}