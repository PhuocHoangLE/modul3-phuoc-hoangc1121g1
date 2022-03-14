package model;

public class Product {
    private int id ;
    private String name ;
    private int price ;
    private String desciption ;
    private String producer ;

    public Product() {
    }

    public Product(int id, String name, int price, String desciption, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.desciption = desciption;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", desciption='" + desciption + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}