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

    @Scheduled(cron = "0 30 0 * * ?")
    public void sendMail() {
        Boolean flag = false;
        System.out.println("Mail send...");
        List<user> allUsers = submitMapper.findAllUsers();
        int count = 0;
        for (user user : allUsers) {
            user user1 = submitMapper.finduserByName(crushMapper.findSingleCrush(user.getName()).getUname());
            crush crush = crushMapper.findCrush(user.getName(), user1.getName());
            if (user1 != null && crush.getChecked() == false) {
                String email = user1.getEmail();
                try{
                    MailUtils.sendMail(email, "两情相悦", "USSTCrush的祝福");
                    MailUtils.sendMail(user.getEmail(), "两情相悦", "USSTCrush的祝福");
                    flag = true;
                }catch (Exception e){
                    e.printStackTrace();
                    return;
                }
                if (flag) {
                    crushMapper.updateCrushChecked(user1.getName());
                    crushMapper.updateCrushChecked(user.getName());
                    count ++;
                }
            }
        }
        MailUtils.sendMail("leafysn@qq.com", "USSTCrush mails = " + String.valueOf(count), "USSTCrushReport");
    }
}
