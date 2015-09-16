import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Arrays.asList("One", "Two", "Three", "Four", "Five").stream()
                .filter(s -> s.length() > 3)
                .map(String::length)
                .forEach(System.out::println);





//        Arrays.asList("One", "Two", "Three", "Four", "Five").stream()
//                .filter(new Predicate<String>() {
//                    @Override
//                    public boolean test(String s) {
//                        return s.length() > 3;
//                    }
//                })
//                .map(new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return s.length();
//                    }
//                })
//                .forEach(new Consumer<Integer>() {
//                    @Override
//                    public void accept(Integer i) {
//                        System.out.println(i);
//                    }
//                });
    }
}
