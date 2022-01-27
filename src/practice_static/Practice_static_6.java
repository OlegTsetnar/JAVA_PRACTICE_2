package practice_static;

public class Practice_static_6 {

    private int numberBags;
    boolean call;

    public Practice_static_6() {
        // Line 1
        this(2);         //added this(2) to run this constructor
        call = false;
        // Line 2
    }

    public Practice_static_6(int numberBags) {
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
    Practice_static_6 seed = new Practice_static_6();
        System.out.println(seed.numberBags);  //2

    }

}
