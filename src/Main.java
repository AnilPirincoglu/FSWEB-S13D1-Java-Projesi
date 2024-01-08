public class Main {
    public static void main(String[] args) {
        boolean isWakeUp = shouldWakeUp(true,-1);
        System.out.println(isWakeUp);

        boolean isTeen = hasTeen(12,19,25);
        System.out.println(isTeen);
    }

    public static boolean shouldWakeUp(boolean bark, int hour){
        if(bark){
            return (0 <= hour && hour <= 8) || (20 <= hour && hour <= 23);
        }
        return false;
    }
    public static boolean hasTeen (int param1,int param2, int param3){
        return ((13<=param1 && param1<=19)||(13<=param2 && param2<=19)||(13<=param3 && param3<=19));
    }
}