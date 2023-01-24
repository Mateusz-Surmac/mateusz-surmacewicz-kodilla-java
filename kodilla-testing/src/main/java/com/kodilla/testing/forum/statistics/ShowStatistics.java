package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ShowStatistics implements Statistics {
    private int posts;
    private int comments;
    private int users = 0;

    public ShowStatistics(int posts, int comments, int users) {
        {
            this.posts = posts;
            this.comments = comments;
            this.users = users;
        }
    }
    private List<String> userList = new ArrayList<>();

    @Override
    public List<String> usersNames() {;
        return userList;
    }
    public void addUser(String user) {
        userList.add(user);
    }
    public int numberOfUsers() {
        int numberOfUsers = 0;
        for (String x : userList) {
            numberOfUsers++;
        }
        return numberOfUsers;
    }
    @Override
    public int postsCount() {
        return posts;
    }

    @Override
    public int commentsCount() {
        return comments;
    }
    public double averageNumberOfPostsPerUser() {
        double averageNumberOfPostsPerUser = postsCount() / numberOfUsers();
        return averageNumberOfPostsPerUser;
    }
    public double averageNumberOfCommentsPerUser() {
        double averageNumberOfCommentsPerUser = commentsCount() / numberOfUsers();
        return averageNumberOfCommentsPerUser;
    }
    public double averageNumbersOfPostsPerComments() {
        double averageNumbersOfPostsPerComments = postsCount() / commentsCount();
        return averageNumbersOfPostsPerComments;
    }


}
