public class BmiService {
    public int calculate(int weight) {
        int growth = 160; // ัะพัั
        int index = growth * growth / weight;
        return index;
    }
}
