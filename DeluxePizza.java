 public class DeluxePizza extends Pizza{
    
    public DeluxePizza(boolean isVeg){
        super(isVeg);
         
        addExtraCheese();
        addExtraToppings();
    }
 }