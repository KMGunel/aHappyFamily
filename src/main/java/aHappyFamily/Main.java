package main.java.aHappyFamily;



public class Main {
    public static void main(String[] args) {

        Human boy = new Human("Orkhan","Mustafa",(int)2017);
        System.out.println(boy.name);

        System.out.println("Isn't it time for feeding?");
        System.out.println("TrickLevel?");
        Human.feedPet();

    }
}
