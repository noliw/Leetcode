/*
1. What are our inputs:
- a lower case string called sentence

2. What do we need to do to the inputs:
- check if the string is panagram meaning that every letter in the alphabet appears at least once


3. what do we return:
- return true if its a panagram and false if its not
 */

 /*
 
  */


class Solution {
    fun checkIfPangram(sentence: String): Boolean {
       return sentence.toHashSet().size == 26
    }
}