class StarSystem {
    private String starName;
    private int quantityOfPlanets;
    private int age;

    public StarSystem(String starName, int quantityOfPlanets, int age) {
        this.starName = starName;
        this.quantityOfPlanets = quantityOfPlanets;
        this.age = age;
    }


    public String getInfo(String starName, int quantityOfPlanets, int age) {

        String string = (starName +" " + quantityOfPlanets + " " + age);
        return string;

    }


    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public int getQuantityOfPlanets() {
        return quantityOfPlanets;
    }

    public void setQuantityOfPlanets(int quantityOfPlanets) {
        this.quantityOfPlanets = quantityOfPlanets;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
