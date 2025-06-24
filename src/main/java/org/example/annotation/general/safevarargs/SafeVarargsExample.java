package org.example.annotation.general.safevarargs;

public class SafeVarargsExample {
   @SafeVarargs //제네릭 가변 인자에 대한 경고를 무시 but 사용하지 않는 것을 추천 (실무에서 사용x)
    public static <T> void printMessage(T... messages) {
        for (T message : messages){
            System.out.println(message);
        }
    }
}
