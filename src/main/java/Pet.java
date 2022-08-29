

import java.util.Arrays;

public abstract class Pet {
    private Species species;
    private String nickName;
    private int age;
    private static int trickLevel;
    private String[] habits;

    public Species getSpecies() {
        return species;
    }



    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return species + " {" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.deepToString(habits) +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + " objects collected by garbage collector in Pet class");
    }



    public Pet() {

    }





    public Pet(String nickName, int age, int trickLevel, String[] habits) {

        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I'm eating.");
    }



    public abstract void respond();



    public void setHabits(String eat, String drink, String sleep) {
    }
}

