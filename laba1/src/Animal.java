public class Animal {
    String type;
    String name;
    String color;
    int age;
    int max_run_distance;
    int max_swim_distance;
    private static int count;
    public Animal() {
    }
    public Animal(String type, String name, String color, int age, int max_swim_distance, int max_run_distance) {
        this.type = type;
        this .name = name;
        this.color = color;
        this.age = age;
        this.max_swim_distance = max_swim_distance;
        this.max_run_distance = max_run_distance;
        count++;
    }



    public void swim(int length)
    {
        if (max_swim_distance >= length){
            System.out.println(type + " " + name + " проплыл " + length + " метра(ов)");
        }
        else {
            System.out.println(type + " " + name + " утонул :(");
        }
    }
    public void run(int length) {
        if (max_run_distance >= length){
            System.out.println(type + " " + name + " пробежал " + length + " метра(ов)");
        }
        else {
            System.out.println(type + " " + name + " не смог пробежать " + length + " метра(ов)");
        }
    }
    public void animalInfo() {
        System.out.println("Животное: " + type + "\nимя: " + name + "\nцвет: " + color + "\nвозраст: " + age);
    }
    public static int getCount(){
        return count;
    }


}

