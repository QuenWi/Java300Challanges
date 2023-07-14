package Sort_Colors;

import java.util.Comparator;
import java.util.List;

public class Sort_Colors {

    //Sorting Colors. For testing purposes I created a color class and more.
    public static void sort_Colors(List<Colored_Object> list){
        list.sort(new Comparator<Colored_Object>() {
            @Override
            public int compare(Colored_Object o1, Colored_Object o2) {
                return Color.compare(o1.color, o2.color);
            }
        });
    }
}
