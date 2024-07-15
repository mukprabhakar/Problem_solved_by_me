/* Given two strings  S1 and S2 . You have to concatenate both the strings and print the concatenated string. */

public class problem25 {
    static String conCat(String s1 , String s2){
        String result = s1 + s2;
        return result;
    } 
    public static void main(String[] args) {
        String s1 = "Mukesh";
        String s2 = "Pal";
        String result = conCat(s1,s2);
        System.out.println(result);
    }
}
