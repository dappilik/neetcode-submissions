class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int startIndex = 0;
        int endIndex = numbers.length - 1;
        while (startIndex < endIndex) {
            System.out.println(startIndex + "," + endIndex + " -> " + numbers[startIndex] + " + "
                + numbers[endIndex] + " =" + (numbers[startIndex] + numbers[endIndex]));
            if (numbers[startIndex] + numbers[endIndex] == target) {
                break;
            }
            if (numbers[startIndex] + numbers[endIndex] > target) {
                endIndex--; 
            }
            if (numbers[startIndex] + numbers[endIndex] < target) {
                startIndex++;
            }
        }

        return new int[] {startIndex + 1, endIndex + 1};
    }
}
