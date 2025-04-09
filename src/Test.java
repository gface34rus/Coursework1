public class Test {
    public static void changeValue(Integer[] value) {
        value[0]= 99;
    }

    public static void main(String[] args) {
        Integer[] value = {1, 2};
        changeValue(value);
        System.out.println(value[0]);

    }
}
