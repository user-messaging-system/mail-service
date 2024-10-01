package com.user_messaging_system.mail_service.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/mail")
public class MailController {

    @PostMapping("/send")
    public void sendMailToNewUser(String fromTo, String to, String subject, String body) {
        // Send mail to new user
    }
}
