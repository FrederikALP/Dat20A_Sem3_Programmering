import java.util.ArrayList;
import java.util.List;

public class Systemos {
    public static class out {

        public static void println(String content) {
            System.out.println(content);
        }

        public static void println(int content) {
            System.out.println(content);
        }

        public static void println(double content) {
            System.out.println(content);
        }
        public static void println(boolean content) {
            System.out.println(content);
        }
        public static void println(short content) {
            System.out.println(content);
        }
        public static void println(long content) {
            System.out.println(content);
        }
        public static void println(char content) {
            System.out.println(content);
        }
        public static void println(byte content) {
            System.out.println(content);
        }
        public static void println(float content) {
            System.out.println(content);
        }

        public static void println(Object content) {
            System.out.println(content);
        }
        public static void println(Object[] content) {
            for(Object a : content){
                System.out.print(a + " ");
            }
        }
        public static void println(List<Object> content) {
            for(Object object : content) {
                System.out.print(object);
            }
        }
    }
}
