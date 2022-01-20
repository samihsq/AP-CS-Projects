package TeddyBearInventory;

/**
 * TeddyBearInventory.java - Lab for 5.19 (Lab #9)
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 *
 */

public class TeddyBearInventory {
    // created 4 private instance variables
    private String size;
    private int count;
    private double cost;
    private double price;

    // created 3 private instance variables
    private static int totalCount;
    private static double totalCost;
    private static double totalProfit;


    // constructor #1, only parameter is size
    public TeddyBearInventory(String size) {
        this.size = size;
        count = 0;
        cost = 0;
        price = 0;
    }

    // constructor #2, 4 params for all priv instance variables
    public TeddyBearInventory(String size, int count, double cost, double price) {
        this.size = size;
        this.count = count;
        this.cost = cost;
        this.price = price;

        totalCount += count;
        totalCost += (cost * count);

    }

    // setter and getter for all variables
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        TeddyBearInventory.totalCount = totalCount;
    }

    public static double getTotalCost() {
        return totalCost;
    }

    public static void setTotalCost(int totalCost) {
        TeddyBearInventory.totalCost = totalCost;
    }

    public static double getTotalProfit() {
        return totalProfit;
    }

    public static void setTotalProfit(int totalProfit) {
        TeddyBearInventory.totalProfit = totalProfit;
    }

    // addBear() method adds to count of object, totalCount, and totalCost (calculated by multiplying the count by the cost)
    public void addBear(int count) {
        this.count += count;
        totalCount += count;
        totalCost += (count * cost);
    }

    // sellBear() method checks to see if count specified is smaller than the current count (if false then returns false)
    public boolean sellBear(int count) {
        if (count > this.count) {
            return false;
        }
        else {
            // if that is true, totalProfit increases by the price of all of these
            totalProfit += (count * (price));
            // count and totalCount get de-incremented by specified count that is sold
            this.count -= count;
            totalCount -= count;
        }
        return true;
    }

    // toString() returns all the private instance variables
    public String toString() {
        return count + " " + size + " teddy bears. Cost: $" + cost + ". Price: $" + price + ".";
    }





}
