package static_block;

public class StaticBlock {

    static int id;
    static String name;

    static {
        id=101;
        name="Nahid";
    }

    static void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
}
