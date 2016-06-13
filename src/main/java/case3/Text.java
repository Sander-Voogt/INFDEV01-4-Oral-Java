package case3;

public class Text extends Decorator {

    private String text;

    public Text(Widget w, String t) {
        super(w);
        this.text = t;
    }

    @Override
    public void draw() {
//TODO missing line: 0.5 point
        System.out.println("- with a Text: " + this.text);
    }
}
