import java.util.List;

public class Validator {
    public static void main(String[] args) {
        List<Node> validNumberChain = List.of(
                new NumberNode(36), new NumberNode(6), new NumberNode(24),
                new NumberNode(4), new NumberNode(47), new NumberNode(7),
                new NumberNode(2), new NumberNode(3), new NumberNode(27)
        );

        List<Node> validWordChain = List.of(
                new WordNode("p"), new WordNode("aba"), new WordNode("a"),
                new WordNode("b"), new WordNode("perso"), new WordNode("o"),
                new WordNode("r"), new WordNode("e"), new WordNode("s")
        );

        List<Node> invalidNumberChain = List.of(
                new NumberNode(35), new NumberNode(5), new NumberNode(65),
                new NumberNode(6), new NumberNode(24), new NumberNode(4)
        );

        System.out.println("Valid number chain: " + ChainValidator.validate(validNumberChain)); // true
        System.out.println("Valid word chain: " + ChainValidator.validate(validWordChain)); // true
        System.out.println("Invalid number chain: " + ChainValidator.validate(invalidNumberChain)); // false
    }
}