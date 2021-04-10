import java.util.*; 

public class stackAndQueue
{
    public static void main (String[] args)
    {
        Stack <Integer> x = new Stack <>();
        x.add(3); x.add(-10); x.add(-25); x.add(20); x.add(5); x.add(-15);
        splitStack(x);
        
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(2); q.add(3); q.add(10); q.add(15); q.add(20); q.add(33);
        rearrange(q);
    }

    public static void splitStack(Stack<Integer> s)
    {
        System.out.println("Stack: "+ s);
        Queue<Integer> x = new LinkedList <Integer>();
        int negNum = 0;
        while(!s.isEmpty())
        {
            if(s.peek() < 0)
            {
                negNum++;
            }
            x.add(s.pop());
        }
        while(negNum > 0)
        {
            if(x.peek() <0)
            {
                s.push(x.remove());
                negNum--;
            }
            else
            {
                x.add(x.remove());
            }
        }
        while(!x.isEmpty())
        {
            s.push(x.remove());
        }
        System.out.println("Split stack: " + s);
    }
    
    public static void rearrange(Queue<Integer> w)
    {
        System.out.println("Queue" + w);
        int a = w.size();
        Stack<Integer> z = new Stack<Integer>();
        Integer f;
        for(int i = 0; i< a; i++)
        {
            f= w.poll();
            if(f%2==0)
            {
                w.add(f);
            }
            else
            {
                z.push(f);
            }
        }
        while(z.size()>0)
        {
            w.add(z.pop());
        }
        System.out.println("Rearranged queue: "+ w);
    }
}
