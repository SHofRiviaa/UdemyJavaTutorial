package Section3_Advanced.Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ConceptOptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("McDavid", "Draisatl", "Bouchard");

        // Optional class
        // Optional class is a container object which may or may not contain a non-null value
        // Optional class is used to represent a value is present or absent
        // Optional class is used to avoid null pointer exceptions

        Optional<String> name = names.stream().filter(n -> n.startsWith("M")).findFirst();

        System.out.println(name.orElse("Not found!"));
    }
}
