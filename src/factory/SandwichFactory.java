package factory;

public class SandwichFactory {
    public  static  final  int Chess_Burger=1;
    public static  final  int ChickenBurger=2;
    public  static  Sandwich createSandwich(int sandwichID){
        return switch (sandwichID) {
            case Chess_Burger -> new ChessBurger();
            case ChickenBurger -> new ChickenBurger();
            default -> null;
        };
    }
}
