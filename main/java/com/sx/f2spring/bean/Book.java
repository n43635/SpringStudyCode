package com.sx.f2spring.bean;

/**
 * Book的bean
 */
public class Book {

    private Integer id;
    private String title;
    private String author;
    private double price;
    private Integer sales;

//    public Book() {
//        System.out.println("Book对象被创建");
//    }

    public Book(Integer id, String title, String author, double price, Integer sales) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }
}
