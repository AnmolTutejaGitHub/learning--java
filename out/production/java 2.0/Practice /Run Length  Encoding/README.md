problem :(geeksforgreeks)  https://www.geeksforgeeks.org/problems/run-length-encoding/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

// Run Length Encoding

// Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
// eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
// You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.

// Example 1:

// Input:
// str = aaaabbbccc
// Output: a4b3c3
// Explanation: a repeated 4 times
// consecutively b 3 times, c also 3
// times.
// Example 2:

// Input:
// str = abbbcdddd
// Output: a1b3c1d4



Steps :

Pick the first character from the source string. 
Append the picked character to the destination string. 
Count the number of subsequent occurrences of the picked character and append the count to the destination string. 
