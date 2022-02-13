public class BonusMilesService {
    public int calculate(int price) {
        int number = 20;
        int miles = price / number;
        return miles;
    }
}
