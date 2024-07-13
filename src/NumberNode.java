import java.util.HashSet;
import java.util.Set;

public class NumberNode implements Node {
    private int value;

    public NumberNode(int value) {
        if (value < 0 || value > 99) {
            throw new IllegalArgumentException("Number must be between 0 and 99");
        }
        this.value = value;
    }

    @Override
    public Set<Character> getDependencies() {
        Set<Character> dependencies = new HashSet<>();
        String numberStr = String.valueOf(value);
        for (char ch : numberStr.toCharArray()) {
            dependencies.add(ch);
        }
        return dependencies;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}