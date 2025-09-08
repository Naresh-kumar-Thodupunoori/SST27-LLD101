package com.example.notifications;


public class NotifierDecorator implements Notifier {
    protected final Notifier wrapped;

    public NotifierDecorator(Notifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void notify(String text) {
        if (wrapped != null) {
            wrapped.notify(text);
        }
    }
}


