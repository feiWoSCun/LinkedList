package Operation;

import MyException.myException;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MiddleToSuffix  {

    public static void main(String[] args) {
    }
//把前缀表达式转换成后缀表达式
    public static List<String> transMidToSuf(List<String> list)throws myException {
        //操作符号的栈
        Stack<String> operation = new Stack();
        //存放结果的栈
        List<String> res = new ArrayList<>();
        for (String cell : list) {
            if (cell.matches("\\d+")){
                res.add(cell);
            } else if ("(".equals(cell)) {
                operation.push(cell);
            } else if (")".equals(cell)) {
                while (!operation.peek().equals("(")) {
                    res.add(operation.pop());
                }
                operation.pop();
            }
            //根据操作符优先级弹栈
            else{
                while(operation.size()!=0&&JudgeWhoLevelHigh(operation.peek())>=JudgeWhoLevelHigh(cell)){
                    res.add(operation.pop());
                }
                operation.push(cell);
            }
        }
while (operation.size()!=0){
    res.add(operation.pop());
}
return  res;
    }

    //将字符串转化成中缀表达式
    public static  List<String> doDetail(String example)throws myException {
        for(int i=0;i<example.length();i++){
            check(example.charAt(i),example);
        }
        List<String> list = new ArrayList<>();
        int i = 0;
        String str;
        do {

            if (  example.charAt(i) < 48 ||  example.charAt(i) > 57) {
                list.add("" + example.charAt(i));
                i++;
            } else {
                str = "";//清空str;
                //考虑十位数以上的叠加;
                while (i<example.length()&&example.charAt(i) >= 48 && example.charAt(i) <= 57) {
                    str += example.charAt(i++);
                    //更新temp;

                }
                list.add(str);
            }
        } while (i < example.length());
        return list;

    }
public static void  check(char str,String s) throws myException{
        if((str>57||str<48)&&str!='/'&&str!='*'&&str!='+'&&str!='-'&&str!='('&&str!=')'){
            throw new myException("字符不符合规范"+":"+s);

        }
}

    //判断操作数优先级
    public static int JudgeWhoLevelHigh(String target) {
        if ("+".equals(target) || "-".equals(target)) return 0;
        if("*".equals(target) || "/".equals(target)) return 1;
        else return -1;
    }


}
