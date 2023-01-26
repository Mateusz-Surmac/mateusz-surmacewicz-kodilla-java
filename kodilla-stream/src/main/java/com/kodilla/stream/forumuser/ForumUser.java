package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int posts;

    public ForumUser(int id, String userName, char sex, int posts, int year, int month, int day) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.posts = posts;
        this.birthDate = LocalDate.of(year,month,day);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", posts=" + posts +
                ", birthDate=" + birthDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPosts() {
        return posts;
    }
    public int getBrithYear() {
        return birthDate.getYear();
    }
}
