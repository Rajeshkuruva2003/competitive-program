class Solution {
    public int minBitFlips(int start, int goal) {
        int cnt = 0;
        int ans = start ^ goal; // XOR to get differing bits
        
        while (ans > 0) {
            cnt += ans & 1;  // Check if the least significant bit is 1
            ans >>= 1;       // Right shift by 1
        }
        
        return cnt;
    }
}
