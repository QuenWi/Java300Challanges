package Range_Sum_Query_Mutable;

public class Range_Sum_Query_Mutable {

    //makes a container type
    public void range_Sum_Query_Mutable(){
        Dictonary dictonary = new Dictonary(1, 10);
        dictonary.setValue(1, 'a');
        dictonary.setValue(4, 'd');
        dictonary.setValue(7, 'g');
        dictonary.setValue(10, 'i');

        System.out.println("Position 1: " + dictonary.getValue(1));
        System.out.println("Position 7: " + dictonary.getValue(7));
        System.out.println("Position 10: " + dictonary.getValue(10));
        System.out.println("Position 9: " + dictonary.getValue(9));
    }

    private class Dictonary{
        char element;
        int bottom;
        int top;
        Dictonary lowerSub;
        Dictonary upperSub;
        boolean leave;

        public Dictonary(int bottom, int top) {
            this.bottom = bottom;
            this.top = top;
            if(bottom == top){
                leave = true;
            } else{
                leave = false;
                lowerSub = new Dictonary(bottom, (bottom+top)/2);
                upperSub = new Dictonary((bottom+top)/2+1, top);
            }
        }

        public void setValue(int index, char element){
            if(leave){
                this.element = element;
            } else{
                if(index >= (bottom+top)/2+1){
                    upperSub.setValue(index, element);
                } else{
                    lowerSub.setValue(index, element);
                }
            }
        }

        public char getValue(int index){
            if(leave){
                return element;
            } else{
                if(index >= (bottom+top)/2+1){
                    return upperSub.getValue(index);
                } else{
                    return lowerSub.getValue(index);
                }
            }
        }
    }


}
