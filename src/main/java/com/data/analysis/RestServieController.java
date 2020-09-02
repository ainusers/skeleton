package com.data.analysis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @Author: tianyong
 * @Date: 2020/9/2 15:28
 * @Description: rest服务开放接口
 */
@Controller
public class RestServieController {

    /*
     * @Author: tianyong
     * @Date: 2020/9/2 15:28
     * @Description: rest服务开放函数
     */
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/service/calculation")
    public Integer calculation(Integer var1,Integer var2){
        return Utils.calculation(var1,var2);
    }


}
