import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        boolean isWakeUp = shouldWakeUp(true,-1);
        System.out.println(isWakeUp);

        boolean isTeen = hasTeen(12,19,25);
        System.out.println(isTeen);

        boolean isPlay = isCatPlaying(true,40);
        System.out.println(isPlay);

        System.out.println(area(5.0));
        System.out.println(area(5.0,4.0));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hour){
        if(isBarking)
            return (0 <= hour && hour < 8) || (20 <= hour && hour <= 23);
        return false;
    }
    public static boolean hasTeen (int param1, int param2, int param3){
        return ((13<=param1 && param1<=19)||(13<=param2 && param2<=19)||(13<=param3 && param3<=19));
    }

    public static boolean hasTeen2(int... ages){
        if(ages.length <3)
            return false;
        for(int age:ages){
            if(age>=13 && age <=19){
                return true;
            }
        }
        return false;
    }

    public static  boolean isCatPlaying(boolean isSummer, int temperature){
        if(isSummer)
            return (25<=temperature && temperature<=45);
        return (25<=temperature && temperature<=35);
    }
    public static double area(double param1, double param2){
        if(param1<0 || param2<0)
            return -1;
        return param1 * param2;
    }
    public static double area(double param1){
        if(param1<0)
            return -1;
        return param1*param1* PI;
    }
}