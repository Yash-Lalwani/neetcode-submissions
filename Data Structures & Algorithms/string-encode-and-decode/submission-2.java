class Solution {
    StringBuilder sb = new StringBuilder("");
    List<String> list = new ArrayList<>();

    public String encode(List<String> strs) {
        for (int i=0; i<strs.size(); i++) {
            sb.append(strs.get(i));
            sb.append("ü");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        StringBuilder res = new StringBuilder("");
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'ü') {
                list.add(res.toString());
                res = new StringBuilder("");
            }
            else {
                res.append(str.charAt(i));
            }
        }
        return list;
    }
}
