import java.util.*;

/**
 * 並び替え対象となる数字のペアの数を入力
 * ペアを辞書的並び替えして出力
 */
public class ListReverseStream0815 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        List<String> pairs = new ArrayList();
        for(int i = 0 ; i< count ; i++){
            String a = sc.next();
            String b =sc.next();
            if (a.length() == 1) {
                a = "0" + a;
            }

            if (b.length() == 1) {
                b = "0" + b;
            }
            pairs.add(a+b);
        }


        String[] result =pairs.stream()
                .sorted(Comparator.reverseOrder())//降順
                .toArray(String[]::new);

        for(String r : result){
            System.out.println(Integer.parseInt(r.substring(0,2)) + " " + Integer.parseInt(r.substring(2,4)));
        }

    }
}
