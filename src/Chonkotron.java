public class Chonkotron
{
    private Katzenfutter[] foodSlots;
    private double maxCapacity;
    private double dispenseAmount;

    {
        maxCapacity = 500.0;
        dispenseAmount = 100.0;
    }

    public Chonkotron () {

    }
    public Chonkotron (Katzenfutter[] foodarray) {
        this.foodSlots = foodarray;
    }

    public void DispenseFood (Katze cat) {
        int fatLevel;

        if (cat.getWeight() < 4.0) {
            fatLevel = 0;
        }
        else if (4.0 < cat.getWeight() && cat.getWeight() < 7.0) {
            fatLevel = 1;
        }
        else {
            fatLevel = 2;
        }

        Katzenfutter foodToDispense = this.foodSlots[fatLevel];

        if (foodToDispense.amount > this.dispenseAmount) {
            cat.EatFood(foodToDispense, this.dispenseAmount);
            foodToDispense.amount -= 100;
            System.out.printf("- Dispensing %s to %s. \n%s remaining: %.2f grams\n",
                    foodToDispense.getName(), cat.getName(), foodToDispense.getName(), foodToDispense.amount);
        }
        else if (foodToDispense.amount > 0) {
            cat.EatFood(foodToDispense, foodToDispense.amount);
            foodToDispense.amount = 0;
            System.out.printf("- Dispensing %s to %s. \n%s remaining: %.2f grams\n",
                    foodToDispense.getName(), cat.getName(), foodToDispense.getName(), foodToDispense.amount);
        }
        else {
            System.out.printf("%s is empty. %s goes hungry. :(", foodToDispense.getName(), cat.getName());
        }
    }

    public void Refill() {
        for (Katzenfutter food : foodSlots) {
            food.amount = maxCapacity;
        }
    }

    public double getMaxCapacity()
    {
        return maxCapacity;
    }
}
