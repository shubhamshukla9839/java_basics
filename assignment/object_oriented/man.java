package assignment.object_oriented;


public class man extends human {

    public static void main(String[] args ){

        man obj= new man();
        obj.walk();
        obj.speak();
        obj.eat();
        obj.run();

    }

    @Override
    void speak() {
        System.out.println("men is speaking");

    }
    @Override
    void walk(){

    }
    @Override
    void run(){

    }

    @Override
    void eat(){

    }
    
}