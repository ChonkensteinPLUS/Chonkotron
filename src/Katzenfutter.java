public class Katzenfutter
{
    private String name;
    private double calories;
    protected double amount;

    public Katzenfutter (String name, double cals, double amount) {
        this.name = name;
        this.calories = cals;
        this.amount = amount;
    }

    public String getName()
    {
        return name;
    }
    public double getCalories()
    {
        return calories;
    }
}
