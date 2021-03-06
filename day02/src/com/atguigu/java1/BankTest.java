package com.atguigu.java1;

/**
 * 使用同步机制将单例模式中的懒汉模式改写为线程安全的
 *
 *
 * @author yuqiCao
 * @create 2021-03-08 1:25 上午
 */
public class BankTest {


}

class Bank{

    private Bank(){

    }
    private static Bank instance = null;

    private static  Bank getInstance(){
        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if (instance == null){
//                instance = new Bank();
//            }
//            return instance;
//        }
        //方式二：效率更高n
        if (instance == null){
            synchronized (Bank.class) {
                if (instance == null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
