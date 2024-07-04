package db;

public class AnnouncementId {
    public static Long id = 0L;
    public static long genAnnouncementId(){
        return ++id;
    }

}
