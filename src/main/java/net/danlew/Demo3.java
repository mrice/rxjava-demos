/**
 * This was adopted from Dan Lew's "Grokking RxJava" series.
 * http://blog.danlew.net/
 *
 */
package net.danlew;

import rx.Observable;

public class Demo3 {
    public static void main(String... args) {
        Observable.just("Hello, World").subscribe(
            s -> System.out.println("Hello, world")
        );
    }
}
