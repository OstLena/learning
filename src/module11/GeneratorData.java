package module11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.*;

public class GeneratorData {

    private Long a;// = 25214903917L;
    private Long c;// = 11L;
    private Long m;// = (long) Math.pow(2, 42);

    public GeneratorData(Long a, Long c, Long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public Stream<Long> run() {
        Stream<Long> stream = Stream.iterate(0L, x -> (a * x + c) % m);

        return stream;
    }

}
