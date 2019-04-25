import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        HashMap<Integer, String> map;
        map = new HashMap<>();
        map.put(1, "raj");
        map.put(2, "raj");
        final String raj = map.put(3, "raj");

        System.out.println(map);
        System.out.println();

    }
}
