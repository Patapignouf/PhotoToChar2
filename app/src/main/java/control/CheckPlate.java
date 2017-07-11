package control;

import android.util.Log;

/**
 * Created by Patapignouf on 11/07/2017.
 */

public class CheckPlate {

    String Plaques;

    public CheckPlate(String plaques) {
        Plaques = plaques;
    }

    public CheckPlate() {
        Plaques = "";
    }


    public boolean checklong(){
        if (Plaques.length()<=7){
            return false;
        } else {
            return true;
        }

    }

    public void formatcontent(){
        String test = Plaques;
        String test2 = "";
        int taille = test.length();

        for(int i = 0; i < taille; i++){
            if (Character.isLetter(test.charAt(i))){
                test2=test2+test.charAt(i);
            } else if (Character.isDigit(test.charAt(i))) {
                test2=test2+test.charAt(i);
            } else {
                //On ne fait rien dans ce cas car on ne veut pas du caractère.
            }

        }
        Log.d("format", test);
        Log.d("format", test2);
        Plaques=test2;
    }



    public String getPlaques() {
        return Plaques;
    }

    public void setPlaques(String plaques) {
        Plaques = plaques;
    }
}
