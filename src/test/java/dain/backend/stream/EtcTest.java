package dain.backend.stream;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class EtcTest {
    private final Faker faker = new Faker();

    @Test
    void streamCanNotBeReused() {
        Stream<String> names = Stream.generate(() -> faker.name().fullName())
                .limit(2);
        names.forEach(System.out::println);
        // names.forEach(System.out::println); Stream은 두 번 사용할 수 없음
    }

    @Test
    void streamNeedReused() {
        List<String> names = Stream.generate(() -> faker.name().fullName())
                .limit(2)
                .toList();

        names.stream().forEach(System.out::println);
        names.stream().forEach(System.out::println); // 같은 리스트를 서로 다른 스트림에 담아서 표현
    }
}
