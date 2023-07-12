package Data_Stream_as_Disjoint_Intervals;

public class Test_Data_Stream_as_Disjoint_Intervals {

    public static void main(String[] args) {
        Data_Stream_as_Disjoint_Intervals data_stream_as_disjoint_intervals = new Data_Stream_as_Disjoint_Intervals();
        test(data_stream_as_disjoint_intervals,1);
        test(data_stream_as_disjoint_intervals,4);
        test(data_stream_as_disjoint_intervals,5);
        test(data_stream_as_disjoint_intervals,8);
        test(data_stream_as_disjoint_intervals,2);
        test(data_stream_as_disjoint_intervals,3);
        test(data_stream_as_disjoint_intervals,9);
        test(data_stream_as_disjoint_intervals,7);
        test(data_stream_as_disjoint_intervals,6);
    }

    private static void test(Data_Stream_as_Disjoint_Intervals data_stream_as_disjoint_intervals, Integer add){
        System.out.println("Given: " + data_stream_as_disjoint_intervals + ", add " + add);
        data_stream_as_disjoint_intervals.add(add);
        System.out.println("Result: " + data_stream_as_disjoint_intervals);
    }
}
