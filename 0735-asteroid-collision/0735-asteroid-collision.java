class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        
        Stack<Integer> st = new Stack<>();
        
        for(int as:asteroids){
            if(as>0){
                st.push(as);
            }else{
                while(st.size()>0 &&  st.peek()>0 && st.peek()< Math.abs(as)){
                    st.pop();
                }
                
                if(st.empty() || st.peek()<0){
                    st.push(as);
                }
                else if(st.peek()==Math.abs(as)){
                    st.pop();
                }
            }
        }
        
        int[]  res= new int[st.size()];
        
        for(int i=res.length-1;i>=0;i--){
          res[i]=st.pop();
        }
        
        return res;
    }
}