package com.dummy.lmd;

import java.util.function.Function;

/**
 * @Version 1.0
 * @ClassName LambdaTestMain
 * @Author duanshouzhi
 * @Date 2025/3/20 17:17
 * @Description TODO
 **/
public class LambdaTestMain {


    public static void main(String[] args) {

//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("name1",1));
//        personList.add(new Person("name2",2));
//        personList.add(new Person("name3",3));
//
//        List<String> list = personList.stream().map(Person::getName).toList();
//        System.out.println(String.join(",",list));
//
//        String str = "Hello";
//        Supplier<Integer> lengthGetter = str::length;
//        System.out.println(lengthGetter.get());


        Function<String,String>  f1 = x1 -> {
            System.out.println(1);
            return "1";
        };

        Function<String,String>  f2 = x2 -> {
            System.out.println(2);
            return "2";
        };

        Function<String,String>  f3 = x3 -> {
            System.out.println(3);
            return "3";
        };

        Function<String, String> stringStringFunction = f1.andThen(f2).andThen(f3);
        stringStringFunction.apply("hello");
    }



    static class Person{

        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }


}
