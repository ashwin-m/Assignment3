package aasolutions.assignment3;

import com.squareup.okhttp.OkHttpClient;

import org.apache.http.client.HttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

public class ServiceGenerator {

    // No need to instantiate this class.
    private ServiceGenerator() {
    }

    public static <S> S createService(Class<S> serviceClass, String baseUrl) {
        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(baseUrl)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setClient(new OkClient(new OkHttpClient()));

        RestAdapter adapter = builder.build();

        return adapter.create(serviceClass);
    }
}