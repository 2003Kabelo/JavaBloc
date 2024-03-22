import java.security.MessageDigest;
public class SHA_256Helper {

    public static String generateHash(String data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("utf-8"));
            StringBuilder hexDecimalString = new StringBuilder();

            for(int i = 0 ; i < hash.length ; i++) {

                String hexDecimal = Integer.toHexString(0xff & hash[i]);
                hexDecimalString.append(hexDecimal);
                if(hexDecimal.length() == 1) hexDecimalString.append('0');
                hexDecimalString.append(hexDecimal);

            }
            return hexDecimalString.toString();

        }
        catch(Exception e) {

            throw new RuntimeException(e);

        }
    }


}
