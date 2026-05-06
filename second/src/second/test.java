package second;

public class test {
/*
 * // 1. Write a program to print the reverse of the String? 
//  Ex: Nacre   Output: ercaN

class Revstring_1 {
    public static void main(String args[]){
        //Ex: Nacre   Output: ercaN
        String s="Nacre";
        StringBuilder sb=new StringBuilder(s);
      String rev=  sb.reverse().toString();
      System.out.println(rev);
    }
}

// 2. Write a program to print First non-repeated character from given String? 
// Ex: Software Services  Output: o 


class Nonrepeatedchar_2 {
    public static void main(String args[]){
        String s="Software Services";
        for(int i=0;i<s.length();i++){
            int count=0;
            if(s.charAt(i)!=' '){
                 for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                System.out.println("The first non repeating Character is "+s.charAt(i));
                break;
            }
            }
        }
    }
}

//  3. Write a program to print last non-repeated character from given String? 
//  Ex: Software Services  Output: c 


class Lastnonrepeatedchar_3 {
    public static void main(String args[]){
        String s="Software Services";
      
        s=s.toLowerCase();
        for(int i=s.length()-1;i>=0;i--){
            int count=0;
            if(s.charAt(i)!=' '){
                for(int j=i-1;j>=0;j--){
                    if(s.charAt(i)==s.charAt(j)){
                        count++;
                        break;
                    }
                }
            }
            if(count==0){
                    System.out.println("The Last non repeating character is "+s.charAt(i));
                    break;
                }
        }
    }
}


//  4.Write a program to remove the duplicate characters from the given String? 
//  Ex: banaans   Output: bans 
// first one fills good


import java.util.*;
class Removeduplicatefromstring_4 {
    public static void main(String args[]){
        String s="banaans";
        ArrayList <Character> list=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            if(!list.contains(s.charAt(i))){
            list.add(s.charAt(i));
            }
        }   
        System.out.println(list);
    }
    
}

///////////// or ////////////////

class Removeduplicatefromstring_4 {
    public static void main(String args[]){
        String s="banaans";
        String nondup="";
        for(int i=0;i<s.length();i++){
           int count=0;
           for(int j=i+1;j<s.length()-1;j++){
               if(s.charAt(i)==s.charAt(j)){
                   count++;
               }
           }
           if(count==0){
                   nondup=nondup+s.charAt(i)+"";
               }
        }   
        System.out.println(nondup);
    }
    
}


//  5. Write a program to count the number of occurrences of each character in a string? 
//  Ex: apple    Output: a-1 p-2 l-1 e-1 

import java.util.*;
class Charoccurences_string_5 {
    public static void main(String args[]){
        String s="Gaurav Gangaram gayake";
        ArrayList <Character> list=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            int count=1;
            if(!list.contains(s.charAt(i))&& s.charAt(i)!=' '){
                list.add(s.charAt(i));
          
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            System.out.println(s.charAt(i)+" - "+count);
            }
        }
    }
}


//  6. Write a program to print duplicate characters from the given String? 
//  Ex: Programming  Output:  r, g, m


class Printdupchar_6 {
    public static void main(String args[]){
        String s="Programming";
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>0){
                System.out.println(s.charAt(i));
            }
        }
    }
}


//  7. write a program to print all duplicate character and their count form the given String? 
//  Ex: Programming  Output:  g: 2  r: 2  m: 2 

import java.util.*;
class Printdupcharcount_7 {
    public static void main(String args[]){
        String s="Programming";
        HashSet <Character> set=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            int count=1;
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
          
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>1){
                System.out.println(s.charAt(i)+" - "+count);
            }
            }
        }
    }
}


//  8. Write a program to print Highest occurred character from given String? 
//  Ex: aaaaabbcddddd  Output: a 


class Highestdupchar_8 {
    public static void main(String args[]){
        String s="aaaaabbcdddd";
         int highcount=0;
           String letter="";
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>highcount){
                highcount=count;
                letter=s.charAt(i)+"";
            }
        }
        System.out.println(letter);
    }
}


//  9.Write a program to remove the given Character from the given String? 
//  Ex: nacre Software Remove character: a  Output: ncre Softwre 


class Charremovestring_9 {
    public static void main(String args[]){
        String s="nacre Software";
        char charremove='a';
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==charremove){
               s=s.replace(s.charAt(i)+"","");
            }
        }
        System.out.println(s);
    }
}


//  10. Write a program to whether check given string contains digits or not? 
//  Ex: nacre123     nacre#$  Output: Given String Contains Digits  Given String not contain Digits 

class Stringdigits_10{
    public static void main(String args[]){
       boolean flag=false;
       // String s="nacre123";
        String s="nacre#$";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
               flag=true;
            }
        }
        if (flag==true){
            System.out.println("String contains digits");
        }
        else{
            System.out.println("String does not have digits");
        }
    }
}

//  11. Write a program to whether check given string contains Special Characters or not? 
//  Ex: nacre123@#    nacre123 


class Stringcontains_specialchar_11 {
    public static void main(String args[]){
       String s="nacre123@#";
       // String s="nacre123";
    boolean flag=false;
    
  //  for(int i=0;i<s.length();i++){
        if(!s.matches("[a-zA-Z0-9]*")){
         flag=true;
        }
   // }
    if(flag==true){
       System.out.println("String contains special character");
    }
    else{
        System.out.println("String does not contain special Characters");
    }
    }
}


//  12. Write a program to whether check given string contains vowels or not? 
//  Ex: nacre123  Output: Given String Contains vowels 


class Stringcontainsvowel_12 {
    public static void main(String args[]){
        String s="nacre123";
        if(s.contains("a")||s.contains("e")||s.contains("i")||
           s.contains("o")||s.contains("u")){
            System.out.println("String Contains vowel");
        }
        else{
            System.out.println("String does not contain vowel");
        }
    }
}


//  13. Write a program to count the characters, digits and Special Characters from the given String? 
//  Ex: Nacre@123%  Output: Characters are 5 Special Characters are 2  Digits are 3 


class Countchardigitspecialchar_13 {
    public static void main(String args[]){
        String s="Nacre@123%";
        int charcount=0;
        int digitcount=0;
        int specialcount=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)+"").matches("[a-zA-Z]")){
                charcount++;
            }
            else if((s.charAt(i)+"").matches("[0-9]")){
                digitcount++;
            }
            else{
                specialcount++;
            }
        }
        System.out.println("Character count is "+charcount+" digits count is "+digitcount+" Special Character count is "+specialcount);
    }
}
///////////////////////////////or//////////////////////////////////

class Countchardigitspecialchar_13 {
    public static void main(String args[]){
        String s="Nacre@123%";
        int charcount=0;
        int digitcount=0;
        int specialcount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                digitcount++;
            }
            else if((s.charAt(i)>='a'||s.charAt(i)>='A')&& (   s.charAt(i)<='z'||s.charAt(i)<='Z')){
                charcount++;
            }
            else{
                specialcount++;
            }
        }
        System.out.println("Character count is "+charcount+" digits count is "+digitcount+" Special Character count is "+specialcount);
    }
}



//  14. Write a program to count the Capital letters and Small letters from the given String? 
//  Ex: Nacre Software Output: Capital Characters are 2 Small Characters are 11  


class captial_smalllettercount_14{
    public static void main(String args[]){
        String s="Nacre Software";
        int capcount=0;
        int smallcount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                smallcount++;
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                capcount++;
            }
        }
        System.out.println("Capital letter count is "+capcount+ " small letter count is "+smallcount);
    }
}


//  15. Write a program to count the consonants and vowels from the given String? 
//  Ex: Nacre Output:  Vowels are 2 Consonants are 3 


class countconstanant_vowels_15 {
    public static void main(String args[]){
        String s="Nacre";
        s=s.toLowerCase();
        int vcount=0;
        int ccount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vcount++;
            }
            else{
                ccount++;
            }
        }
        System.out.println("Vowel count is "+vcount+ " & consonant count is "+ccount);
    }
}


//  16. Write a program to find the percentages of characters, Digits and Special characters from the  
        given String? 


class Char_digits_specialchar_16 {
    public static void main(String args[]){
        String s="Nacre@123%";
        int ccount=0;
        int dcount=0;
        int spcount=0;
        float tper=s.length();
        
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)+"").matches("[a-zA-Z]")){
                ccount++;
            }
            else if((s.charAt(i)+"").matches("[0-9]")){
                dcount++;
            }
            else{
                spcount++;
            }
        }
        System.out.println(ccount+" "+dcount+" "+spcount);
        float cper=(ccount/tper)*100;
        float dper=(dcount/tper)*100;
        float spper=(spcount/tper)*100;
        System.out.println(String.format("%.2f", cper)+" "+String.format("%.2f", dper)+" "+String.format("%.2f", spper));
    }
}


//  17. Write a program to find the percentages of the Consonants and vowels from the given String? 


class perconsonant_vowel_17 {
    public static void main(String args[]){
        String s="elisabeth";
        int vcount=0;
        int ccount=0;
        float len=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vcount++;
            }
            else{
                ccount++;
            }
        }
        float vper=(vcount/len)*100;
        float cper=(ccount/len)*100;
        System.out.println(String.format("%.2f",vper)+" "+String.format("%.2f",cper));
    }
}



// 18. Write a program to find the percentages of the Capital Characters , Small characters, Special 
//     Characters and Digits from the given String? 


class Percaptialsmallspecial_digit_18 {
    public static void main(String args[]){
        String s="Nacre@123%";
        int ccount=0;
        int scount=0;
        int dcount=0;
        int spcount=0;
        float len=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                scount++;
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ccount++;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                dcount++;
            }
            else{
               spcount++; 
            }
        }
       float cper=(ccount/len)*100;
       float sper=(scount/len)*100;
       float spper=(spcount/len)*100;
       float dper=(dcount/len)*100;
       
       System.out.println(String.format("%.2f",cper)+" "+String.format("%.2f",sper)+" "+String.format("%.2f",spper)+" "+String.format("%.2f",dper)); 
    }
}


//   19. Write a program to sort the given String? 
//   Ex: nacre  Output: acenr 

import java.util.*;
class Sort_string_19 {
    public static void main(String args[]){
        String s="nacre";
        char a[]=s.toCharArray();
        Arrays.sort(a);
        System.out.println(a);
    }
}

//////////////////////////////or//////////////////////////////

import java.util.*;
class Sort_string_19 {
    public static void main(String args[]){
        String s="nacre";
        String sorted="";
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    char temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            sorted=sorted+a[i];
        }
        
        System.out.println(sorted);
    }
}


//   20.Write a program to Check whether two given Strings are anagram or not? 
//   Ex: Str1= reaction Str2: creation  Output: Two Strings are anagrams 


import java.util.*;

class Stringanagram_20 {
    public static void main(String args[]){
        String s1="reaction";
        String s2="creation";
        if(s1.length()==s2.length()){
       char a1 []=s1.toCharArray();
       char a2 []=s2.toCharArray();
       Arrays.sort(a1);
       Arrays.sort(a2);
       int count=0;
       for(int i=0;i<a1.length;i++){
           if(a1[i]==a2[i]){
               count++;
           }
       }
       if(count==a1.length){
           System.out.println("String are anagrams");
       }
       else{
           System.out.println("Arrays are not anagrams");
       }
        }
        else{
            System.out.println("two Strings are not anagram");
        }
       
    }
}

//////////////////////////////or////////////////////////////////////

import java.util.*;

class Stringanagram_20 {
    public static void main(String args[]){
        String s1="reaction";
        String s2="creation";
        if(s1.length()==s2.length()){
       char a1 []=s1.toCharArray();
       char a2 []=s2.toCharArray();
       Arrays.sort(a1);
       Arrays.sort(a2);
       if(Arrays.equals(a1,a2)){
           System.out.println("String are anagrams");
       }
       else{
           System.out.println("Arrays are not anagrams");
       }
        }
        else{
            System.out.println("two Strings are not anagram");
        }
       
    }
}



//   21. Write a program to count occurrence of a given character from the String? 
//   Ex: Today is Monday Given Character a Output: given character a occurrence is 2 times



class Charoccurencecount_21 {
    public static void main(String args[]){
        String s="Today is Monday";
        char find='a';
        int count=0;
        for(int i=0; i<s.length();i++){
            if(find==s.charAt(i)){
                count++;
            }
        }
        System.out.println("The character "+find+" ocurrence is "+count+" times");
    }



//   22. Write a program to replace given character to other given Character in the string? 


class Replace_char_22 {
    public static void main(String args[]){
        String s="This is giil";
        char replace='i';
        char replacement='#';
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==replace){
                s=s.replace(replace,replacement);
            }
        }
        System.out.println(s);
    }
}


//  23. Write a program to Whether Given String is palindrome String or not? 
//  Ex: madam Output: Given String is Palindrome


class Stringpalindrome_23 {
    public static void main(String args[]){
        String s="madam";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }



//  24. Write a Program to reverse words in a given String? 
//  Ex: "Java is best programming language"   Output "language programming best is Java". 



class RevreseStringWords_24 {
    public static void main(String args[]){
        String s="Java is best programming language";
        String a[]=s.split(" ");
        String rev="";
        for(int i=a.length-1;i>=0;i--){
            rev=rev+a[i]+" ";
        }
        System.out.println(rev);
    }
}


//  25. Write a program to reverse Words of the Given String? 
//  Ex: "Today is Monday" Output: yadoT si yadnoM 


import java.util.*;
class Rev_words_String_25 {
    public static void main(String args[]){
        String s="Today is Monday";
        String rev="";
        StringBuffer sb= new StringBuffer(s);
        s=sb.reverse()+"";
         String a[]=s.split(" ");
       for(int i=a.length-1;i>=0;i--){
           rev=rev+a[i]+" ";
       }
       System.out.println(rev);
    }
}


//   26. Write a program to copy one String to another String? 
//   Ex: Str1=” nacre”, str2;  Output: sop(str2); //nacre



class CopyStringtoAnother_26 {
    public static void main(String args[]){
        String str1="nacre";
        String str2=str1;
        
        System.out.println(str2);
    }
}



//   27. Write a program to concat two Strings? 
//   Ex: str1=” nacre” str2=” software”;  Output: nacre software


class ConcatString_27 {
    public static void main(String args[]){
        String str1="nacre";
        String str2="software";
        
        System.out.println(str1+" "+str2);
    }
}


//  28. Write  a Program to print short name of given string 
//  Ex: Sanjeeva Reddy Nagar Output: SR Nagar 


class ShortName_String_28 {
    public static void main(String args[]){
        String s="Sanjeeva Reddy Rama Venkata Nagar";
        String a[]=s.split(" ");
        String shortname="";
for(int i=0;i<a.length;i++){
    if(i<a.length-1){
        shortname=shortname+a[i].charAt(0);
    }
    else{
        shortname=shortname+" "+a[i];
    }
}
        System.out.println(shortname);
    }
}



//   29. Swap first and last character of a given String 
//   input:- NacrE   Output:-EacrN



class SwapfirstlastChar_29 {
    public static void main(String args[]){
        String s="NacrE";
        char first=s.charAt(0);
        char last=s.charAt(s.length()-1);
       char a[]=s.toCharArray();
       a[0]=last;
       a[a.length-1]=first;
       String ans=new String(a);
        System.out.println(ans);
    }
}



//   30. remove duplicate elements/character from array/String(dont use predefine logic) 

import java.util.*;
class RemoveDupCharFromString_30 {
    public static void main(String args[]){
        String s="Aabccdeeef";
        String output="";
        ArrayList <Character> list=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
              
                }
                
            }
            System.out.println(list);
    }
}

///////////////////////////////////OR///////////////////

import java.util.*;
class RemoveDupCharFromString_30 {
    public static void main(String args[]){
        String s="Aabccdeeef";
        String output="";
        for(int i=0;i<s.length();i++){
            if(!output.contains(s.charAt(i)+"")){
                  output=output+s.charAt(i);
                }
            }
            System.out.println(output);
    }
}



//   31. Display 2nd highest number from array. 



class highest2ndno_Array_31 {
    public static void main(String args[]){
        int a[]={1,80,70,6,9,4,3,2,5,6};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(a[a.length-2]);
    }
}



//   32.write a program of permutation. 
//   input:- "abc" output:-abc,acb,bac,bca,cab,cba

import java.util.Arrays;

class Permutation_String32 {
    public static void main(String args[]) {
        String s = "aac";
        char[] arr = s.toCharArray();

        // Step 1: Sort
        Arrays.sort(arr);

        while (true) {
            // Print permutation
            System.out.println(String.valueOf(arr));

            // Step 2: Find i
            int i = arr.length - 2;
            while (i >= 0 && arr[i] >= arr[i + 1]) {
                i--;
            }

            if (i < 0) break;

            // Step 3: Find j
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            // Step 4: Swap
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Step 5: Reverse
            int start = i + 1, end = arr.length - 1;
            while (start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
 * 
 */
}

//dfh