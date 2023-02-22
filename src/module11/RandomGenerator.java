package module11;

import java.util.List;
import java.util.stream.Collectors;

public class RandomGenerator {

    public static void main(String[] args) {
        GeneratorData generatorData = new GeneratorData(25214903917L, 11L, (long) Math.pow(2, 42));
        List<Long> randomList = generatorData
                .run()
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(randomList);
    }
}
