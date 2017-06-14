package Nested_Classes;



    class Robot {
        int id;
        Robot(int i) {
            id = i;
            Brain b = new Brain();
            b.think();
        }
        //nested class
        private class Brain {
            public void think() {
                System.out.println(id + " is thinking");
            }
        }
    }

class runRobot {
    public static void main (String[] args) {
        Robot R1 = new Robot(12);
    }
}