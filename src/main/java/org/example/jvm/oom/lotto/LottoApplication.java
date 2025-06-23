package org.example.jvm.oom.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LottoApplication {

    public static void main(String[] args) {
        List<Set<Integer>> memoryLeakList = new ArrayList<>();

        while (true) {
            Set<Integer> lotto = LottoGenerator.generateLottoNumbers();
            memoryLeakList.add(lotto); // 누적시켜 OOM 유도

            System.out.println("로또 번호: " + lotto);
        }
    }
}
