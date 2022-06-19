class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            String prefix = searchWord.substring(0, i + 1);
            int ind = binarySearch(products, prefix);
            List<String> l = new ArrayList<>();
            for (int j = ind; j < products.length && l.size() <3; ++j) {
                if (products[j].startsWith(prefix)) {
                    l.add(products[j]);
                    continue;
                }
                break;
            }
            list.add(l);
        }
        return list;
    }

    int binarySearch(String[] products, String prefix) {
        int left = 0, right = products.length - 1, mid = 0;
        while (left <= right) {
            mid = (left + right) >>> 1;
            if (products[mid].compareTo(prefix) > -1) right = mid - 1;
            else left = mid + 1;
        }
        return right + 1;
    }
}