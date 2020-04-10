package br.com.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("D");
        queue.add("A");
        queue.add("B");
        System.out.println(queue);
        System.out.println("peek:" + queue.peek());
        System.out.println("size:" + queue.size());
        System.out.println("pool: " + queue.poll());
        System.out.println(queue);
    }
}
