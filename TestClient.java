import android.util.Slog;
import android.os.ServiceManager;
import android.os.IBinder;
public class TestClient {
		private static final String TAG="TestClient";
		public static void main(String args[]) 
		{
			
				if(args.length == 0) {
					System.out.println("Usage: hello [name]");
					return ;
				}
				if(args[0].equals("hello"))
				{
							/* get service*/
						IBinder binder =	ServiceManager.getService("hello");
						if(binder == null){
							System.out.println("can not get hello service");
							Slog.i(TAG, "can not get hello service");
							return ;
						}
						IHelloService svr = IHelloService.Stub.asInterface(binder);
						if(args.length == 1) {
							try {
								Slog.i(TAG, "call sayhello");
								svr.sayhello();
							}catch (Exception e){
							}
						} else 
						{	
								try{
									int cnt = svr.sayhello_to(args[1]);
									Slog.i(TAG, "call sayhello_to:"+args[1]+" cnt:"+cnt);
								}catch (Exception e){
							}
						}
						
				}				
			
		}
}