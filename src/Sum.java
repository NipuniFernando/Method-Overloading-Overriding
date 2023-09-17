public class Sum {
    void sum(int a, long b){
        System.out.println(a+b);

    }

    void sum(int c, int d){
        System.out.println(c+d);

    }

    public static void main(String[] args) {
        Sum s1 = new Sum();
        s1.sum(12,123654789L);
        s1.sum(25, 85);
    }
}
