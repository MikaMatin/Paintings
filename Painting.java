/**
 * Created by MikaMatin on 11/8/16.
 */
public class Painting {

    protected String title;
    protected String artist;
    protected double price;

    public Painting(String t, String a) {
        title = t;
        artist = a;
        price = 400;


    }
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Artist: " +artist);
        System.out.println("Price: "+price);

    }



}