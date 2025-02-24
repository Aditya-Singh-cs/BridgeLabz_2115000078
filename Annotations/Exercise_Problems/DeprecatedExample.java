// Legacy API with deprecated method
class LegacyAPI {
    @Deprecated
    void oldFeature() {
        System.out.println("This is an old feature and should not be used.");
    }

    void newFeature() {
        System.out.println("This is the new recommended feature.");
    }
}

public class DeprecatedExample {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        
        api.oldFeature(); // This will show a deprecation warning
        api.newFeature(); // Preferred method
    }
}
