package case2;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Widget> widgets = new ArrayList<Widget>();

        widgets.add(new Button());
        widgets.add(new Button());

        widgets.add(new Label("label text"));

        WidgetVisitor dv = new TypePrettyPrinter();

        for (Widget w : widgets) {
            w.visit(dv);
        }

    }

}
