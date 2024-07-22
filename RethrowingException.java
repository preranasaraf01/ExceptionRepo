package Exce;

public class RethrowingException {
    public static void methodA() throws Exception {
        throw new Exception("Original Exception in methodA");
    }

    public static void methodB() throws Exception {
        try {
            methodA();
        } catch (Exception e) {
            throw new Exception("Exception in methodB", e);
        }
    }

    public static void main(String[] args) {
        try {
            methodB();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
