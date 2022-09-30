public class Chonkotron {

    Food slot1;
    Food slot2;
    Food slot3;

    public Chonkotron() {
        this.slot1 = new Food("ChonkyDeluxe", (800f/150f));
        this.slot2 = new Food("HealthyBoi", (500f/150f));
        this.slot3 = new Food("YouTooFat", (200f/150f));
    }

    public void RefillSlot(int slotNo) {
        switch (slotNo) {
            case 1 -> this.slot1.capacity = 500;
            case 2 -> this.slot2.capacity = 500;
            case 3 -> this.slot3.capacity = 500;
            default -> System.out.printf("Slot no %d does not exist, please upgrade your CHONKOTRON to a model" +
                    "with more food slots for just 3999$...\n", slotNo);
        }
    }

    // returns slot number to use for eating
    public int WeighCat(Cat c) {
        System.out.printf("Cat weighs %.2f kilograms. ", c.weight);
        if (c.weight < 4f) {
            System.out.print("Using food slot 1\n");
            return 1;
        } else if (c.weight >= 4f && c.weight < 7f) {
            System.out.print("Using food slot 2\n");
            return 2;
        } else {
            System.out.print("Kitty is too biggy. Using died food slot 3\n");
            return 3;
        }
    }

    @Override
    public String toString() {
        return "Chonkotron{" +
                "slot1=" + slot1 +
                ", slot2=" + slot2 +
                ", slot3=" + slot3 +
                '}';
    }

}
