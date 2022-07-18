package Service;

import MyException.myException;
import Operation.CalculateToResult;
import Operation.MiddleToSuffix;

public class Service {
    String temp;

    public Service(String temp) throws myException {
        this.temp = temp;
        //傻眼了吧，这么长
        System.out.println(CalculateToResult.Calculate(MiddleToSuffix.transMidToSuf(MiddleToSuffix.doDetail(temp))));

    }
}
