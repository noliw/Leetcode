/*
1. what is the input:
a string with lowercase letters

2. what do we need to do to the input:
go through the string and find the first letter to appear twice

3. what do we need to return:
return the character that appears twice

 */

 /*
 the straight forward approach is to go through the string with each letter as the first starting point and going through the rest of the string. This will require a nested loop outer loop would be O(n) and inner loop would be O(n) so it will be a time complexity of O(n^2) and space complexity of O(n)  
  */


/* but we can make this more efficient by using hashmaps */
class Solution {
    fun repeatedCharacter(s: String): Char {
        val seenChar = mutableMapOf<Int, Char>()
        for((index, char) in s.withIndex()){
            if (seenChar.containsValue(char)){
                return char
            }
            seenChar[index] = char
        }
        return ' '
    }
}