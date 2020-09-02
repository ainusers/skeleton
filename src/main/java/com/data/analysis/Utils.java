package com.data.analysis;

/*
 * @Author: tianyong
 * @Date: 2020/9/2 15:29
 * @Description: 工具类 (算法函数库)
 */
public class Utils {


    /*
     * @Author: tianyong
     * @Date: 2020/9/2 15:29
     * @Description: 模拟算法 （求两数之和）
     */
    public static Integer calculation(Integer var1,Integer var2){
        return var1 + var2;
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/2 15:35
     * @Description: 通过main主函数，快速测试函数，不需要启动服务访问接口
     * @Description: 函数测试通过后，main函数可以删除
     */
    public static void main(String args[]){
        System.out.println(calculation(1,2));
    }


}
