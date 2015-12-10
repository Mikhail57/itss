/**
 * Created by student on 10.12.2015.
 */
public class Person {
    private int Force;
    private int Intelligent;
    private int Luck;
    private int School;
    private int Health;

    public Person() {
        initWithRandomValue();
    }

    private void initWithRandomValue() {
        Force = (int)(Math.random()*100);
        Intelligent = (int)(Math.random()*100);
        Luck = (int)(Math.random()*100);
        School = -1;
        Health = 100;
    }


    public void setForce(int force) {
        this.Force = force;
    }

    public void setIntelligent(int intelligent) {
        this.Intelligent = intelligent;
    }

    public void setLuck(int luck) {
        Luck = luck;
    }

    public void setSchool(int school) {
        School = school;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getForce(){
        return Force;
    }

    public int getIntelligent() {
        return Intelligent;
    }

    public int getLuck() {
        return Luck;
    }

    public int getSchool() {
        return School;
    }

    public int getHealth() {
        return Health;
    }

    public String toString() {
        return ("Force:"+Force+"; Intelligent:"+Intelligent+"; Luck:"+Luck);
    }
}
