package oops.Abstraction;

abstract class Pen {   
    // can not make object from abstract class 

    abstract void write();  
    // only has return type
    // abstract methods can only be inside abstract classes
    // abstract methods has no body/no implementation
    // implementation of all abstract methods must be done in child class

    // abstract class can also have solid methods (having body/implementation)
    void refil(){   
        System.out.println("refiling");
    }
}
