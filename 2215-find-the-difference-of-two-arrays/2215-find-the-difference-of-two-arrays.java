class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        
        for(int i:nums1){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
         for(int i:nums2){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        
        for(int i=0;i<nums1.length;i++){
            if(!map2.containsKey(nums1[i])){
                list1.add(nums1[i]);
            }
        }
        
        for(int i=0;i<nums2.length;i++){
            if(!map1.containsKey(nums2[i])){
                list2.add(nums2[i]);
            }
        }
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        set1.addAll(list1);
        list1.clear();
        list1.addAll(set1);
         set2.addAll(list2);
        list2.clear();
        list2.addAll(set2);
        
        
        
        
        list.add(list1);
        list.add(list2);
        return list;
        
        
        
    }
}