package Pr_23;

public class Test {
    public static void main(String[] args) {
        TablesOrderManager orderManager = new TablesOrderManager(10);
        Order[] orders = new Order[10];
        for (int i = 0; i < orders.length; i++)
            orders[i] = new Order();
        orders[3].add(new Dish(150,"Банановые панкейки", "Banana pancakes"));
        orders[3].add(new Dish(320,"Паста карбонара с курицей", "Pasta carbonara with chicken"));
        orders[1].add(new Dish(120, "Котлеты по-киевски", "Chicken Kiev"));
        orderManager.add(orders[3], 4);
        orderManager.add(orders[5], 2);
        orderManager.removeOrder(5);
        orderManager.add(orders[1],7);
        System.out.println(orderManager.ordersCostSummary()); //суммарная стоимость заказов
        System.out.println(orderManager.freeTableNumbers()); //номера пустых столов
        System.out.println(orderManager.freeTableNumber()); //количество пустых столов
    }
}
