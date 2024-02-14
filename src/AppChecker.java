public class AppChecker {
    public static void main(String[] args) {
        App android = new App("Calculator");
        App iphone = new App("Notes");
        AndroidApp androidApplication = new AndroidApp("application");
        IphoneApp iphoneApplication = new IphoneApp("application");

        androidApplication.runAndroidApp();
        android.appInfo();
        iphoneApplication.runIphoneApp();
        iphone.appInfo();
    }
}
