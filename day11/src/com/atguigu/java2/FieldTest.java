package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 获取当前运行时类的属性结构
 *
 *
 * @author yuqiCao
 * @create 2021-03-22 12:51 上午
 */
public class FieldTest {

    @Test
    public void test1(){

        Class clazz = Person.class;

        //获取属性结构
        //getFields():获取当前运行时类及其父类中的声明为public访问权限的属性
        Field[] fields = clazz.getFields();
        for (Field f : fields){
            System.out.println(f);
        }

        //getDeclaredFields():获取当前运行时类声明的所有的属性。（不包含父类的）
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields){
            System.out.println(f);
        }
    }

    //权限修饰符 数据类型 变量名
    @Test
    public void test2(){


        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields){
            //1。权限修饰符
            int modifiers = f.getModifiers();
            System.out.print(Modifier.toString(modifiers) + "\t");


            //2。数据类型
            Class type = f.getType();
            System.out.print(type.getName() + "\t");


            //3。变量名
            String fname = f.getName();
            System.out.print(fname);


            System.out.println();
        }
    }


}
