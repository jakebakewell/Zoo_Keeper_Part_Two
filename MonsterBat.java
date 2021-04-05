public class MonsterBat extends Monster {
    public MonsterBat(){
    }
    public void fly() {
        System.out.println("Whoosh! The bat took off flying!");
        energy -= 50;
    }
    public void eatHumans() {
        energy += 25;
    }
    public void attackTown() {
        System.out.println("The screams of people burning and the roaring sounds of flames can be heard off in the distance...");
        energy -= 100;
    }
}