// 文本注释
/**
 * @author liborui
 * @version 1.0
 */
public class forLearn {
    // the following are just for practice.
    public static void main(String[] args) {
        System.out.println("博睿 is studing java!");
        System.out.println("北京\t天津\t上海");
        System.out.println("jack\nboy\ndalele");
        System.out.println("'\\\\'");
        System.out.println("快要开学了我很开心：\"假的\"。");
        System.out.println("韩顺平\r教育北京");
        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t\t1000");

        // 浮点数的类型在计算机的存放形式是：浮点数 = 符号位 + 指数位 + 尾数位
        // 联想整数类型的long也需要在数值的末尾添加L或小写L
        float num = 1f;
        double num1 = 1; // 末尾有无 f在double类型下均可以使用
        double num2 = .512;
        float num3 = .512f;
        char num4 = 'h';
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        double a = 2.1;
        double b = 3 * 0.7;
        float c = 3 * 0.7f;
        int d = 4;
        System.out.println(b);
        System.out.println(c);
        if (a == b) {
            System.out.println("a和b的值相等");
        }

        char i = 'a';
        System.out.println((int)i);
        String S = d + "";
        System.out.println(S);


    }
}