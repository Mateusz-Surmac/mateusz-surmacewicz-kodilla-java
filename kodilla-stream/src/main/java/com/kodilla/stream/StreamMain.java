package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForumUserList = new Forum();
        Map<Integer, ForumUser> theForumUsersList = theForumUserList.getUsersList().stream()
                .filter(sex -> sex.getSex() == 'm')
                .filter(year -> year.getBrithYear() >= 2003)
                .filter(posts -> posts.getPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId,x -> x));

        theForumUsersList.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);
    }
}