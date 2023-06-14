package Player;

import java.util.Objects;

public class Character {

    private String name;
    private int age;
    private String race;


    public Character(){

    }

    public Character(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character character)) return false;
        return name.equals(character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Character:  " +
                "name:  " + name + '\'' +
                ", age:  " + age + '\'' +
                ", race:  '" + race + '\'';
    }
}
