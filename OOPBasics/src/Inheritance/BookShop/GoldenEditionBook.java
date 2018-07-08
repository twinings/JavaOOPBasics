package Inheritance.BookShop;

public class GoldenEditionBook extends  Book{
    public GoldenEditionBook(String title, String author, Double price){
        super(title,author,price);
    }

    @Override
    protected void setPrice(Double price) {
        super.setPrice(price+ price*0.3);
    }
}
