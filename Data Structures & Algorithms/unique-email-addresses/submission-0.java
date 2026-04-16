public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();

        for (String e : emails) {
            int i = 0;
            StringBuilder l = new StringBuilder();
            while (i < e.length() && e.charAt(i) != '@' && e.charAt(i) != '+') {
                if (e.charAt(i) != '.') {
                    l.append(e.charAt(i));
                }
                i++;
            }

            while (i < e.length() && e.charAt(i) != '@') {
                i++;
            }
            String d = e.substring(i + 1);
            unique.add(l.toString() + "@" + d);
        }
        return unique.size();
    }
}