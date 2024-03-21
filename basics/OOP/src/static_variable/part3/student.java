package static_variable.part3;

public class student {

    static int count=0;

    student (){
        count++;
    }

    void Display(){
        System.out.println("Total Counter :"+count);
    }
}
