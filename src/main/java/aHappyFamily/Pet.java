package main.java.aHappyFamily;


public class Pet {

    public String species;
    public String nickname;
    public byte age;
    public byte trickLevel;
    public String[] habits;

    public String str;

    public Pet(){

    }

    public Pet(String species,String nickname){
        this.species=species;
        this.nickname=nickname;
    }

    public Pet(String species,String nickname,byte age,byte trickLevel,String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }



    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.printf("Hello, owner. I am - %s. I miss you!\n",this.nickname);
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }
}
