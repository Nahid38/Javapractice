package Method_Overloading;

public class MethodOverloading {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(float a,float b){
        System.out.println(a+b);
    }
    void add(){
        System.out.println("Nothing to add");
    }
}
