

import java.util.Scanner;

public class HockeyPlayer{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Player :");
		String str = in.next();
		int player = maxRepeating(str);
		if(player>=7)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	static int maxRepeating(String str) 
    { 
        int len = str.length(); 
        int count = 0; 
  
        char res = str.charAt(0); 
        for (int i=0; i<len; i++) 
        {  
            int cur_count = 1; 
            for (int j=i+1; j<len; j++) 
            { 
                if (str.charAt(i) != str.charAt(j)) 
                    break; 
                cur_count++; 
            } 
  
            if (cur_count > count) 
            { 
                count = cur_count; 
           
                res = str.charAt(i); 
            } 
            
        } 
        return count; 
    } 

}
