package Overloading_Constructor;

public class OverloadingConstructorTest {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        System.out.println();


        Teacher teacher2=new Teacher("Nahid","Male");
        teacher2.displayInformation();

        System.out.println();


        Teacher teacher3=new Teacher("Boss","Male",5446854);
        teacher3.displayInformation();


    }
}
