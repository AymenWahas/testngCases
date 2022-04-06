
public class baseClass {

    public String determineLetterGrade(int number){
        if(number<0){
            throw  new IllegalArgumentException("Number grade Error");
        }
        else if(number<60){
            return "good";
        }
        else if(number<70){
            return "vg";
        }
        else if(number<80){
            return "vvg";
        }
        else if(number<90){
            return "exl";
        }
        else return "pass";
    }



}
