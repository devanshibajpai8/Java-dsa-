public class huffman {
    class node
    {
        int freq;
        String data;
        node left;
        node right;

        public node(String ele,int val)
        {
            freq=val;
            data=ele;
            left=null;
            right=null;
        }

    public void setright(node n)
    {
        right=n;
    }

    public void setleft(node n)
    {
        left=n;
    }

    public node getleft()
    {
        return left;
    }

    public node getright()
    {
        return right;
    }

    int left(int i)
    {
        return 2*i;
    }

    int right(int i)
    {
        return 2*i+1;
    }

    public String getdata()
    {
        return data;
    }

    public int getfreq()
    {
        return freq;
    }

    public void huffman(String c,int val)
    {
        int n=c.length();
        int x,y;
        String Q=c;
        for(int i=0;i<n;i++)
        {
            node z=new node(c,val);
            z.left(i);
            z.right(i);

        }
    }
}
    public static void main(String[] args)
    {

    }
}
