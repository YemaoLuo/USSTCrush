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
import org.springframework.web.bind.annotation.ResponseBody;
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

    @RequestMapping("/submit")
    public ModelAndView submit(crush crush, String email) {
        ModelAndView modelAndView = new ModelAndView();
        if (crush == null || email == null || crush.getUname().equals(crush.getTname())){
            modelAndView.setViewName("index");
            return modelAndView;
        }
        user user = new user(crush.getUname(), email);
        crush.setChecked(false);
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
        return modelAndView;
    }

    @RequestMapping("/WXsubmit")
    @ResponseBody
    public msg WXsubmit(crush crush, String email){
        if (crush == null || email == null || crush.getUname().equals(crush.getTname())){
            return new msg(false, "参数非法");
        }
        System.out.println(crush.toString() + " " + email);
        user user = new user(crush.getUname(), email);
        msg msgFound = submitService.checkUserExist(user);
        if (msgFound.getFlag() == false) {
            return msgFound;
        }
        msg msg = submitService.insertUser(user);
        crushService.insertCrush(crush);
        return msgFound;
    }
}
