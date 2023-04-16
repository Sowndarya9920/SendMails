package com.geekster.SendMails;

public class SendMailsApplication {

	public static void main(String[] args) {

		System.out.println("This application is supposed to send mails");

		HandleMail mailer = new HandleMail();
		mailer.sendMail();
	}

}
