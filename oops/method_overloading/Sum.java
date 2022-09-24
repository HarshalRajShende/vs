package oops.method_overloading;

public class Sum {
    // method signature is the combination of the method name and the parameter list
    // used inside same class
    // methods have − same name, different parameters (different type or different number or both)
    //The return type doesn’t matter
    //If they don’t have different parameters, they both are still considered as same method and a compile time error will be generated

    
    int sum(int a, int b){
        return a + b;
    }
    double sum(int a, int b, int c){
        return a + b ;
    }
    double sum(double a, double b){
        return a + b;
    }
    double sum(int a, double b){
        return a + b;
    }


    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(5,6));  
        System.out.println(s.sum(5,6,6));
        System.out.println(s.sum(5.8,6.7));  
        System.out.println(s.sum(5,6.7)); 

        
       
    }
}
