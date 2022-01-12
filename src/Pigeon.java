public class Pigeon extends Bird{
    int hunger=0;
    static String type = "pigeon";

    public Pigeon(String[] continents, int population, int hunger) {
        super(Pigeon.type, continents, population);
        this.hunger = hunger;

    }


    public void askForSeeds(){
        if (this.hunger <7 ) this.hunger = 0;
        else this.hunger -= 7;
    }


    public void sleep(){
        this.hunger +=3;

    }


    public int getHunger() {
        return hunger;
    }
}
