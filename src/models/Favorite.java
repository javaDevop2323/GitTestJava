package models;

import java.util.ArrayList;
import java.util.List;

public class Favorite {
    private Long id;
    private User userId;
    private List<Announcement> announcements = new ArrayList<>();

    public Favorite() {
    }

    public Favorite(Long id, User user, List<Announcement> announcements) {
        this.id = id;
        this.userId = user;
        this.announcements = announcements;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;
    }
}
