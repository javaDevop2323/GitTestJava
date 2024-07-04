package db;

import models.Announcement;
import models.User;

import java.util.ArrayList;
import java.util.List;
public class DataBase {

    public static List<User>users = new ArrayList<>();
    public static List<Announcement> announcements = new ArrayList<>();

    public static List<Announcement> getAnnouncements() {
        return announcements;
    }

    public static void setAnnouncements(List<Announcement> announcements) {
        DataBase.announcements = announcements;
    }
}
