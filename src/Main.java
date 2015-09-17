import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {


//        Arrays.asList("One", "Two", "Three", "Four", "Five").stream()
//                .filter(s -> s.length() > 3)
//                .map(String::length)
//                .forEach(System.out::println);



//        Arrays.asList("One", "Two", "Three", "Four", "Five").forEach();



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

//        OneParamFuncInterface<Integer, String> instance = Main::getLength;
//
//
//        instance.doSmth("sddd");
//
//
//        String str = "sd";
//        str.join(null);


//        Stream<Integer> ss = Arrays.asList(12, -2, 34, 4, 15).stream();

//        System.out.println(Arrays.toString(ss.sorted().toArray()));



//        List<String> first = Arrays.asList("X", "Y", "Z");
//        List<String> second = Arrays.asList("1", "2", "3", "4");

//        List<List<String>> result = new ArrayList<>();
//        for (String f : first) {
//            for (String s : second) {
//                result.add(Arrays.asList(f, s));
//            }
//        }


//        List<String> sss = first.stream().flatMap(
//                fst -> second.stream().map(getStringStringFunction(fst))
//        )
//                .collect(Collectors.toList());
//
//
//        System.out.println(sss);



//        List<List<String>> result = first.stream().flatMap(fst -> second.stream().map(snd -> Arrays.asList(fst, snd)))
//                .collect(Collectors.toList());
//
//
//        result.forEach(System.out::println);


//        String str = null;
//        String str2 = null;
//        Optional<String> opt = Optional.ofNullable(str);
//        System.out.println(opt.orElse("unknown"));
//        System.out.println(opt.isPresent());
//
//        String res;
//
//        res = Optional.ofNullable(str).orElse(Optional.ofNullable(str2).orElse("unknown"));
//
//
//
//        if (str == null) {
//            if (str2 == null) {
//                res = "unknown";
//            } else {
//                res = str2;
//            }
//        } else {
//            res = str;
//        }
//
//        res = str == null ? str2 == null ? "unknown" : str2 : str;







//        Arrays.asList("ONE", "TWO", "Three", "Five").stream().filter(((Predicate<String>) s -> false).or(null));

//        final String s1 = "s";

//        OneParamFuncInterface<Integer, String> oi =  Main::getLength;



        Optional<Integer> min = Arrays.asList(6, 4, 6, 144, -23, 33, 56, -37, 76, 233).stream()
                .filter(x -> x > 300)
                .min(Integer::compare);

    }

    private static Function<String, String> getStringStringFunction(String fst) {
        return s -> "" + fst + s;
    }

    static Integer getLength(String str) {
        return str.length();
    }





}