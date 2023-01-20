public class Pizza{
    private boolean isVeg;
    private String bill="";
    private int price; 
    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isTakeAwayAdded = false;
    private int vegBasePrice = 300;
    private int nonVegBasePrice = 400;
    private int extraCheesePrice = 80;
    private int vegTopping = 70;
    private int nonVegTopping = 120;
    private int takeAwayCharge = 20;
    public Pizza(boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            this.price += 300;
            this.bill += "Base Price Of The Pizza: "+vegBasePrice+"\n";
        }
        else{
            this.price += 400;
            this.bill += "Base Price Of The Pizza: "+nonVegBasePrice+"\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            this.price += extraCheesePrice;

            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded){
            if(isVeg){
                this.price += vegTopping;
            }
            else{
                this.price += nonVegTopping;
            }
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        this.price += takeAwayCharge;
        isTakeAwayAdded = true;
    }

    public String getBill(){
        if(isCheeseAdded){
            this.bill += "Extra Cheese Added: "+extraCheesePrice+"\n";
        }
        if(isToppingsAdded){
            if(isVeg)
                this.bill += "Extra Toppings Added: "+vegTopping+"\n";
            else
                this.bill += "Extra Toppings Added: "+nonVegTopping+"\n";
        }
        if(isTakeAwayAdded){
            this.bill += "Paperbag Added: "+takeAwayCharge+"\n";
        }
        this.bill = this.bill+"Total Price: "+this.price;
        return this.bill;
    }
}