class Solution {
    public int firstUniqChar(String s) {
        int result = Integer.MAX_VALUE;
        int firstOccurrenceIndex = -1;
        
        for(char c = 'a' ; c<='z'; c++){
            firstOccurrenceIndex = s.indexOf(c);
            
            if(firstOccurrenceIndex != -1 && firstOccurrenceIndex == s.lastIndexOf(c)){
                result = Math.min(firstOccurrenceIndex, result);
            }
        }
        
        if(result == Integer.MAX_VALUE){
            return -1;
        }
        return result;
    }
}