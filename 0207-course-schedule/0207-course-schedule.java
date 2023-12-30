class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edges =new ArrayList<>();
        int[] indegrees= new int[numCourses];
        
        for(int i=0;i<numCourses;i++){
            edges.add(new ArrayList<>());
        }
        
        
        for(int i=0;i<prerequisites.length;i++){
            int course=prerequisites[i][0];
            int precourse=prerequisites[i][1];
            edges.get(precourse).add(course);
            indegrees[course]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int course=0;course<numCourses;course++){
            if(indegrees[course]==0){
                queue.offer(course);
            }
        }
        
        while(!queue.isEmpty()){
            int course=queue.poll();
        for(int nextCourse:edges.get(course)){
            indegrees[nextCourse]--;
                if(indegrees[nextCourse]==0){
                    queue.offer(nextCourse);
                }
        }
        }
        
        for(int indegree:indegrees){
            if(indegree!=0) return false;
        }
        
        return true;
        
    }
}