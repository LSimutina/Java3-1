public class BonusMilesService {
    public int calculate(int cost) {
        int oneMili = 20; // количество рублей для одной бонусной мили
        int miles = cost / oneMili;
        return miles;
    }
}
