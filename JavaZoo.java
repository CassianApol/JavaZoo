package zoo;

public class JavaZoo {

    public static String zooName = "Java Park n Zoo";

    public JavaZoo() {
    }

    public String getZooName() {
        return zooName;
    }

    public static void main(String[] args) {

        JavaZoo zoo = new JavaZoo();
        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][]");
        System.out.println("    Welcome to " + zoo.getZooName());
        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][]");

       

        Dolphin dolphin = new Dolphin(
            "Castro", "Dolphin", 3, true
        );

        dolphin.setTrick("Jumping");


        ZooKeeper keeper = new ZooKeeper(
            "John", "Head Keeper", 150, true
        );

   

        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][]" + ""); 

     
        keeper.feedAnimal(dolphin, "Fish");

        dolphin.performTrick();

        keeper.cleanCage();

        System.out.println("Keeper Salary: " + keeper.payMe(8));

        System.out.println("Total Animals: "
            + ZooAnimal.getAnimalCounter());
        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][]");
    }
}