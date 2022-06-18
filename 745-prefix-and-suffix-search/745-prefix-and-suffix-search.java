class WordFilter {
HashMap<String, Integer> mp;

public WordFilter(String[] words) {
    mp = new HashMap<>();
    for (int i = 0; i < words.length; i++) {
        for (int j = 0; j < words[i].length(); j++) {

            String prefix = words[i].substring(0, j + 1);

            for (int k = words[i].length() - 1; k > -1; k--) {

                String suffix = words[i].substring(k);
                mp.put(prefix + "#" + suffix, i);
            }
        }
    }
    
}

public int f(String prefix, String suffix) {
     return mp.getOrDefault(prefix + "#" + suffix, -1);
}
}
/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */