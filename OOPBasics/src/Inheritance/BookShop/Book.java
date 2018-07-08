package Inheritance.BookShop;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book( String author,String title, double price) {

this.setAuthor(author);
        this.setTitle(title);
this.setPrice(price);
    }

    private void setAuthor(String author) {
        String[] authorArgs = author.split(" ");
        if (authorArgs.length > 1 && Character.isDigit(authorArgs[1].charAt(0))) {
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }

    protected void setPrice(Double price) {
        if (price < 1) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    private void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }

    private Double getPrice() {
        return price;
    }

    private String getAuthor() {
        return author;
    }

    private String getTitle() {
        return title;
    }
}
