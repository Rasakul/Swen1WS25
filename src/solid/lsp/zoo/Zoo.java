package solid.lsp.zoo;

public class Zoo {
    public static void main(String[] args) {
        Bird bird1 = new Duck();
        bird1.fly();

        Bird bird2 = new Ostrich();
        bird2.fly();
    }
}