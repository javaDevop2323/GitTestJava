package dao.daoImpl;

import dao.AnnouncementDao;
import db.AnnouncementId;
import db.DataBase;
import models.Announcement;
import models.Favorite;
import models.User;
import service.AnnouncementService;

import java.util.List;

public class AnnouncementDaoImpl implements AnnouncementDao {
    DataBase dataBase;
    @Override
    public void saveAnnouncement(Long userId,Announcement announcement){
        for (User user : DataBase.users){
            if(user.getId().equals(userId)){
                user.setId(announcement.getId());
            }
            System.out.println("add announcement");
        }
    }

    @Override
    public List<Announcement> getAllAnnouncement() {
        return DataBase.getAnnouncements();
    }

    @Override
    public Announcement getAnnouncementById(Long id) {
        for (Announcement announcement : DataBase.getAnnouncements()){
            if (announcement.getId().equals(id)){
                return announcement;
            }
        }
        return null;
    }

    @Override
    public Announcement updateAnnouncement(Long id, Announcement announcement) {
        for (Announcement announcement1 : DataBase.getAnnouncements()){
            if (announcement1.getId().equals(id)){
                announcement1.setDescription(announcement.getDescription());
                announcement1.setPrice(announcement.getPrice());
                return announcement1;
            }
        }
        return null;
    }

    @Override
    public String deleteAnnouncement(Long id) {
        for (Announcement announcement : DataBase.getAnnouncements()){
            if (announcement.getId().equals(id)){
                DataBase.getAnnouncements().remove(announcement);
                return "no success"+id;
            }
        }
        return "success";
    }
}
