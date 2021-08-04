package exception;

public class ThrowEx1 {
    public static void main(String[] args) {
        Exception e = new Exception("내가 임의로 발생했어");
        try {
            throw e;
        } catch (Exception ex) {
           // ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
