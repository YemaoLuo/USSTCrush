package com.cpb.controller;

import com.cpb.domain.crush;
import com.cpb.domain.msg;
import com.cpb.domain.user;
import com.cpb.service.crushService;
import com.cpb.service.submitService;
import com.cpb.util.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author: cpb
 * Date: 2021/11/11 下午8:36
 */

@Controller
public class mainController {

    @Autowired
    private submitService submitService;
    @Autowired
    private crushService crushService;
    @Autowired
    private MailUtils mailUtils;

    @RequestMapping("/submit")
    public ModelAndView submit(crush crush, String email) {
        ModelAndView modelAndView = new ModelAndView();
        user user = new user(crush.getUname(), email);
        msg msgFound = submitService.checkUserExist(user);
        if (msgFound.getFlag() == false) {
            modelAndView.setViewName("index");
            modelAndView.addObject("msg", msgFound);
            return modelAndView;
        }
        msg msg = submitService.insertUser(user);
        crushService.insertCrush(crush);
        modelAndView.setViewName("success");
        modelAndView.addObject("msg", msg);
        MailUtils.sendMail(email, "祝你好运！", "USSTCrush自动发送");
        return modelAndView;
    }
}
