import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


        Arrays.asList("One", "Two", "Three", "Four", "Five").stream()
                .filter(s -> s.length() > 3)
                .map(String::length)
                .forEach(System.out::println);





        Arrays.asList("One", "Two", "Three", "Four", "Five").stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() > 3;
                    }
                })
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return s.length();
                    }
                })
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer i) {
                        System.out.println(i);
                    }
                });


//        MyFuncInterface<String, Integer, Double> instance = new MyFuncInterface<String, Integer, Double>() {
//            @Override
//            public String doSmth(Integer i, Double d) {
//                System.out.printf("i = " + i);
//                System.out.printf("d = " + d);
//                //some other logic
//                return i.toString() + '+' + d + '=' + (i + d);
//            }
//        };

//        instance.doSmth(1, 1.34);

        OneParamFuncInterface<Integer, String> instance = new OneParamFuncInterface<Integer, String>() {
            @Override
            public Integer doSmth(String s) {
                return s.length();
            }
        };


        instance.doSmth("sddd");
    }

}
