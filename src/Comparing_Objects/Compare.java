package Comparing_Objects;

class Object {
    String var;
    Object(String n) {
        setVar(n);
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

}



public class Compare {
    public static void main(String[] args){

        //Comparing two strings
        String Thing1 = "Blah";
        String Thing2 = "Blah";
        System.out.println(Thing1 == Thing2);
        //Outputs true

        //Comparing two strings when they are attributes of an object
        Object o1 = new Object("Blah");
        Object o2 = new Object("Blah");
        System.out.println(o1 == o2);
        //Outputs false
        //What happens here is that it tests the objects i.e. memory locations to see if those are the same rather than the contents of those
        System.out.println(o1.var == o2.var);
        //Outputs true

        System.out.println(o1.equals(o2));
    }
}
