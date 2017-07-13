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
        int compteurL = 0;
        int marqueurL = 0;
        for(int i = 0; i < taille; i++){
            if (Character.isLetter(test.charAt(i))){
                test2=test2+test.charAt(i);
                compteurL++;
                Log.d("format2", String.valueOf(compteurL));
                if ((compteurL==3)&&(i<4)) {
                    marqueurL=1;
                    Log.d("format2", "On veut retirer une lettre au début");
                }
            } else if (Character.isDigit(test.charAt(i))) {
                test2=test2+test.charAt(i);
            } else {
                //On ne fait rien dans ce cas car on ne veut pas du caractère.
            }

        }

        if (marqueurL==1){
            test2=test2.substring(1,test2.length());
            Log.d("format2", "On retire une lettre au début");
            Log.d("format2", test2);
        }

        if (compteurL>=4){

                test2=test2.substring(0,7);
                Log.d("format2", "On retire les chiffres à la fin");
            Log.d("format2", test2);


        }

        //Log.d("format", test);
        //Log.d("format", test2);
        Plaques=test2;
    }

    public boolean isEmpty() {
        Log.d("Taille Plaque",String.valueOf(Plaques.length()));
        if (Plaques.length()==0){
            return true;
        } else {
            return false;
        }

    }

    public String getPlaques() {
        return Plaques;
    }

    public void setPlaques(String plaques) {
        Plaques = plaques;
    }
}
