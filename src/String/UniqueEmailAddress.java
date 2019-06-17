package String;

import java.util.HashSet;

/**
 * 929. Unique Email Addresses
 * Easy
 * @author zhuduan
 * 2019/06/17
 */

public class UniqueEmailAddress {
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            String local = email.split("@")[0];
            StringBuilder sb = new StringBuilder();

            for (char c : local.toCharArray()) {
                if (c == '+') {
                    break;
                } else if (c != '.') {
                    sb.append(c);
                }
            }

            String localName = sb.toString();
            String domain = email.split("@")[1];
            String curEmail = localName + "@" + domain;
            if (!set.contains(curEmail)) {
                System.out.println(curEmail);
                set.add(curEmail);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        System.out.println(numUniqueEmails(emails));
    }
}
