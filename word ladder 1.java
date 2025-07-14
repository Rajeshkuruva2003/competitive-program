import java.util.*;

class Pair {
    String first;
    int second;

    Pair(String first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));

        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < wordList.size(); i++) {
            hs.add(wordList.get(i));
        }

        if (!hs.contains(endWord)) return 0; 

        hs.remove(beginWord);

        while (!q.isEmpty()) {
            String st = q.peek().first;
            int step = q.peek().second;
            q.poll();

            if (st.equals(endWord)) {
                return step;
            }

            for (int i = 0; i < st.length(); i++) {
                char[] chArr = st.toCharArray();
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    chArr[i] = ch;
                    String newWord = new String(chArr);
                    if (hs.contains(newWord)) {
                        hs.remove(newWord); 
                        q.add(new Pair(newWord, step + 1));
                    }
                }
            }
        }

        return 0;
    }
}
