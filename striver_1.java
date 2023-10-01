import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class striver_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        Map<String, Integer> dataTypeSizes = new HashMap<>();
        dataTypeSizes.put("Integer", 4);
        dataTypeSizes.put("Long", 8);
        dataTypeSizes.put("Float", 4);
        dataTypeSizes.put("Double", 8);
        dataTypeSizes.put("Character", 1);

        Integer size = dataTypeSizes.get(input);
        if (size != null) {
            System.out.println(size);
        } else {
            System.out.println("-1");
        }
    }
}
