import java.util.Arrays;
import java.util.stream.IntStream;

public class ModificarFlujoYsumar {
public static void main (String[] args) {

    int[] numeros = IntStream.rangeClosed(1, 100).toArray();

    double suma = Arrays.stream(numeros)
                        .filter(num -> ! ((num % 10) == 0))
                        .mapToDouble(n -> (double) n / 2)
                        .reduce(0, Double::sum);
    System.out.println(suma);
}
}