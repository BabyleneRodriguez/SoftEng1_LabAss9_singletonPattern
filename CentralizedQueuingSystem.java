package SoftEng1_LabAss9_singletonPattern;
import java.util.LinkedList;
import java.util.Queue;

public class CentralizedQueuingSystem
{
    private Queue<Integer> Queue = new LinkedList<>();
    private int[] helpDeskStations = new int[3];

    public synchronized void addEnqueue()
    {
        int qNumber = Queue.size() + 1;
        Queue.add(qNumber);
        System.out.println("\nA person has entered and has been assigned a Queue Number of " + qNumber);
    }
    public synchronized void displayQueue()
    {
        System.out.println("\n...Queue...");

        if (Queue.isEmpty())
        {
            System.out.println(Queue + "is empty.");
        }
        else
        {
            System.out.println(Queue);
        }
    }
    public synchronized void helpDesk(int helpDeskStationNumber)
    {
        int qN = Queue.poll();
        if (!Queue.isEmpty())
        {
            helpDeskStations[helpDeskStationNumber - 1] = qN;
            System.out.println("\nHelp Desk Station " + helpDeskStationNumber);
            System.out.println("\nThere is still someone who is currently inquiring at the helpdesk.");
            System.out.println("\nIn Progress...\n" + "[" + qN + "]");
        }
        else
        {
            System.out.println("The queue is currently empty, which means there are no customers to be served at the moment.");
        }

    }
    public synchronized void resetQueue(int newQueueNumber)
    {
        Queue.clear();
        for (int a = 1; a <= newQueueNumber; a++)
        {
            Queue.add(a);
        }
        System.out.println("\nThe queue number has been reset to " + Queue);
    }
}
