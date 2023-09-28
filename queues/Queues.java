package queues;
import java.util.*;
//Queues foloows FIFO proincipal exampl- queue of movies ticket
//insertion--from end-->EnQueue
//deletion -- from begning-->Dequeue
//Queus is not a class its a interface 


// when we use stacks and ques when we need to store our answer for future 
// we mostly use stacks and ques in tree graphs traversal 


public class Queues {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();// we used ll beause its interface
        que.add(31);
        que.add(39);
        que.add(33);
        que.add(3);
        que.add(8);
        que.add(4);
        que.add(2);

        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());

        
    }
}
