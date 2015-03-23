package Strings;
import java.util.*;
import java.io.*;
public class StringTokenizer {
public StringTokenizer(String string) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args)
{
	
	StringTokenizer st = new StringTokenizer("this is a test");
    while (st.hasMoreTokens()) {
        System.out.println(st.nextToken());
    }
}
}