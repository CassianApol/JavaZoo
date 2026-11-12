package zoo;
public class Dolphin extends ZooAnimal {

    private String trick;

    public Dolphin(String name, String type,
                   int age, boolean hungry) {
        super(name, type, age, hungry); 
    }

    public void performTrick() {
        System.out.println(name + " performs a " + trick + " trick!");
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    @Override
    public void eat(String food) {
        hungry = false;
        System.out.println(name + " the dolphin eats " + food + ".");
    }
}