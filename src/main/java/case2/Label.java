package case2;

public class Label implements Widget {

    int x;
    int y;
    String text;

    public Label(String text) {
        this.text = text;
    }

    @Override
    public void visit(WidgetVisitor visitor) {
//TODO missing line: 1 point
    }

}
