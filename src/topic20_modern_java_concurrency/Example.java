package topic20_modern_java_concurrency;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

/**
 * Example: Asynchronous API call using CompletableFuture and Virtual Threads executor.
 */
public class Example {
    public CompletableFuture<String> fetchWebPageAsync(String url) {
        // Using modern virtual thread per task executor
        var executor = Executors.newVirtualThreadPerTaskExecutor();
        
        return CompletableFuture.supplyAsync(() -> {
            try {
                HttpClient client = HttpClient.newBuilder().executor(executor).build();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
                return client.send(request, HttpResponse.BodyHandlers.ofString()).body();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }, executor);
    }
}
