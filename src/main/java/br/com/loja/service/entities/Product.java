package br.com.loja.service.entities;

public class Product {
    private int id;
    private int quantity;
    private double price;
    private String name;
    private String description;
    private String category;

    public Product() {

    }

    public String toString() {
        return " Id: " + this.getId()
                + "\n Name: " + this.getName()
                + "\n Preço: " + this.getPrice()
                + "\n Descrição: " + this.getDescription()
                + "\n Categoria: " + this.getCategory()
                + "\n Quantidade: " + this.getQuantity();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
