package java8.streams.terminate.foreach;

import java8.streams.initiation.StreamFromIterable;

import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        StreamFromIterable si = new StreamFromIterable();

        si.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
