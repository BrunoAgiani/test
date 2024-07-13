import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class  ChainValidator {

    public static boolean validate(List<Node> nodes) {
        Set<Character> available = new HashSet<>();

        for (Node node : nodes) {
            available.addAll(node.getDependencies());
        }

        for (Node node : nodes) {
            Set<Character> dependencies = node.getDependencies();
            if (!available.containsAll(dependencies)) {
                return false;
            }
        }

        return true;
    }
}

