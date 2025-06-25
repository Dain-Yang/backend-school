package dain.backend.annotation.general.deprecated;

public class OldLibrary {
    @Deprecated // 곧 사용되지 않을 기능 표시
    public void printMessage() {
        System.out.println("I'm old library");
    }
}
