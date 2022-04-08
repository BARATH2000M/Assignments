package com.practicejava;


import java.util.Arrays;
        import java.util.List;
        import java.util.function.Consumer;

public class  Assignment8Q5{
    public static String processWords(List<String> list) {
        StringBuilder result = new StringBuilder("");
        for(String e :list) {
            StringBuilder sb = new StringBuilder(e);
            result.append(sb.charAt(0));
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("barath", "ari", "vijay", "delta", "echo", "foxtrot");
        Consumer<String> Result = (input) -> {System.out.println(processWords(list));};
        Result.accept("Execute");


    }
}