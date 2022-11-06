# Описание

## Домашнее задание по теме «Внедрение системы контроля версий»

<p>Ваш отдел решил автоматизировать часть задач из отдела продаж, и начать решили с написания простого инструмента анализа статистики продаж. Перед вами даже первая версия такого сервиса:<p>
<p>Вам доверили этот сервис “заверсионировать” - так программисты говорят, когда имеют ввиду создание репозитория и подключения его к проекту для контролирования его версий.<p>
1. С помощью метода max мы можем определить максимальное число продаж

``` java
    public class SalesManager {
    protected int[] sales;
        public SalesManager(int[] sales) {
        this.sales = sales;
    }
   public int max() {
       int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
```
```main
public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[] {1,3,8});
        System.out.println(salesManager.max());
    }
}
```