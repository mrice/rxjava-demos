/**
 * This was adopted from Dan Lew's "Grokking RxJava" series.
 * http://blog.danlew.net/
 *
 */
package net.danlew;

import rx.Observable;
import rx.Subscriber;

public class Demo1 {

    public static void main(String... args) {
        new Demo1().runDemo();
    }

    void runDemo() {
        Observable<String> myObservable = Observable.create(
            new Observable.OnSubscribe<String>() {
                @Override
                public void call(Subscriber<? super String> subscriber) {
                    subscriber.onNext("Hello, world");
                    subscriber.onCompleted();
                }
            }
        );

        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.toString());
            }

            @Override
            public void onNext(String s) {
                System.out.println(s);
            }
        };

        myObservable.subscribe(mySubscriber);

    }

}
