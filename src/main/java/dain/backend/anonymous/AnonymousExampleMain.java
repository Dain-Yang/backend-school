package dain.backend.anonymous;

public class AnonymousExampleMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();

        Animal crow = new Animal() {
            @Override
            public void sound() {
                System.out.println("까악");
            }
        };

        crow.sound();

        Animal sparrow = new Animal() {
            @Override
            public void sound() {
                System.out.println("짹짹");
            }

          public String soundString() {
                return "짹짹";
          }
        };

        sparrow.sound();
    }
}
