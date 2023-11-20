public class BonusMilesService {
    public int calculate (int price) {
        int bonusPrice =20;
        int bonusMiles = price / bonusPrice;
        return bonusMiles;
    }
}
