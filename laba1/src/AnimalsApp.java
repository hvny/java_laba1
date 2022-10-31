import java.io.Console;

public class AnimalsApp {
    public static void main(String[] args) {
    Animal cat1 = new Cat( "Кот","Барсик", "Белый", 5, 0, 100);
    Animal cat2 = new Cat( "Кот","Рыжик", "Рыжий", 2, 0,100);
    Animal dog1 = new Dog("Собака", "Шарик", "Чёрный", 2, 500,10);
    Animal dog2 = new Dog("Собака", "Бобик", "Чёрно-белый", 1,500,10);
    Animal cat3 = new Cat( "Кот","Мурзик", "Серый", 10,0, 100);
    Animal tig1 = new Tiger("Тигр", "Степан", "Оранжевый",6, 1000, 100);
    Animal dino1 = new Dino("Динозавр", "Рептилоид", "Зелёный",20, 700, 150);
    Animal dino2 = new Dino("Динозавр", "Руслан", "Зелёный",25, 700, 150);

    Animal[] animals = new Animal[8];
    animals[0] = cat1;
    animals[1] = cat2;
    animals[2] = dog1;
    animals[3] = dog2;
    animals[4] = cat3;
    animals[5] = tig1;
    animals[6] = dino1;
    animals[7] = dino2;

    System.out.println("Создано котов: " + Cat.getCount() + "\nСоздано собак: " + Dog.getCount() + "\nСоздано Тигров: " + Tiger.getCount() + "\nСоздано динозавров: " + Dino.getCount());
    System.out.println("Всего животных: " + Animal.getCount() + "\n");
    for (int i = 0; i < animals.length; i++){
        animals[i].run(100);
        animals[i].swim(10000);
        System.out.println();
    }


}
}

