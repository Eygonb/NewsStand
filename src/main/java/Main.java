import org.di.Application;
import org.di.ApplicationContext;

public class Main {
    private static final String[] packages = new String[]{};

    public static void main(String[] args) {
        ApplicationContext context = Application.run(packages);
    }
}
