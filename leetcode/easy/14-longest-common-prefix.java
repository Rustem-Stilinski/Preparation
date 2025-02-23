Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.


Companies- Google, Meta , Amazon, Microsoft, Bloomberg, Apple, Oracle. 0-3 months ago.  - 2025-02-23







class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String firstElement = strs[0];
       String lastElement = strs[strs.length-1];
       int i = 0 ;
       while(i<firstElement.length()){
        if(firstElement.charAt(i)==lastElement.charAt(i)){
         i++;
        }
       else{break;}
       }
       
       return firstElement.substring(0, i);

         }
}
