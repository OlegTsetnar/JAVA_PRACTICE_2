package implementation;

public class TestSorting {
    public static void main(String[] args) {

        TestSorting test = new TestSorting();

        BubbleSort bs = new BubbleSort();
        QuickSort qs = new QuickSort();

        test.setSorting(bs);
        test.setSorting(qs);
    }

    public void setSorting(Sort sorting){
        sorting.sort();
    }
}
