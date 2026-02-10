////Functional interfaces practice
//
//@FunctionalInterface
//interface A {
//    void show();
//}
//
//public class interfaces { // Must match filename interfaces.java
//    public static void main(String[] args) {
//        A obj = () -> System.out.println("in show"); // Capital S in System
//        obj.show();
//    }
//}
//// problem 2 (using throw keyword)
//public class interfaces{
//    public static void main(String args[]){
//        int i=20;
//        int j=0;
//        try {
//            j=18/i;
//            if(j==0){
//                throw new ArithmeticException();
//            }
//        }catch(ArithmeticException e){
//            j=18/i;
//            System.out.println("this is the default output");
//        }
//    }
//}
//
//
////divide by zero error
//
//public class interfaces{
//    public static void main(String args[]){
//        int numerator =50;
//        int denominator=0;
//
//        try{
//            int result = numerator/denominator;
//        }catch(Exception e){
//
//            System.out.println("an exception occured"+e);
//        }finally{
//            System.out.println("out of the exception resuming normally!");
//        }
//    }
//        }
//
//
// class AgeInvalidation extends Exception {
//    public AgeInvalidation(String message) {
//        super(message);
//    }
//}
//
//    public class interfaces{
//        public static void checkage(int age) throws AgeInvalidation{
//            if (age<18){
//                throw new AgeInvalidation("Age is less than needed, access denied");
//            }else{
//                System.out.println("Access granted!");
//            }
//        }
//        public static void main(String args[]){
//
//            try{
//                checkage(16);
//            }catch(AgeInvalidation e){
//                System.out.println("exception caught"+e.getMessage());
//            }
//        }
//    }
//
////race conditions
//public class interfaces{
//    private int counter=0;
//    public void increment(){
//        counter++;
//    }
//    public static void main(String args[]) throws InterruptedException{
//        interfaces demo = new interfaces();
//
//        Thread t1= new Thread(()->{
//            for(int i=0;i<1000;i++) demo.increment();
//        });
//
//        Thread t2 = new Thread(()->{
//            for(int i=0;i<1000;i++) demo.increment();
//        });
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println(demo.counter);
//    }
//}
