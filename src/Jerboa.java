public class Jerboa {

    private String name;
    private float weight;
    private int fluffability;
    private float calorieIntake;

    public Jerboa(String name, float weight, int fluffability) {
        this.name = name;
        this.weight = weight;
        this.fluffability = fluffability;
        this.calorieIntake = -1400f;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }
    public int getFluffability() { return fluffability; }
    public void setFluffability(int fluffability) { this.fluffability = fluffability; }

    public void grabGrub(Chonkotron grubmachine) {
      //  this.calorieIntake = this.calorieIntake + grubmachine.dispenseFood(this.weight, this.name);
    }

    public void evalWeight() {
        int weightGain = (int) this.calorieIntake/500;
        this.weight = this.weight + weightGain;
        this.calorieIntake = -1400f;
    }

    @Override
    public String toString() {
        return "Jerboa{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
