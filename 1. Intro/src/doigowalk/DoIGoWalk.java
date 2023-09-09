package doigowalk;

public class DoIGoWalk {
    public static void main(String[] args) {
        boolean iAmTired = false;   // я устал
        boolean isRainy = false;    // идет дождь
        boolean isEvening = true;   // вечер

        // я иду гулять, если я не устал и если нет дождя и если сейчас вечер (потому что днем жарко)
        if(!iAmTired && !isRainy && isEvening) {
            System.out.println("Go out");
        } else {
            System.out.println("Stay home");
        }

        // я сижу дома, если идет дождь или я устал или сейчас не вечер
        if(isRainy || iAmTired || !isEvening) {
            System.out.println("Stay home");
        } else {
            System.out.println("Go out");
        }
    }
}
