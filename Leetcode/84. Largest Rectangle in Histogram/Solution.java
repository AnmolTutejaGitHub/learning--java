import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int LS[] = getLS(heights);
        int RS[] = getRS(heights);

        int MaxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            MaxArea = Math.max(MaxArea, (heights[i] * (RS[i] - LS[i] + 1)));
        }
        return MaxArea;
    }

    public int[] getLS(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int result[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();

            if (st.isEmpty())
                result[i] = 0;
            else
                result[i] = st.peek() + 1;

            st.push(i);
        }
        return result;
    }

    public int[] getRS(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int result[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();

            if (st.isEmpty())
                result[i] = arr.length - 1;
            else
                result[i] = st.peek() - 1;

            st.push(i);
        }
        return result;
    }
}