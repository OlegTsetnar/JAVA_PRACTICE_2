package implementation2;

public class AppleColorSelect implements AppleSelection{
    @Override public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
