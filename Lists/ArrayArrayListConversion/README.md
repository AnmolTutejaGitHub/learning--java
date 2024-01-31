array to arraylist and arraylist to array

List<Integer> to int[] arr

    int[] arr = new int[arrList.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arrList.get(i);
            }