public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[] {1,3,8});
        System.out.println(salesManager.max());
    }
}