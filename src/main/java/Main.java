import java.util.ArrayList;
import java.util.Random;


public class Main {


    public static void main(String[] args) {


        Human father = new Man("Vito", "Karleone", 1955,
                95,
                new String[][]{{DayOfWeek.MONDAY.name() + "do exercise"}}
        );

        Human mother = new Woman("Jane", "Karleone", 1956,
                85,
                new String[][]{{DayOfWeek.TUESDAY.name() + "do exercise"}, {DayOfWeek.WEDNESDAY.name(), "relax"}}
        );

        Human child = new Human("Michael", "Karleone", 1977,
                90,
                new String[][]{{"monday, do exercise"}, {"tuesday", "relax"}}
        );
        // child.setPet(p);

        //Human man = new Human();

        // father.greetPet();
        //   child.describePet();
        // Dog.respond();

        Random random = new Random();
        int secretNumber = random.nextInt(101);
        boolean feedTime;
        if (Pet.getTrickLevel() >= secretNumber) {
            feedTime = true;
        } else {
            feedTime = false;
        }
        // child.feedPet(feedTime);


        //Pet.eat();
        System.out.println(child);
        Family family = new Family(mother, father, new ArrayList<>());

        family.addChild(child);
        family.deleteChild(0);

        System.out.println(family);
//        System.out.println("Equality of dogs is " + pet.getNickName().equals(p.getNickName()));
//        System.out.println("Equality of dog and cat is " + pet.getNickName().equals(cat.getNickName()));
        System.out.println("Family count is: " + family.countFamily());

    }

    public static void garbageCollectorLoop() {
        for (int i = 0; i < 10000000; i++) {
            Human h = new Human();
        }

    }
}