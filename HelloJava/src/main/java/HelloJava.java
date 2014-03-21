import org.robovm.cocoatouch.coregraphics.CGPoint;
import org.robovm.cocoatouch.coregraphics.CGRect;
import org.robovm.cocoatouch.foundation.NSAutoreleasePool;
import org.robovm.cocoatouch.foundation.NSDictionary;
import org.robovm.cocoatouch.uikit.*;

public class HelloJava extends UIApplicationDelegate.Adapter {

    private UIWindow window;

    public static void main(String[] args) throws Exception {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(args, null, HelloJava.class);
        pool.drain();
    }

    @Override
    public boolean didFinishLaunching(UIApplication application, NSDictionary launchOptions) {

        UILabel title = new UILabel(new CGRect(0, 0, 200, 100));
        title.setText("Hello Robo From Java!");

        window = new UIWindow(UIScreen.getMainScreen().getBounds());
        window.setBackgroundColor(UIColor.lightGrayColor());
        window.addSubview(title);

        CGRect bounds = title.getSuperview().getBounds();
        title.setCenter(new CGPoint(bounds.origin().x() + bounds.size().width() / 2, bounds.origin().y() + bounds.size().height() / 2));

        window.makeKeyAndVisible();

        return true;
    }
}
