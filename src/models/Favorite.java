package models;

import java.util.ArrayList;
import java.util.List;

public class Favorite {
    private Long id;
    private User user;
    private List<Announcement> announcements = new ArrayList<>();

    public Favorite() {
    }

    public Favorite(Long id, User user, List<Announcement> announcements) {
        this.id = id;
        this.user = user;
        this.announcements = announcements;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;
    }
}
