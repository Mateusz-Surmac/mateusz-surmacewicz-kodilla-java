package com.kodilla.patterns.strategy.social;

public class User {
    public String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    String sharePost() {
        return socialPublisher.share();
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
