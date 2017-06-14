package Anon_Classes;

public class Machine {
    public void start() {
        System.out.println("Starting");
    }
}

class things {
    public static void main(String[] args) {
        //Declare an object of the class Machine but override the start method
        Machine m = new Machine() {
            @Override
            public void start() {
                System.out.println("Clunk");
            }
        };  //notice semicolon
        m.start();
    }
}
