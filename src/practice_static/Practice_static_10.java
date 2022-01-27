package practice_static;

public class Practice_static_10 {
    int numSpots;

    public Practice_static_10() {
        this.numSpots = 35;
    }

    public Practice_static_10(int numSpots) {
        this();
        this.numSpots = numSpots;
    }

    public static void main(String[] args) {
        System.out.println(new Practice_static_10(50).numSpots);
    }

}

