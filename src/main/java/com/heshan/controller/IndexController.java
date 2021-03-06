package com.heshan.controller;

import com.heshan.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author HeShan
 * @date 2019/10/28 16:19
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
       // int i = 9 / 0;
        String blog = null;
        if (blog == null){
            throw new NotFoundException("博客不存在");
        }
        return "index";
    }
}
