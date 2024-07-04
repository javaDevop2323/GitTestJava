package dao;

import models.Announcement;
import service.AnnouncementService;

import java.util.List;

public interface AnnouncementDao {
    void saveAnnouncement(Long id, Announcement announcement );
    List<Announcement> getAllAnnouncement();
    Announcement getAnnouncementById(Long id);
    Announcement updateAnnouncement(Long id, Announcement announcement);
    String deleteAnnouncement(Long id);
}