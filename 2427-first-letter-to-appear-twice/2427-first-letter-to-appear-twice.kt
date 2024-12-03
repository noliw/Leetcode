/*
1. what is the input:
- a string s that has lowercase letters

2. what do we need to do to the input:
- find the letter that appears twice first


3. what do we need to return:
- return that letter


 */

 /*
 the straight forward approach is to go through the string with each letter as the first starting point and going through the rest of the string. This will require a nested loop outer loop would be O(n) and inner loop would be O(n) so it will be a time complexity of O(n^2) and space complexity of O(n)  
  */


/* but we can make this more efficient by using sets */
class Solution {
    fun repeatedCharacter(s: String): Char {
       val seenChar = hashSetOf<Char>()
       for(char in s) {
        if(seenChar.contains(char)) return char
        seenChar.add(char)
       }
       return ' '
    }
}