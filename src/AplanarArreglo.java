import java.util.Arrays;

public class AplanarArreglo {

public static void main (String[] args) {

    String[][] lenguajes = { { "java", "groovy" }, { "php" }, { "c#", "python", "groovy" }, { "java", "javascript", "kotlin" }, { "javascript" }, { } };

    Arrays.stream(lenguajes).flatMap(Arrays::stream).distinct().forEach(System.out::println);


}
}
