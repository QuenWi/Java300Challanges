package Sort_Colors;

import java.util.Comparator;

public enum Color {
    RED, BLUE, GREEN, WHITE, BLACK;

    @Override
    public String toString(){
        if(this.ordinal() == 0){
            return "RED";
        }
        if(this.ordinal() == 1){
            return "BLUE";
        }
        if(this.ordinal() == 2){
            return "GREEN";
        }
        if(this.ordinal() == 3){
            return "WHITE";
        }
        if(this.ordinal() == 4){
            return "BLACK";
        }
        return "";
    }

    public static int compare(Color o1, Color o2) {
        return Integer.compare(o1.ordinal(), o2.ordinal());
    }
}
