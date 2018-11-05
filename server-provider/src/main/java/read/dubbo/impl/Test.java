package read.dubbo.impl;

import read.dubbo.ITest;

/**
 * Created by JAVA on 2018/7/30.
 */
public class Test implements ITest {
    @Override
    public String iTest(String msg) {
        return "--dubbo--";
    }
}
