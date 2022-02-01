public class A2B3C4 {

    public static void main(String[] args) {

        String str = "AABBBCCCC";
        String noDuplicate = "";
        for (int i = 0; i < str.length(); i++) {
            if (!noDuplicate.contains(""+str.charAt(i))){
                noDuplicate += ""+str.charAt(i);
            }
        }
        System.out.println(noDuplicate);
        String expected = "";
        for (int i = 0; i < noDuplicate.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)==noDuplicate.charAt(i))
                count++;
            }
            expected += noDuplicate.charAt(i)+""+count;
        }
        System.out.println(expected);
    }
}


