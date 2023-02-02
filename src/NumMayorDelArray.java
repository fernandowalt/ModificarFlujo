import java.util.Arrays;
import java.util.function.Function;

public class NumMayorDelArray {

public static void main (String[] args) {

    Function<Integer[], Integer> numeroMayor
            = arreglo -> Arrays.stream(arreglo)
                               .reduce(0, (a, b) -> a > b ? a : b);

    int mayor = numeroMayor
            .apply(new Integer[]{ 6, 7, 1, 3, 4, 8, 8, 48, 100, 457 });
    System.out.println(mayor);
}
}

