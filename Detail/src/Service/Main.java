package Service;

import MyException.myException;

public class Main {
    public static void main(String[] args) {
        //test0~test3是验证自己的加减乘除和括号运算对不对
        try {
            Service test0 = new Service("1+2+3+(2*5+8)");
            Service test1 = new Service("(1+3+(1+2*3))+9");
            Service test2 = new Service("(1/2+8)+3");
            Service test3 = new Service("(1/2+8)+3-2+(2*8+9)");
            //下面这个已注释，会报自定义异常
            //Service test4 = new Service("(1/0+8)+3-2+(2*8+9)");
            //检查不规范字符
            Service test5=new Service("1(65#!^*");
        } catch (myException e) {
            System.out.println(e.getMessage());
        }

    }
}
