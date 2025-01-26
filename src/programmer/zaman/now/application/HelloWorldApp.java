package programmer.zaman.now.application;

import programmer.zaman.now.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        // ini merupakan anonymus class
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                // TODO Auto-generated method stub
                System.out.println("Hello ");
                
            }

            @Override
            public void sayHello(String name) {
                // TODO Auto-generated method stub
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void sayHello() {
                // TODO Auto-generated method stub
                System.out.println("Halo ");
                
            }

            @Override
            public void sayHello(String name) {
                // TODO Auto-generated method stub
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Hello ");

        indonesia.sayHello();
        indonesia.sayHello("Nama");
    }
}
