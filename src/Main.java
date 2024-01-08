public class Main {
    public static void main(String[] args) {
        boolean isWakeUp = shouldWakeUp(true,-1);
        System.out.println(isWakeUp);
    }

    public static boolean shouldWakeUp(boolean bark, int hour){
        if(bark){
            return (0 <= hour && hour <= 8) || (20 <= hour && hour <= 23);
        }
        return false;
    }
}