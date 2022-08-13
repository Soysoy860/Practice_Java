import java.util.*;


public class Replace0813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        //String t = st.replaceAll("[aeiouAEIOU]", ""); //母音削除
        String t = st.replaceAll("[^aeiouAEIOU]", "");//母音が残る
        System.out.println(t);
    }
}
