public class Menus {

    private static boolean Play = false;
    private static boolean Pause = false;
    private static boolean Menu = true;
    private static boolean Victory = false;
    private static boolean Losing = false;
    private static Integer lives = new Integer(5);


    public static Integer getLives(){
        return lives;
    }

    public static void decreaseLives(){
        lives--;
    }

    public static boolean Play(){
        return Play;
    }

    public static boolean Pause(){
        return Pause;
    }

    public static boolean Menu(){
        return Menu;
    }

    public static boolean Victory(){
        return Victory;
    }

    public static boolean Losing(){
        return Losing;
    }

    public static void showPlay(){
        Play = true;
    }

    public static void hidePlay(){
        Play = false;
    }

    public static void showPause(){
        Pause = true;
    }

    public static void hidePause(){
        Pause = false;
    }

    public static void showMenu(){
        Menu = true;
    }

    public static void hideMenu(){
        Menu = false;
    }

    public static void showVictory(){
        Victory = true;
    }

    public static void hideVictory(){
        Victory = false;
    }

    public static void showLosing(){
        Losing = true;
    }

    public static void hideLosing(){
        Losing = false;
    }

    public static void togglePlay(){
        if(Play){
            Play = false;
        }
        else {
            Play = true;
        }
    }

    public static void togglePause(){
        if(Pause){
            Pause = false;
        }
        else {
            Pause = true;
        }
    }

    public static void toggleMenu(){
        if(Menu){
            Menu = false;
        }
        else {
            Menu = true;
        }
    }

    public static void toggleVictory(){
        if(Victory){
            Victory = false;
        }
        else {
            Victory = true;
        }
    }

    public static void toggleLosing(){
        if(Losing){
            Losing = false;
        }
        else {
            Losing = true;
        }
    }
}
