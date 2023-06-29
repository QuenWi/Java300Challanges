package First_Bad_Version;

public class Test_First_Bad_Version {

    public static void main(String[] args) {
        Version[] array = new Version[500];
        for(int i = 0; i < array.length; i++){
            if(i < 467){
                array[i] = new Version(false);
            } else{
                array[i] = new Version(true);
            }
        }
        test(array);
    }

    private static void test(Version[] array){
        Integer result = First_Bad_Version.first_Bad_Version(array);
        System.out.println("Result: " + result.toString());
    }
}
