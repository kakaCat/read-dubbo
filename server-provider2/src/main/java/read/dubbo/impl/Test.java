package read.dubbo.impl;

import org.springframework.stereotype.Service;
import read.dubbo.ITest;

/**
 * Created by JAVA on 2018/7/30.
 */
@Service
public class Test implements ITest {
    @Override
    public String iTest(String msg) {
        return "--dubbo--";
    }
}
