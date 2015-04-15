package aasolutions.assignment3;

import retrofit.Callback;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

public interface FileUploadService {
    public static final String BASE_URL = "http://192.168.49.8:8080/";

    @Multipart
    @POST("/upload")
    void upload(@Part("file") TypedFile file,
                @Part("title") String description,
                Callback<String> cb);
}