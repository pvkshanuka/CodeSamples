import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Amila", 20);
        map.put("Danuka", 75);
        map.put("Lakshan", 90);
        map.put("Kusal", 80);
        map.put("Buddika", 70);
        map.put("Janith", 30);
        map.put("Dishan", 10);
        map.put("Roshell", 50);

        System.out.println(map);

        List<Map.Entry<String, Integer>> entries = map.entrySet().stream()
                .filter(e -> e.getValue() > 60)
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toList());

        System.out.println(entries);

    }

}
