import android.util.Slog;
import android.os.ServiceManager;
public class TestServer {
		private static final String TAG="TestServie";
		public static void main(String args[]) 
		{
				/*add service*/
				Slog.i(TAG, "add hello service");
				ServiceManager.addService("hello", new HelloService());
				while(true) {
					try {
							Thread.sleep(100);
						}catch (Exception e) {
							
						}
				}
		}
}