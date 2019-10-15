package demo.eric.fragdemo.network;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;

/**
 * Created by caoqiulin on 2019-09-27.
 */
public class NetWorkManager {

    private static NetWorkManager mInstance;
    private static Retrofit retrofit;
    private static volatile Request request = null;

    public static NetWorkManager getInstance() {
        if (null == mInstance) {
            synchronized (NetWorkManager.class) {
                if (mInstance == null) {
                    mInstance = new NetWorkManager();
                }
            }
        }
        return mInstance;
    }

    public void init() {
        // 初始化okhttp
        OkHttpClient client = new OkHttpClient().newBuilder().build();


        // 初始化retrofit
//        retrofit = new Retrofit().newBuilder()
//                .client(client)
//                .baseUrl("")
//                .validateEagerly(false)
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
    }

    public static Request getRequest(){
        if (request == null) {
            synchronized (Request.class) {
                request = retrofit.create(Request.class);
            }
        }
        return  request;
    }

}
