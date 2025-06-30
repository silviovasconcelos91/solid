package lsp;

public class Sparrow extends Bird implements FlyingBird {
    @Override
    public String makeSound() {
        return "Sparrow sound";
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flies");
    }
}
