package static_keyword;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("Nahid Hossen",100);
        Student s2=new Student("Hablu", 101);


        s1.displayInformation();
        System.out.println();
        s2.displayInformation();
    }
}
