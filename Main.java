package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	ArrayList<Integer>l=new ArrayList<>();

	for(int i=0;i<n;i++)
	{
        l.add(s.nextInt());

    }
	int round=0;
	while(true)
    {
        int c=0;
        for( int i = 1; i<l.size();i++)
        {
            if(l.get(i)<l.get(i-1))
            {
                c++;
            }
        }
        if(c==0)
        {
            break;
        }
        else
        {
            for(int j=1;j<l.size();j++)
            {
                if(l.get(j)<l.get(j-1))
                    l.remove(j);

            }
        }
        round++;
    }
	System.out.println(round-1+" rounds "+ "final array" +l);

    }


    }

