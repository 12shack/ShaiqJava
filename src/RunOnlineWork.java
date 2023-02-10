public class RunOnlineWork {
    public static void main(String[] args) {

        int results = caughtSpeeding(60, true);
        System.out.println(results);
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {

        int value;

        if (isBirthday) {
            if (speed <= 65)
                value = 0;
            else if (speed >= 66 && speed <= 85)
                value = 1;
            else
                value = 2;
        }
         else {
            if (speed <= 60)
                value = 0;
            else if (speed >= 61 && speed <= 80)
                value = 1;
            else
                value =2;
        }

        return value;
    }
}
