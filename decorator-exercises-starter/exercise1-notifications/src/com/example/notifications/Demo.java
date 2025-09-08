package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        base.notify("Baseline email only.");

        // a) Email + SMS
        Notifier emailPlusSms = new SmsDecorator(base, "+91-99999-11111");
        emailPlusSms.notify("Email + SMS");

        // b) Email + WhatsApp
        Notifier emailPlusWhatsApp = new WhatsAppDecorator(base, "user_wa");
        emailPlusWhatsApp.notify("Email + WhatsApp");

        // c) Email + Slack
        Notifier emailPlusSlack = new SlackDecorator(base, "alerts");
        emailPlusSlack.notify("Email + Slack");

        // d) Email + WhatsApp + Slack
        Notifier emailWhatsAppSlack = new SlackDecorator(
                new WhatsAppDecorator(base, "user_wa"),
                "deployments");
        emailWhatsAppSlack.notify("Email + WhatsApp + Slack");
    }
}
