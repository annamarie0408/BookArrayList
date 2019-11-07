//Anna Collins
//8/22/19
//Java Advanced Assignment 1
public class CollinsBook {

    private String publisher;
    private String title;
    private String ISBN;
    private String imageName;
    private Double price;

    public String getPublisher() {return publisher;}

    public void setPublisher(String publisher) {this.publisher = publisher; }

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getISBN() {return ISBN;}

    public void setISBN(String ISBN) {this.ISBN = ISBN;}

    public String getImageName() {return imageName;}

    public void setImageName(String imageName) {this.imageName = imageName;}

    public Double getPrice() {return price;}

    public void setPrice(String Double) { this.price = price;}

    public CollinsBook(String publisher, String title, String ISBN, String imageName, Double price) {
       this.publisher = publisher;
       this.title = title;
       this.ISBN = ISBN;
       this.imageName = imageName;
       this.price = price;
    }

    @Override
    public String toString() {
        return "Here are the books built inside of the class 'CollinsBooks': " +
                "publisher= " + publisher +
                ", title= " + title +
                ", ISBN= " + ISBN +
                ", imageName= " + imageName +
                ", price= " + price;

    }
}
