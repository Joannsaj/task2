public class Legos {
    public static void main(String[] args) {
        int amountOfBricks= 97;
        int containerCapacity= 6;

        //number of full and not full containers
        int numberOfFullContainers =  amountOfBricks/containerCapacity;

        System.out.println("There are " + numberOfFullContainers + " full containers.");
        System.out.println("There are " + (numberOfFullContainers+1) + " containers in general.");

    }
}
