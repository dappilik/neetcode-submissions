class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(String s: strs){
            sb.append(s.length() ).append("*").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i=0;
        while(i< str.length()){
            int sIndex = str.indexOf('*', i);
            int l= Integer.valueOf(str.substring(i, sIndex));
            strs.add(str.substring(sIndex+1, sIndex+1 + l));
            i=sIndex+1 + l;
        }

        return strs;

    }
}
