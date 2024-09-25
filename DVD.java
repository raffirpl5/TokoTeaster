package Toko;


public class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

    public DVD() {
        super();
        length = 300;
        rating = "PG";
        studio = "NewLine Cinema";
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void print() {
        super.print();
        System.out.println("Length: " + this.length);
        System.out.println("Rating: " + this.rating);
        System.out.println("Studio: " + this.studio);
    }
}