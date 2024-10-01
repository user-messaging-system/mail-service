package com.user_messaging_system.mail_service.api.input;

import java.util.List;

public record MailInput(
        String fromTo,
        List<String,
        String to,
        String subject,
        String body
) {}