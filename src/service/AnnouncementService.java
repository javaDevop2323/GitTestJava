package service;


import models.Announcement;

import java.util.List;

public interface AnnouncementService {
    void saveAnnouncement(Long id, Announcement announcement);
    List<Announcement> getAllAnnouncement();
    Announcement getAnnouncementById(Long id);
    Announcement updateAnnouncement(Long id, Announcement announcement);
    String deleteAnnouncement(Long id);

}
