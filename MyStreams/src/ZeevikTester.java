public class ZeevikTester {

    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);//מקבל הודעה עמ להכניס ללמדה אקספרשיין
    }

    public static void main(String[] args) {


        ZeevikTester tester = new ZeevikTester();

        //with type declaration
        MathOperation addition = (int a,int b)->a+b;

        //without type declartion
        MathOperation subtraction = (a,b)->a-b;

        //with return statement and curly braces
        MathOperation multiplication = (int a, int b)->{return a*b;};

        //without return, braces and type
        MathOperation division = (a,b)->a/b;

        System.out.println("10 + 5 = "+tester.operate(10,5,addition));
        System.out.println("10 - 5 = "+tester.operate(10,5,subtraction));
        System.out.println("10 * 5 = "+tester.operate(10,5,multiplication));
        System.out.println("10 / 5 = "+tester.operate(10,5,division));

        //without parenthesis
        GreetingService greatService1 = message -> System.out.println("Hello "+message);

        //with parenthesis
        GreetingService greetService2 = (message)->{
            System.out.println("Hello " + message);
        };

        //with parenthesis
        GreetingService greetService3 = (message)->{
            if (message.isEmpty()){
                System.out.println("You didn't wrote anyting");
            } else {
                System.out.println("Hello " + message);
            }
            System.out.println("elad has left the building");
            System.out.println(10*50/2);
        };

        greatService1.sayMessage("my brother from another mother");
        greetService2.sayMessage("נשמע מה ? ");
        greetService3.sayMessage("");
    }



    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }


}
