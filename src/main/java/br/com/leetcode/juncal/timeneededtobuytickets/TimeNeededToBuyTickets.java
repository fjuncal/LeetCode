package main.java.br.com.leetcode.juncal.timeneededtobuytickets;

public class TimeNeededToBuyTickets {
    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{2,3,2}, 2));
        System.out.println(timeRequiredToBuy(new int[]{5,1,1,1}, 0));
        System.out.println(timeRequiredToBuy(new int[]{84,49,5,24,70,77,87,8}, 3));
    }

    private static int timeRequiredToBuy(int[] tickets, int k) {
        int ticketsSize = tickets.length;
        int timer = 0;

        for (int i = 0; i < ticketsSize; i++){
            if (tickets[k] == 0){
                return timer;
            } else if (tickets[i] != 0){
                tickets[i]--;
                timer++;
            }
            if (i == ticketsSize -1 ){
                i = -1;
            }
        }
        return timer;
    }
}
