package learn.dubbo.spi;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import read.dubbo.ITest;

/**
 * Created by JAVA on 2018/8/12.
 */
public class App {



    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                (new String[] {"dubbo-client.xml"});

        for(;;){

            ITest test = (ITest)context.getBean("test"); // 获取远程服务代理

            String msg = test.iTest("--");
            System.out.println(msg);
        }



    }


}
