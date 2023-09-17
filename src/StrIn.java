public class StrIn {
    void display (double a){
        System.out.println("Double");
    }

    void display (String b){
        System.out.println("String");
    }

    public static void main(String[] args) {
        StrIn var1 = new StrIn();
        var1.display("Nipuni");
        var1.display(25.23);
    }
}
