package learn.dubbo.spi;

import java.util.LinkedHashMap;

/**
 * Created by JAVA on 2018/8/14.
 */
public class Test {


    public static void main(String[] args) {

        LinkedHashMap<String,Object> linkedHashMap = new LinkedHashMap();

        linkedHashMap.put("22", "11");
        linkedHashMap.put("11", "22");
        linkedHashMap.put("33", "33");


        for (String key : linkedHashMap.keySet()) {

            System.out.println(key);
            System.out.println(linkedHashMap.get(key));

        }

    }



}
