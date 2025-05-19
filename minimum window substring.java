class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        if (n < m) return "";

        int[] hash = new int[256];  // frequency map for characters in t
        for (int i = 0; i < m; i++) {
            hash[t.charAt(i)]++;
        }

        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;
        int count = 0;

        while (r < n) {
            char rightChar = s.charAt(r);
            
            // if character is needed, decrease count
            if (hash[rightChar] > 0) {
                count++;
            }

            hash[rightChar]--;

            // when all characters matched
            while (count == m) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIndex = l;
                }

                char leftChar = s.charAt(l);
                hash[leftChar]++;
                if (hash[leftChar] > 0) {
                    count--;
                }
                l++;
            }

            r++;
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
tc:O(2n)+O(m)
sc:O(256)