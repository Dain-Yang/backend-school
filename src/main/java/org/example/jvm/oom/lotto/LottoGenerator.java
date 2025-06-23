package org.example.jvm.oom.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoGenerator {

    // 로또 번호를 생성하는 메서드
    public static Set<Integer> generateLottoNumbers() {
        Set<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();

        while (lottoNumbers.size() < 6) {
            int number = random.nextInt(45) + 1; // 1 ~ 45
            lottoNumbers.add(number);
        }

        return lottoNumbers;
    }
}
