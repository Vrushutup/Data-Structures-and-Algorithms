class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        path.add(0);
        allPathsUtil(path,0, graph);
        return ans;
    }

    private void allPathsUtil(List<Integer> path, int i, int[][] graph) {

        if(i==graph.length-1){
            ans.add(path);
            return;
        }
        for(int node:graph[i]){
            List<Integer> newPath=new ArrayList<>(path);
            newPath.add(node);
            allPathsUtil(newPath,node, graph);
        }
    }
}