/**
 * Copyright (C), 2015-2020, jymh有限公司
 * FileName: LoginController
 * Author:   chenhz
 * Date:     2020/6/19 11:47
 * Description: 登录控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.sjm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 *
 * @author chenhz
 * @create 2020/6/19
 * @since 1.0.0
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
//        return "login";
    }
}
