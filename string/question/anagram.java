// Anagram are the set fo character of two string where all the elmenet of 1st match the element of second string ,order doesnot matter "aab" == "baa"

// we can solve this with two logic 
// 1.sort both string and Compare them
// 2.by counting frequency




package string.question;

import java .util.*;
public class anagram {
    public static void main(String[] args) {
        String str1="aab";
        String str2="bba";
        System.out.println(isAnagram1(str1,str2));//logic behind this is take a sample array count of 256 and put charAt str1 for every elemet as 1 and then decremnt it if same charAt match with str2 ,at end if array all element are 0 the is anagram 
                                                //OR
        System.out.println(isAnagram2(str1,str2)); //So count the frequency of the characters and if the frequency of characters in both strings are the same, they are anagram of each other.
                                                //OR
        System.out.println(isAnagram3(str1,str2));//Sort the two given strings and compare, if they are equal then they are anagram of each other.

    }

    private static boolean isAnagram3(String str1, String str2) {
        char strr1[] = str1.toCharArray();
        char strr2[] = str2.toCharArray();

        Arrays.sort(strr1);
        Arrays.sort(strr2);
        
         int n1= strr1.length;
         int n2= strr1.length;

         if(n1!= n2){
            return false;
         }

         for (int i = 0; i < strr1.length; i++) {
            if(strr1[i] != strr2[i]){
                return false;
            }
         }
         return true;
    }

    private static boolean isAnagram1(String str1, String str2) {
        int count[] = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram2(String str1, String str2){
        char st1[] = str1.toCharArray();
        char st2[] = str2.toCharArray();
        int no_of_char = 256;
        
        int count1[] = new int[no_of_char];
        Arrays.fill(count1,0);

        int count2[] = new int[no_of_char];
        Arrays.fill(count2,0);

        for (int i = 0; i < st1.length; i++) {
            count1[st1[i]]++;
        }
         for (int i = 0; i < st2.length; i++) {
            count2[st2[i]]++;
        }

        if(st1.length != st2.length){
            return false;
        }

        for (int i = 0; i < no_of_char; i++) {
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;




    }
}
