/**
 * This was adopted from Dan Lew's "Grokking RxJava" series.
 * http://blog.danlew.net/
 *
 */
package net.danlew;

import rx.Observable;
import rx.functions.Action1;

public class Demo2 {
    public static void main(String... args) {
        new Demo2().sayHelloJustOnce();
    }

    void sayHelloJustOnce() {
        Observable<String> myObservable = Observable.just("Hello, world");
        Action1<String> subscriber = new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        };
        myObservable.subscribe(subscriber);
    }

}
