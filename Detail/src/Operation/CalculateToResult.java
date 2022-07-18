package Operation;

import java.util.List;
import java.util.Stack;
import MyException.myException;
public class CalculateToResult    {
    //利用后缀表达式进行计算;
    public static Double Calculate (List<String> example)throws myException  {
       double resultNumber = 0;
        Stack<String> result = new Stack<>();
        for (String temp : example) {
            if (temp.matches("\\d+")) {
                result.push(temp);
            } else {
                //不能用switch?
                Double nowNumber = Double.parseDouble(result.pop());
               Double previousNumber = Double.parseDouble(result.pop());
                if ("-".equals(temp)) {
                    resultNumber =  previousNumber-nowNumber ;
                }
                if ("+".equals(temp)) {
                    resultNumber = nowNumber + previousNumber;
                }
                if ("*".equals(temp)) {
                    resultNumber = nowNumber *previousNumber;
                }
                if ("/".equals(temp)) {
                    if(nowNumber==0){
                        throw  new myException("程序异常,我也不知道错在哪儿，所以要体面退出"+":"+example);
                    }
                    resultNumber = previousNumber/(double)nowNumber;
                }
                result.push(resultNumber+"");
            }
        }
        return Double.parseDouble(result.pop());
    }
}
