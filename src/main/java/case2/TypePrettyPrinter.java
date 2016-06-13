package case2;

public class TypePrettyPrinter implements WidgetVisitor {

    public void onLabel(Label e) {
        System.out.println("I am a Label: " + e.text);
    }

    public void onButton(Button e) {
        System.out.println("I am a Button");
    }

}
