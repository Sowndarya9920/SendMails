package com.geekster.SendMails;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication()
    {

        return new PasswordAuthentication(MailConstants.SENDER, "rsvhffumnjxmwgfs");
    }
}
