package read.dubbo.api;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import read.dubbo.ITest;
import read.dubbo.ITest2;
import read.dubbo.impl.Test;

public class TestApi {


    public static void main(String[] args) throws Exception {
        ServiceConfig<Test> service = new ServiceConfig<>();
        service.setApplication(new ApplicationConfig("dubbo-demo-api-provider"));
        service.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
        service.setRegistry(new RegistryConfig("multicast://224.5.6.9:1234"));
        service.setInterface(ITest.class);
        service.setRef(new Test());
        service.export();
        System.in.read();
    }

}
