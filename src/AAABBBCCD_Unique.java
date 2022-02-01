public class AAABBBCCD_Unique {

    public static void main(String[] args) {

        String str = "AAABBBCCD";
        String noDuplicate= "";

        for (int i = 0; i < str.length(); i++) {
            if(!noDuplicate.contains(""+str.charAt(i))){
                noDuplicate+=""+str.charAt(i);
            }
        }
        System.out.println(noDuplicate);
       String unique = "";
        for (int i = 0; i < noDuplicate.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(noDuplicate.charAt(i)==str.charAt(j))
                count++;
            }
            if(count==1)
           unique += ""+noDuplicate.charAt(i)+count;
            }
        System.out.println(unique);
    }
}
