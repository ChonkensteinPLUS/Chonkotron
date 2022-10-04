public class Katze {

    private String name;
    private float gewicht;
    private int flauschalitaet;

    private float caloriesThisDay;

    {
        this.caloriesThisDay = 0;
        this.flauschalitaet = 100;
    }
    public Katze(String name, float gewicht){
        this.name = name;
        this.gewicht = gewicht;
    }

    public void eat(Futter catFood){
        System.out.println(this.name + ": Hmm, lecker " + catFood.getName());
        caloriesThisDay += catFood.getCalories();
    }

    protected void addCalories(float calories){
        this.caloriesThisDay = calories;
    }

    /**
     * Rechnet am Ende eines Tages aus,ob die Katze zu- oder abnimmt.
     */
    public void EndOfDay(){
        float calEvaluationValue = caloriesThisDay -1400;
        float weightBalance = calEvaluationValue / 500;
        this.gewicht += weightBalance;
        caloriesThisDay = 0;
    }

    public float getGewicht() {
        return gewicht;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Katze{" +
                "name='" + name + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }
}
