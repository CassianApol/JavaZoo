package zoo;

	public class ZooAnimal {

	    protected String name;
	    protected String type;
	    protected int age;
	    protected boolean hungry;
	    protected static int animalCounter = 0;

	    public ZooAnimal() {
	        animalCounter++;
	    }

	    public ZooAnimal(String name, String type, int age, boolean hungry) {
	        this.name = name;
	        this.type = type;
	        this.age = age;
	        this.hungry = hungry;
	        animalCounter++;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getType() {
	        return type;
	    }

	    public int getAge() {
	        return age;
	    }

	    public boolean isHungry() {
	        return hungry;
	    }

	    public void sleep() {
	        System.out.println(name + " is sleeping.");
	    }

	    public void sleep(int hours) {
	        System.out.println(name + " slept for " + hours + " hours.");
	    }

	    public void eat() {
	        hungry = false;
	        System.out.println(name + " is eating.");
	    }

	    public void eat(String food) {
	        hungry = false;
	        System.out.println(name + " is eating " + food + ".");
	    }

	    public static int getAnimalCounter() {
	        return animalCounter;
	    }
	}

