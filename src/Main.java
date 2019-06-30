import java.util.Arrays;
import java.util.List;

class Father{

    static int age=20;
    String name="father";

    public static int getAge() {
        return age;
    }
    public String getName() {
        System.out.println(this);
        return name;
    }

}
public class Main extends Father{
    public Main(){

    }
    public static void main(String[] args) {
        System.out.println(Main.age);
        System.out.println(new Main().getName());
    }
}
