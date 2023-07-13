package Sort_List;

import java.util.Comparator;
import java.util.List;

public class Sort_List {

    //Implementing an Heapsort
    public static <T> void sort_List(List<T> list, Comparator<T> comparator){
        //Variables
        int child1;
        int child2;
        int head;
        int memory;

        //Part one: Create tree structure
        for(int i = 0; i < list.size(); i++){
            memory = i;
            head = get_Head(memory);
            while(memory != 0 && comparator.compare(list.get(head), list.get(memory)) <= 0){
                //System.out.println("Head: " + list.get(head) + ", Memory: " + list.get(memory));
                swap(list, memory, head);
                memory = head;
                head = get_Head(memory);
            }
        }

        //Part two, Shifting
        for(int i = list.size()-1; i > 0; i--){
            swap(list, 0, i);
            memory = 0;
            child1 = get_Child1(memory);
            child2 = get_Child2(memory);
            while(child1 < i){
                //System.out.println(String.format("Values: Head %s, Child1 %s, Child2 %s", list.get(memory), list.get(child1), list.get(child2)));
                //System.out.println(String.format("Indexes: Head %s, Child1 %s, Child2 %s", memory, child1, child2));
                if(!(child2 < i)){
                    //System.out.println("Test");
                    if(comparator.compare(list.get(memory), list.get(child1)) <= 0){
                        swap(list, child1, memory);
                        break;
                    } else{
                        break;
                    }
                } else{
                    if(comparator.compare(list.get(child1), list.get(child2)) <= 0){
                        //System.out.println("Child2 > Child1");
                        if(comparator.compare(list.get(memory), list.get(child2)) <= 0){
                            swap(list, child2, memory);
                            memory = child2;
                        } else{
                            break;
                        }
                    } else{
                        //System.out.println("Child1 > Child2");
                        if(comparator.compare(list.get(memory), list.get(child1)) <= 0){
                            swap(list, child1, memory);
                            memory = child1;
                        } else{
                            break;
                        }
                    }
                }
                child1 = get_Child1(memory);
                child2 = get_Child2(memory);
            }
        }
    }

    private static int get_Head(int nr){
        return (nr - 1) / 2;
    }

    private static int get_Child1(int nr){
        return (nr + 1) * 2 - 1;
    }

    private static int get_Child2(int nr){
        return (nr + 1) * 2;
    }

    private static <T> void swap(List<T> list, int o1, int o2){
        T memory = list.get(o1);
        list.set(o1, list.get(o2));
        list.set(o2, memory);
    }
}
