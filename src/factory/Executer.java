package factory;

public class Executer {
    public static void main(String[] args) {
        Sandwich sandwich=SandwichFactory.createSandwich(SandwichFactory.Chess_Burger);
        sandwich.prepare();
    }
}
