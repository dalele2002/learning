public class forLearn02 {
    public static void main(String args[]){
        String s = "123";
        int num = Integer.parseInt(s);
        System.out.println(num);

        String name = "dalele";
        int age = 20;
        double grade = 60;

        String a = "nihao";
        String b = "nihao";
        String c;
        c = a + b;
        System.out.println(c);

        int days = 59;
        int weeks;
        int leftDays;
        weeks = days / 7;
        System.out.println(weeks);
        leftDays = days % 7;
        System.out.println(leftDays);
    }
}
