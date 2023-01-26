package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList= new ArrayList<>();
    public Forum() {
        usersList.add(new ForumUser(1,"Mieszko Pierwszy", 'm',150,1965,01,01));
        usersList.add(new ForumUser(2,"Bolesław Chrobry", 'm', 350, 1918, 02,03));
        usersList.add(new ForumUser(3, "Władysław Jagiełło",'m',321, 1965, 7,5));
        usersList.add(new ForumUser(4, "Stefan Batory", 'm',0,2004,5,30));
        usersList.add(new ForumUser(5, "Jan Karol Chodkiewicz", 'm',0, 1997,12,24));
        usersList.add(new ForumUser(6, "Stanisław Żółkiewski", 'm',0,2015,2,21));
        usersList.add(new ForumUser(7, "Stanisław Koniecpolski", 'm',235,2014,7,15));
        usersList.add(new ForumUser(8, "Tadeusz Rozwadowski", 'm', 5,2006,4,16));
        usersList.add(new ForumUser(9, "Sygryda Storrada",'f', 50,2005,5,12));
        usersList.add(new ForumUser(10, "Bona Sforzna",'f',9,1987,10,14));
        usersList.add(new ForumUser(11, "Jadwiga Andegaweńska",'f', 7,2000,9,13));
    }
    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}
