package service.serviceImpl;

import dao.AnnouncementDao;
import dao.daoImpl.AnnouncementDaoImpl;
import models.Announcement;
import service.AnnouncementService;

import java.util.List;

public class AnnouncementServiceImpl implements AnnouncementService {
    AnnouncementDao announcementDao = new AnnouncementDaoImpl();
    @Override
    public void saveAnnouncement(Long id, Announcement announcement) {
        announcementDao.saveAnnouncement(id, announcement);
    }

    @Override
    public List<Announcement> getAllAnnouncement() {
        return announcementDao.getAllAnnouncement();
    }

    @Override
    public Announcement getAnnouncementById(Long id) {
        return announcementDao.getAnnouncementById(id);
    }

    @Override
    public Announcement updateAnnouncement(Long id, Announcement announcement) {
        return announcementDao.updateAnnouncement(id, announcement);
    }

    @Override
    public String deleteAnnouncement(Long id) {
        return announcementDao.deleteAnnouncement(id);
    }
}
