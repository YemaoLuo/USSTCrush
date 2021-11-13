package com.cpb.scheduled;
/*
  User: Yemao Luo
  Date: 2021/11/13
  Time: 16:08
*/

import com.cpb.domain.crush;
import com.cpb.domain.user;
import com.cpb.mapper.crushMapper;
import com.cpb.mapper.submitMapper;
import com.cpb.util.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class sendMail {

    @Autowired
    private crushMapper crushMapper;
    @Autowired
    private submitMapper submitMapper;

    @Scheduled(cron = "0 */1 * * * ?")
    public void sendMail(){
        System.out.println("Mail send...");
        List<user> allUsers = submitMapper.findAllUsers();
        for (user user: allUsers){
            String email = submitMapper.finduserByName(crushMapper.findSingleCrush(user.getName()).getUname()).getEmail();
            MailUtils.sendMail(email, "两情相悦", "USSTCrush的祝福");
        }
    }
}
