public class EmailSplitter {
    public static String getDomains(String emails){
        int semicolonIndex = 0;
        String domains = "";
        do {
//            System.out.println("Semicolon index: " + semicolonIndex);
            int startIndex = emails.indexOf('@', semicolonIndex);
            int endIndex = emails.indexOf('.', semicolonIndex);

            if(startIndex == -1 || endIndex == -1) {
//                System.out.println("Semicolon index: " + semicolonIndex + ", exiting...");
                break;
            }
            else {
                String domain = emails.substring(startIndex + 1, endIndex);
//                System.out.println(domain);
                domains = domains.concat(domain + "\n");
            }

            semicolonIndex = emails.indexOf(';', semicolonIndex + 1);
        } while(semicolonIndex >= 0);
//        System.out.println(domains);
        return domains;
    }
}
