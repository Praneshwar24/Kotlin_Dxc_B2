package lamdas;

public class Demo {
    public static void main(String[] args) {
        MyDrawable myDrawable = new MyDrawable();
        myDrawable.draw();
        Drawable d2 = ()-> {
            System.out.println("He is drawing a picture");
        };
    }
}
