package assignment.object_oriented;

class animal{
    public animal(){
        //this(10);
        System.out.println("animal construct");
    }
    public animal(int a){
        System.out.println(" animal constructor 2"+ a);   //    how can i call it one way is constructor channing this(10) another way super in dog
    }
    void speak(){

        System.out.println("animal is speaking ");
    }
}
class dog extends animal{
    public dog(){
        super(10);                                       //      it is also constructor chaning but in different class
        System.out.println("dog-count");
    }
    void speak(){
        System.out.println("dog is barking");
    }
}

public class encapsulation_ {

    public static void main(String[] args ){
        dog d= new dog();
        d.speak();              ///normal overriding

        animal a= new dog();   // dynamic overriding
        a.speak();

       // dog dog2=(dog)new animal();
        d.speak();
    }
    
}