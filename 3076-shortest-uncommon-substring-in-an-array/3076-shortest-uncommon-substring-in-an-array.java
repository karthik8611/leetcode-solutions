class Solution {
    public String[] shortestSubstrings(String[] arr) {
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            
            String s=arr[i];
            int len=s.length();
            
            Set<String> set = new HashSet<>();
            
            for(int j=0;j<len;j++){
                for(int k=j+1;k<=len;k++){
                    String sub=s.substring(j,k);
                    set.add(sub);
                }
            }
            
            for(String ss:set){
                map.put(ss,map.getOrDefault(ss,0)+1);
            }
            
        }
        
        
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            int len=s.length();
            ArrayList<String> list = new ArrayList<>();
            
            for(int j=0;j<len;j++){
                for(int k=j+1;k<=len;k++){
                    String sub=s.substring(j,k);
                    
                    if(map.get(sub)==1){
                        list.add(sub);
                    }
                }
            }
            
            if(list.size()==0){
                arr[i]="";
            }else if(list.size()==1){
                arr[i]=list.get(0);
            }else{
                Collections.sort(list);
                String ans=list.get(0);
                
                for(int b=1;b<list.size();b++){
                    if(ans.length()>list.get(b).length())
                        ans=list.get(b);
                    
                }
                 arr[i]=ans;
            }
           
            
        }
        
        
        return arr;
        
    }
}