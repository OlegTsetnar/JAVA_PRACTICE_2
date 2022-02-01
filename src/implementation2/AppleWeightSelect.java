package implementation2;

public class AppleWeightSelect implements AppleSelection {
    @Override public boolean test(Apple apple) {
        return apple.getWeight()>150;
    }
}
