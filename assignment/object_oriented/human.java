package assignment.object_oriented;
/////////////abstract/////

// we can have abstract method and non abstract(concrete method) method in abstract class ()
// add abstract keyword before method to create abstract method 
// for abstract method doesnt have method body 
// if all method  are abstract then that class will be 100 % abstraction
// if partial some method abstract and some not then its 0-100 % abstraction 
// you cant create abstract method in non abstract class 

abstract class human {
    // abstract method 
    
    abstract void walk();
    abstract void eat();
    abstract void speak();
    abstract void run();
    
}