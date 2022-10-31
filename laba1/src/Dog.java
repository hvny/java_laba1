public class Dog extends Animal {
    private static int count;
    public Dog(String type, String name, String color, int age, int max_run_distance, int max_swim_distance) {
        super(type,name,color,age,max_swim_distance,max_run_distance);
        count++;
    }

    public static int getCount(){
        return count;
    }
}
