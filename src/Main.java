public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int imb = service.calculate(60);
        // int weight = 60; // вес тела
        // int growth = 160; // рост
        // int index = growth * growth / weight;
        System.out.println(("Индекс массы вшего тела: ") + imb);
    }
}
