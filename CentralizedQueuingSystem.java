package SoftEng1_LabAss9_singletonPattern;
import java.util.LinkedList;
import java.util.Queue;

public class CentralizedQueuingSystem
{
    
    private static CentralizedQueuingSystem instance;
    private Queue<Integer> queue = new LinkedList<>();
    private int[] helpDeskStations = new int[3];

    
    public static synchronized CentralizedQueuingSystem getInstance()
    {
        if(instance == null)
            instance = new CentralizedQueuingSystem();
        return instance;
    }

    
    public synchronized void addQueue()
    {
        int qNumber = queue.size() + 1;
        queue.add(qNumber);
        System.out.println("\nA person has entered and has been assigned a Queue Number of " + qNumber);
    }

    
    public synchronized void displayQueue()
    {
        System.out.println("\n...Queue...");

        if (queue.isEmpty())
        {
            System.out.println(queue + "is empty.");
        }
        else
        {
            System.out.println(queue);
        }
    }

    
    public synchronized void helpDesk(int helpDeskStationNumber)
    {
        int qN = queue.poll();
        if (!queue.isEmpty())
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
        queue.clear();
        for (int a = 1; a <= newQueueNumber; a++)
        {
            queue.add(a);
        }
        System.out.println("\nThe queue number has been reset to " + queue);
    }
}
