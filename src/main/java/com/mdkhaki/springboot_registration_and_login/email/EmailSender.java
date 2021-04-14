package com.mdkhaki.springboot_registration_and_login.email;

public interface EmailSender {
    void send(String to, String email);
}
