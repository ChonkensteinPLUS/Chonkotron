public class Cat {

    String name;
    float weight;
    int fluffyness;
    int mealsToday;
    float calsToday;

    {
        this.mealsToday = 0;
        this.calsToday = 0;
    }

    public Cat(String name, float weight, int fluffyness) {
        this.name = name;
        this.weight = weight;
        this.fluffyness = fluffyness;
    }

    public void Meow() {
        System.out.println("Meeeooooowwwwwww...");
    }

    public boolean Eat(Chonkotron c, int slotNo) {
        switch (slotNo) {
            case 1:
                if (c.slot1.capacity >= 100) {
                    c.slot1.capacity -= 100;
                    this.calsToday += c.slot1.calPerG * 100f;
                    this.mealsToday++;
                    System.out.println("YUMMY");
                    this.fluffyness += 10;
                    return true;
                } else {
                    System.out.printf("Not enough food in slot %d\n", slotNo);
                    return false;
                }
            case 2:
                if (c.slot2.capacity >= 100) {
                    c.slot2.capacity -= 100;
                    this.calsToday += c.slot2.calPerG * 100f;
                    this.mealsToday++;
                    System.out.println("haz ok taste");
                    this.fluffyness += 5;
                    return true;
                } else {
                    System.out.printf("Not enough food in slot %d\n", slotNo);
                    return false;
                }
            case 3:
                if (c.slot3.capacity >= 100) {
                    c.slot3.capacity -= 100;
                    this.calsToday += c.slot3.calPerG * 100f;
                    this.mealsToday++;
                    System.out.println("ewwwwwwwww diet food");
                    this.fluffyness -= 10;
                    return true;
                } else {
                    System.out.printf("Not enough food in slot %d\n", slotNo);
                    return false;
                }
            default:
                System.out.println("but me still haz hunger...");
                this.fluffyness -= 5;
                return true;
        }

    }

    public void Sleep() {
        System.out.println("yawwwwwwnnnnnnnn...nighty night");
        this.Metabolism();
        this.mealsToday = 0;
        this.calsToday = 0;
    }

    private void Metabolism() {
        float factor = 1f/500f;  // kg/kalorie
        if (this.calsToday < 1000f) {
            float weightLoss = (1000f-this.calsToday) * factor;
            this.weight -= weightLoss;
        } else if (this.calsToday > 1000f) {
            float weightGain = (this.calsToday - 1000f) * factor;
            this.weight += weightGain;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", fluffyness=" + fluffyness +
                ", mealsToday=" + mealsToday +
                ", calsToday=" + calsToday +
                '}';
    }
}
