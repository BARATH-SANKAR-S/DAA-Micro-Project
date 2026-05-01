public class Main {

    public static void main(String[] args) {

        String targetPassword = "ab1";   // password to crack
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < characters.length(); i++) {
            for (int j = 0; j < characters.length(); j++) {
                for (int k = 0; k < characters.length(); k++) {

                    String guess = "" + characters.charAt(i)
                                   + characters.charAt(j)
                                   + characters.charAt(k);

                    if (guess.equals(targetPassword)) {

                        long endTime = System.currentTimeMillis();

                        System.out.println("Password Cracked: " + guess);
                        System.out.println("Time Taken: " + (endTime - startTime) + " ms");

                        return;
                    }
                }
            }
        }
    }
                      }
