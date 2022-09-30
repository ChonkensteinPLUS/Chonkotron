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

    public void EndOfDay(){
        // Logik für ab oder zunehmen
    }

}
