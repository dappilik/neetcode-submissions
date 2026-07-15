class Solution {
    public String minWindow(String s, String t) {
        if ("".equals(t)) {
            return "";
        }
        if (t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int left = 0;
        int[] required = {-1, -1};
        int minLength = 1001;
        for (Character c : t.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (int right = 0; right < s.length(); right++) {
            Character c = s.charAt(right);
            if (map2.keySet().contains(c)) {
                map1.put(c, map1.getOrDefault(c, 0) + 1);
                if (map1.get(c) >= map2.get(c)) {
                    boolean allMatced = true;

                    for (Character c2 : map2.keySet()) {
                        if (!map1.keySet().contains(c2) || map1.get(c2) < map2.get(c2)) {
                            allMatced = false;
                            break;
                        }
                    }
              
                    if (allMatced) {
                        Character cleft = s.charAt(left);
                        while (
                            !map2.keySet().contains(cleft) || map1.get(cleft) > map2.get(cleft)) {
                            if (map2.keySet().contains(cleft)) {
                                map1.put(cleft, map1.get(cleft) - 1);
                            }
                            left++;
                            if (left > s.length() - 1) {
                                break;
                            }
                            cleft = s.charAt(left);
                        }

                        if (minLength > right - left + 1) {
                            required = new int[] {left, right};
                            minLength = right - left + 1;
                            map1.put(cleft, map1.get(cleft) - 1);
                            left++;
                        }
                    }
                }
            }
        }

        if (minLength == 1001) {
            return "";
        }
        return s.substring(required[0], required[1] + 1);
    }
}
