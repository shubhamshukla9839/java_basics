package assignment.object_oriented;

class parent{

    public parent(){
        System.out.println(" parent constructor");
    } 
    public parent(int b,int c){                          // how can i acess this constructor using child class we will learn 
        System.out.println(" parent construct + 2 arg"+c+" "+b);
    }
    public parent(int a){
        System.out.println("parent constructor "+a);
    }
    void show(){
        System.out.println("show1");
    }
    void ad(){
        System.out.println("ad");
    }

}

class child extends parent{                                 ///class child extends parents,parents1   java doesnt suport multiple inheritence instead of this we can use herarical 
    public child(){
        System.out.println(" child constructor");

    }
    void ad2(){
        System.out.println("ad2");
    }


}

public class inheritance {
    public static void main(String[] args) {

        child c =new child();
        c.ad();

       // parent d=new parent(55);
        parent r=new parent();    //// we have to make seprate obj for separate constuctor 
        c.ad2();                   ///  how can i invoked all constructor ?  constructor chainning use ()  this(4)   )
    }

}