package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        String[] result = new String[str.length()];

        int count = 1;

        for(int i = 0; i < str.length() ; i++){
            //lower case every loop
           String lower = str.toLowerCase();

            for(int j = 0; j < 1 ; j++){
                //lowercased completely
                StringBuilder startStr = new StringBuilder(lower);

                //uppercase single letter
                Character up = Character.toUpperCase(startStr.charAt(i));
                startStr.replace(i, i+1, up.toString());

                result[i] = startStr.toString();


            }
        }
        return result;
    }
}
