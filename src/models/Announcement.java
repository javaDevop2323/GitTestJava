package models;

public class Announcement {
    private Long id;
    private String description;
    private double price;
    private String owner;

    public Announcement() {
    }

    public Announcement(Long id, String description, double price, String owner) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                '}';
    }
}
