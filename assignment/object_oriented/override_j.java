package assignment.object_oriented;

public class override_j {

    
    public override_j(){
        System.out.println(" parent constructor");
    } 
    public override_j(int b,int c){                               // how can i acess this constructor using child class we will learn 
        System.out.println(" parent construct + 2 arg"+c+" "+b);
    }
    public override_j(int a){
        System.out.println("parent constructor "+a);
    }
    void show(){
        System.out.println("show1");
    }
    void show1(){
        System.out.println("show1");
    }
  //  void ad(){
       // System.out.println("ad");
    //}
}

 class child1 extends override_j{                                 ///class child extends parents,parents1   java doesnt suport multiple inheritence instead of this we can use herarical 
    public child1(){
        System.out.println(" child constructor");

    }
    void show()
    {
        System.out.println("child1 show override");
    }
    void ad(){
        System.out.println(" ad (override) =ad2");
    }

    
public static void main(String[] args) {
// normal binding
      child1 co= new child1();  // rename co alt+shift+R

     // co.ad();
      override_j obj =new child1();  // we are creat reference object of override_j type from child1 class 

      obj.show();
     // obj.ad();      // we cant use this becouse when we creat reference then only  common method(override_j and child) invoked

     override_j cu=new override_j();   // normal works like normal objects 
     cu.show();

   ///  child obj4= new override_j();  ///we cant do this      child obj4= (child)new override_j(); //we can cast but it provide runtime error 
  /// dynamic binding 
  
   override_j nu=(override_j)new child1();   //dynamic binding concept 
   nu.show1();
   
}
}
    
