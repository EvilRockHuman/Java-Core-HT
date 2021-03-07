package HT_04_Methods;

public class HT04 {
    static int counter = 0;

    public static void main(String[] args) {
        func();
        func();
        func();
        System.out.println(counter);
    }
    static int func(){
        return counter++;
    }
}
