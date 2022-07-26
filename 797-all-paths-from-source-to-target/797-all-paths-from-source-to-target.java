class Solution {
    List<List<Integer>> Ans;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        Ans=new ArrayList<>();
     List<Integer> path=new ArrayList<>();
     path.add(0);
     allPath(path,graph,0);
     return Ans;
    }
    private void allPath(List<Integer> path,int[][] graph, int i){
        if(graph.length-1==i){
            Ans.add(path);
            return;
        }
        for(int node:graph[i]){
            List<Integer> newPath=new ArrayList<>(path);
            newPath.add(node);
            allPath(newPath,graph,node);
        }
    }
}