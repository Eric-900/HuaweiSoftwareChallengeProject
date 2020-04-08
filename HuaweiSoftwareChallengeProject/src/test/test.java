package test;
import	java.util.ArrayList;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author 陌意随影
 * @create 2020-04-08 1:02
 * @desc 测试
 **/
public class test {
    @Test
    public void testArrayListTime01(){
     //测试ArrayList动态增长的时间
        ArrayList<Integer> list =new ArrayList<Integer> ();
        for (int i = 0; i < 280000; i++) {
            list.add(i);
        }
        //用时29ms
    }
    @Test
    public void testArrayListTime02(){
        //测试ArrayList固定增长的时间
        ArrayList<Integer> list =new ArrayList<Integer> ();
        for (int i = 0; i < 280000; i++) {
            list.add(i);
        }
        //用时17ms
    }
}
