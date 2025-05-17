class Solution {
    public int characterReplacement(String s, int k) {  
        int l = 0;
        int window = 0;
        int maxf = 0;
        int ans = 0;
        int hash[] = new int[26];
        
        for (int r = 0; r < s.length(); r++) {
            hash[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, hash[s.charAt(r) - 'A']);
            window= r - l + 1;
            
            if (window - maxf > k) {
                hash[s.charAt(l) - 'A']--;  
                l++;
            }
            
            ans = Math.max(ans, r - l + 1);
        }
        
        return ans;
    }
}
