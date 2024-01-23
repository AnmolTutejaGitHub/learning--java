//package Leetcode.832. Flipping an Image;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length / 2; j++) {
                // flipping
                int temp = image[i][j];
                image[i][j] = image[i][n - j - 1];
                image[i][n - j - 1] = temp;
            }

        }
        // System.out.println(Arrays.deepToString(image));

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                if (image[i][j] == 0)
                    image[i][j] = 1;
                else if (image[i][j] == 1)
                    image[i][j] = 0;
            }
        }

        return image;
    }
}
