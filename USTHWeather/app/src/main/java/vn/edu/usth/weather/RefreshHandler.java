package vn.edu.usth.weather;
import android.os.Bundle;
import android.os.Message;
import android.os.Handler;
public class RefreshHandler {
    private Handler handler;
    public RefreshHandler(Handler handler)
    {
        this.handler = handler;
    }
    public void NetworkRequest() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                Bundle bundle = new Bundle();
                bundle.putString("server_response", "Minmin");
                Message msg = new Message();
                msg.setData(bundle);
                handler.sendMessage(msg);
            }
        });
        t.start();
    }
}