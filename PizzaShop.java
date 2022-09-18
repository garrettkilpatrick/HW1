import pizzaHelper.CS331Toppings;
import pizzaHelper.PizzaShopHelper;

/**
 * This is our top-level class that represents a PizzaShop!
 */
public class PizzaShop extends PizzaShopHelper{
    
    // this declares our instance variable "toppings"
    private CS331Toppings toppings;

    /**
     * This is the constructor of the PizzaShop class. You should initialize all your instalce variables here,
     * and be sure to open shop!
     */

    public PizzaShop() {
        super();
        System.out.println("We are open for business");
        //this initializes our instance variable "toppings"
        this.toppings = new CS331Toppings();
        
    }

    /**
     * This method is called automatically when the user clicks "Order 1". Check out
     * the Javadocs for more information.
     */

    @Override
    public void order1() {
        CS331Pizza orderOne = new CS331Pizza();
        orderOne.addMushrooms();
    }

    /**
     * This method is called automatically when the user clicks "Order 2". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order2() {
        CS331Pizza order2 = new CS331Pizza();
    }

    /**
     * This method is called automatically when the user clicks "Order 3". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order3(){
        CS331Pizza order3 = new CS331Pizza();
    }

    /**
     * This method is called automatically when the user clicks "Order 4". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order4() {
        CS331Pizza order4 = new CS331Pizza();
    }
}
