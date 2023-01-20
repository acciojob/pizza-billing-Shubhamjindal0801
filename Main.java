public class Main{
    public static void main(String[] args) {
        Pizza dp = new Pizza(true);
        
        dp.addExtraToppings();
        dp.addExtraCheese();
        dp.addExtraCheese();
        dp.addTakeaway();
        System.out.println(dp.getBill());
    }
}