class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        
        if(s1.length() != s2.length())
            return false;

        HashMap<Character,Integer> map = new HashMap<>();

        // count frequency of s1
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        // decrease frequency using s2
        for(char c : s2.toCharArray()){
            if(!map.containsKey(c))
                return false;

            map.put(c, map.get(c)-1);

            if(map.get(c) < 0)
                return false;
        }

        return true;
    }
}
    