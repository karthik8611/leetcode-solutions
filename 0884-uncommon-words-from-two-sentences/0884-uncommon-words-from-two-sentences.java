class Solution {

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        List<String> ans = new ArrayList<>();

        String[] ss1 = s1.split(" ");

        String[] ss2 = s2.split(" ");

        for (String word : ss1) {
            map1.put(word, map1.getOrDefault(word,0) + 1);
        }
        
       // System.out.println(map1.size());

        for (String word : ss2) {
            map2.put(word, map2.getOrDefault(word,0) + 1);
        }
          //System.out.println(map2.size());
        for (String s : map1.keySet()) {
             // System.out.println(map1.get(s));
            if (!map2.containsKey(s) && map1.get(s) == 1) {
                ans.add(s);
            }
        }

        for (String s : map2.keySet()) {
            if (!map1.containsKey(s) && map2.get(s) == 1) {
                ans.add(s);
            }
        }
        
      //  System.out.println(ans.size());

        return ans.toArray(new String[0]);
    }
}
