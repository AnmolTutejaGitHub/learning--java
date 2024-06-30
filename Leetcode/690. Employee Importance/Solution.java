
//package Leetcode.690. Employee Importance;
import java.util.*;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int sum[] = new int[1];
        boolean[] vis = new boolean[2000];
        HashMap<Integer, Integer> map = new HashMap<>();// id,i
        for (int i = 0; i < employees.size(); i++) {
            map.put(employees.get(i).id, i);
        }
        dfs(id, employees, sum, vis, map);

        return sum[0];
    }

    public void dfs(int id, List<Employee> employees, int[] sum, boolean[] vis, HashMap<Integer, Integer> map) {
        vis[id] = true;
        int i = map.get(id);
        sum[0] += employees.get(i).importance;
        for (int sub : employees.get(i).subordinates) {
            if (!vis[sub]) {
                dfs(sub, employees, sum, vis, map);
            }
        }
    }
}
