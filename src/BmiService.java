public class BmiService {
    public int calculate(int weight) {
        int growth = 160; // рост
        int index = growth * growth / weight;
        return index;
    }
}
