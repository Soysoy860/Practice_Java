//StrimguBuider で試す

public class StringBuilder0812 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("watch's price is ");
        sb.append(100);
        sb.append(" yen.");

        String msg = sb.toString();
        System.out.println(msg);

        sb.insert(2, "XYZ");
        System.out.println(sb);

    }
}
