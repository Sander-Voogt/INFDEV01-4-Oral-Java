package case3;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Widget> widgets = new ArrayList<Widget>();

        widgets.add(new Button());
        widgets.add(new Image(new Button(), "MyImage"));
        widgets.add(new Text(new Image(new Button(), "Another Image"), "MyText"));
        widgets.add(new Image(new Label(), "LabelImage"));

        for (Widget w : widgets) {
            w.draw();
        }

    }

}
