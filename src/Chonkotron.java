import java.util.HashMap;
import java.util.Map;

public class Chonkotron {

    // private FoodContainer[] container;
    private Map<FeedTypes, FoodContainer> container;
    private float portionSize;

    {
        /*
        this.container = new FoodContainer[3];
        this.container[0] = new FoodContainer(FeedTypes.CHONKYDELUXE);
        this.container[1] = new FoodContainer(FeedTypes.HEALTHYBOI);
        this.container[2] = new FoodContainer(FeedTypes.YOUTOOFAT);
         */
        this.container = new HashMap<FeedTypes, FoodContainer>();
        this.container.put(FeedTypes.CHONKYDELUXE, new FoodContainer(FeedTypes.CHONKYDELUXE));
        this.container.put(FeedTypes.YOUTOOFAT, new FoodContainer(FeedTypes.YOUTOOFAT));
        this.container.put(FeedTypes.HEALTHYBOI, new FoodContainer(FeedTypes.HEALTHYBOI));
        this.portionSize = 100f;
    }

    public Map<FeedTypes, FoodContainer> getContainer() {
        return container;
    }
    public void setContainer(Map<FeedTypes, FoodContainer> container) {
        this.container = container;
    }
    public float getPortionSize() { return portionSize; }
    public void setPortionSize(float portionSize) { this.portionSize = portionSize; }

    public float dispenseFood(int weight, String name) {
        if (weight < 4) {
            FoodContainer ReturnContainer = this.container.get(FeedTypes.CHONKYDELUXE);
            System.out.printf("%s gets \"%s\".\n", name, ReturnContainer.getContent());
            ReturnContainer.setRemaining(ReturnContainer.getRemaining() - this.portionSize);
            return ReturnContainer.getContentCalories();
        } else if (weight < 7) {
            FoodContainer ReturnContainer = this.container.get(FeedTypes.HEALTHYBOI);
            System.out.printf("%s gets \"%s\".\n", name, ReturnContainer.getContent());
            ReturnContainer.setRemaining(ReturnContainer.getRemaining() - this.portionSize);
            return ReturnContainer.getContentCalories();
        }
        else {
            FoodContainer ReturnContainer = this.container.get(FeedTypes.YOUTOOFAT);
            System.out.printf("%s gets \"%s\".\n", name, ReturnContainer.getContent());
            ReturnContainer.setRemaining(ReturnContainer.getRemaining() - this.portionSize);
            return ReturnContainer.getContentCalories();
        }
    }


}
