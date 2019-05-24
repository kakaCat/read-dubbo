package read.dubbo.impl;

import org.springframework.stereotype.Service;
import read.dubbo.ITest;
import read.dubbo.ITest2;

/**
 * Created by JAVA on 2018/7/30.
 */
@Service
public class Test2 implements ITest2 {
    @Override
    public String iTest(String msg) {
        return "--dubbo--";
    }
}
