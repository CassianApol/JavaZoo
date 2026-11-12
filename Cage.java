package zoo;

	public class Cage {

	    private int length;
	    private int width;
	    private int height;
	    private boolean clean;
	    private boolean covered;
	    private ZooAnimal animal;

	    public Cage() {
	    }

	    public Cage(int length, int width, int height,
	                boolean clean, boolean covered) {
	        this.length = length;
	        this.width = width;
	        this.height = height;
	        this.clean = clean;
	        this.covered = covered;
	    }

	    public void setLength(int length) {
	        this.length = length;
	    }

	    public void setWidth(int width) {
	        this.width = width;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }

	    public void setAnimal(ZooAnimal animal) {
	        this.animal = animal;
	    }

	    public int getLength() {
	        return length;
	    }

	    public int getWidth() {
	        return width;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public ZooAnimal getAnimal() {
	        return animal;
	    }

	    public boolean isClean() {
	        return clean;
	    }

	    public boolean isCovered() {
	        return covered;
	    }

	    public void displayCageInfo() {
	        System.out.println("Cage Information");
	        System.out.println("Length: " + length);
	        System.out.println("Width: " + width);
	        System.out.println("Height: " + height);
	        System.out.println("Clean: " + clean);
	        System.out.println("Covered: " + covered);

	        if (animal != null) {
	            System.out.println("Animal: " + animal.getName());
	        }
	    }
}
