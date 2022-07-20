class Solution {
    private boolean pathExists(int src, int dest,ArrayList<Integer>[] graph,boolean[] visited){
        if(dest==src){
            return true;
        }
        visited[src]=true;
        for(int i=0;i<graph[src].size();i++){
            if(visited[graph[src].get(i)] == false){
              boolean isPath =  pathExists(graph[src].get(i),dest,graph,visited);
             if(isPath==true){
                 return true;
             }
            }
        // visited[src]=false;
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList[] graph=new ArrayList[n];
        
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        boolean[] visited=new boolean[n];
       return pathExists(source,destination,graph,visited);
        
    }
}