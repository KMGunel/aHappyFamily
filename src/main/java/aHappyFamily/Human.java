package main.java.aHappyFamily;
import java.util.Random;
import java.util.Scanner;
public class Human {

    public String name;
    public String surname;
    public int year;
    public byte iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public Human() {

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, byte iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.printf("Hello, %s", pet.nickname);
    }

    public void describePet() {
        if (pet.trickLevel > 50) {
            pet.str = "very sly";
        } else {
            pet.str = "almost not sly";
        }
        System.out.printf("I have a %s, he is %s years old, he is %s", pet.species, pet.age, pet.str);
    }

    public static void feedPet() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(101);
        byte trickLevel = sc.nextByte();
        if (trickLevel > randomNum) {

            System.out.println("Hm... I will feed Jack");
        } else {

            System.out.println("I think Jack is not hungry.");
        }

    }
}