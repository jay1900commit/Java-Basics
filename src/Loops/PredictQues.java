package Loops;

public class PredictQues {
    public static void main(String[] args) {

        int x=4,y=0;
        while (x>=0){
            x--;
            y++;
            if(x==y)
                continue;
                else
                System.out.println(x+" "+y);
        }
    }
}
