package case3;

public class Image extends Decorator {

    private String image;

    public Image(Widget w, String i) {
        super(w);
        this.image = i;
    }

    @Override
    public void draw() {
//TODO missing line: 0.5 point
        System.out.println("- with an Image: " + this.image);
    }

}
