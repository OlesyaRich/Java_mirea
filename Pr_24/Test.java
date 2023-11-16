package Pr_24;

public class Test {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager(10);
        Order[] orders = new Order[10];
        for (int i = 0; i < orders.length; i++)
            orders[i] = new RestaurantOrder();
        orders[3].add(new Dish(150,"Банановые панкейки", "Banana pancakes"));
        orders[2].add(new Dish(320,"Паста карбонара с курицей", "Pasta carbonara with chicken"));
        orders[1].add(new Dish(120, "Котлеты по-киевски", "Chicken Kiev"));
        orders[4].add(new Drink(75,"Какао", "Cocoa"));
        orders[3].add(new Drink(40,"Чёрный чай", "Black tea"));

        orderManager.add(orders[3], 4);
        orderManager.add(orders[1], 2);
        orderManager.add(orders[4], 7);
        orderManager.add(orders[2], 3);

        orderManager.add("1", orders[3]);
        System.out.println(orderManager.getOrder("1").getItems());
        System.out.println(orderManager.freeTableNumbers());
    }
}
