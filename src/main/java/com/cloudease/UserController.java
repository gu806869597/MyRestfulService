package com.cloudease;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制接口
 */
@RestController
public class UserController {

    /**
     * [测试SpringMVC是否可行]
     * @param name 名字
     * @return 结果
     */
    @RequestMapping(value = "/sayHello/{name}",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    public String sayHello(@PathVariable("name") String name){
        return "锅锅"+name;
    }
}
