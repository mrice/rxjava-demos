/**
 * This was copied from the RxJava site under fair use. Ask me why: I'm a lawyer.
 *
 */
package com.michaelrice;

import rx.Observable;
import rx.functions.Action1;

public class SayHello {

    public static void main(String... args) {
        SayHello demo = new SayHello();
        demo.sayHello("spouse", "spouse", "kid-1", "kid-2", "kid-3");
    }

    void sayHello(String... names) {
        Observable.from(names).subscribe(new Action1<String>() {
            @Override
            public void call(String name) {
                System.out.println(String.format("Hello, %s", name));
            }
        });
    }

}
