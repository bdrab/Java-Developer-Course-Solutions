package exercise_41;
public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super("Deluxe","Sausage & Beacon", 14.54, "White Roll" );
        super.addHamburgerAddition1("chips", 2.75);
        super.addHamburgerAddition2("drinks", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You cannot add any item.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You cannot add any item.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You cannot add any item.");
    }
    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You cannot add any item.");
    }

    @Override
    public double itemizeHamburger() {

        return super.itemizeHamburger();
    }
}