package studayDay1;

import jdk.jfr.StackTrace;

/**
 * Operator
 * 运算符分类：
 * 1. 算术运算符
 * 2. 赋值运算符
 * 3. 比较运算符
 * 4. 逻辑运算符
 * 5. 位运算符
 * 6. 类型相关运算符
 * @Author lhq
 * @Version 1.0
 * 2021/2/6 18:21
 **/
public class Operator {

    public static void main(String[] args) {
        /**
         * 1. 算术运算符：+ - * / % ++ --
         * /：整数相除除数不为0，浮点数时可以
         * %：和整除类似，不过当有浮点数时，结果是非数：NaN
         * ++ -- : 只能操作单数值变量，不能操作常量和表达式；++ -- 在左先自增&自减在进行运算，反之
         * 2。赋值运算符： = 。扩展后，与算术运算符结合即可。
         * 3. 位运算符：& | ~ ^ << >> >>>
         * 4. 比较运算符: > < >= <= == !=
         * 5. 逻辑运算符： && & || | ！ ^
         * 6. 三目运算符： ?: 可以替换简单的if-else语句
         * 运算符的优先级：单目乘除位关系，逻辑三目后赋值.
         */

        var a = 5.2;
        var b = 3.1;
        System.out.println(a / b);

        //输出Infinity
        System.out.println(a / 0.0);
        //输出 -Infinity
        System.out.println(-a / 0.0);
        /**
         * ArithmeticException
         */
        //System.out.println(6 / 0);

        System.out.println(a % b);
        System.out.println(5 % 0.0);

        var c = 5;
        var d = ++c + 8;
        //14
        System.out.println(d);

        var e = 5;
        var f = e++ + 8;
        //13
        System.out.println(f);


        /**
         * && 短路与
         * & 不短路与
         * || 短路或
         * | 不短路或
         * ！ 非
         * ^ 异或（操作数） 布尔值中：就是说两个值不相同，则异或结果为真。反之，为假。二进制中：不同为1，相同为0，
         */
        System.out.println(1 > 2 ^ 1 < 2);

        /**
         * 短路与不短路的区别
         * 短路后 右边操作不执行
         */
        var g = 5;
        var h = 10;
        if( g > 4 | h ++ > 10) {
            System.out.println("g:" + g + " h:" + h);
        }

        var i = 7;
        var j = 8;
        if ( i > 6 || j ++ > 8) {
            System.out.println("i:" + i + "j:" + j);
        }

    }




}
