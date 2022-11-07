import com.sun.source.util.SourcePositions;

public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{1, 3, 8, 100, 0});
        System.out.println(salesManager.max());
        System.out.println(salesManager.getAverageSale());
    }
}