class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer> map= new HashMap<>();
        
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        
          PriorityQueue<String> pq = new PriorityQueue<>((s1, s2) -> {
            int s1Count = map.get(s1);
            int s2Count = map.get(s2);
            
            if(s1Count == s2Count) return s2.compareTo(s1);
            return s1Count-s2Count;
        });

        
        for(String key:map.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
        }
        }
        
        LinkedList<String> list =new LinkedList<>();
    while(!pq.isEmpty()){
        list.addFirst(pq.poll());
    }
        
        return list;
        
    }
}