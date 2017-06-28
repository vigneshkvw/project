/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author viki
 */
public class StringAlphabet {

    public static void main(String args[] ) throws Exception {
System.out.println("enter your string");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        for(int i=0;i<line.length();i++)
        {
         char ch = line.charAt(i);
         if(ch>='a' && ch<='z')
          System.out.print((char)(ch-32));
         else
          System.out.print((char)(ch+32));
        }
    }

}
///////