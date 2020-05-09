package org.lemon.jvmstudy.classloader;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年05月04日 21:19:00
 */
public class B2cMuSpider {

    static {
        System.out.println("B2cMuSpider static block invoke!");
    }

    public void getFlightList(){
        System.out.println("抓取航班数据");
    }
}
