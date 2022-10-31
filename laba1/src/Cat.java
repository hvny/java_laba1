public class Cat extends Animal {
    private static int count;
    public Cat(String type, String name, String color, int age, int max_swim_distance, int max_run_distance) {
        /*this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
        this.max_run_distance = max_run_distance;
         */
        super(type,name,color,age,max_swim_distance,max_run_distance);
        count++;

    }

    public static int getCount(){
        return count;
    }
}