class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> c = new HashMap<>();
        int res = 0, maxc = 0;

        for (int num : nums) {
            c.put(num, c.getOrDefault(num, 0) + 1);
            if (c.get(num) > maxc) {
                res = num;
                maxc = c.get(num);
            }
        }
        return res;
    }
}