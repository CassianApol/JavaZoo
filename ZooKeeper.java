package zoo;
public class ZooKeeper {

    private String name;
    private String title;
    private double payRate;
    private boolean degree;

    public ZooKeeper() {
    }

    public ZooKeeper(String name, String title,
                     double payRate, boolean degree) {
        this.name = name;
        this.title = title;
        this.payRate = payRate;
        this.degree = degree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setDegree(boolean degree) {
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public double getPayRate() {
        return payRate;
    }

    public boolean hasDegree() {
        return degree;
    }

    public void feedAnimal() {
        System.out.println(name + " is feeding an animal.");
    }

    public void feedAnimal(ZooAnimal animal, String food) {
        animal.eat(food);
        System.out.println(name + " fed " + animal.getName());
    }

    public void cleanCage() {
        System.out.println(name + " is cleaning the cage.");
    }

    public double payMe(int hours) {
        return payRate * hours;
    }
}