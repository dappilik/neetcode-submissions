class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int startIndex = 0;
        int endIndex = numbers.length - 1;
        while (startIndex < endIndex) {
            int sum = numbers[startIndex] + numbers[endIndex];
            if (sum == target) {
                break;
            } else if (sum > target) {
                endIndex--;
            } else {
                startIndex++;
            }
        }
        return new int[] {startIndex + 1, endIndex + 1};
    }
}