import java.util.*;

/**
 * 並び替え対象となる数字の数を入力される
 * 対象となる数が入力される
 */
public class ListSortStream0814 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        List<Integer> numbers = new ArrayList();

        for(int i=0; i < count; i++){
            numbers.add(sc.nextInt());
        }
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}