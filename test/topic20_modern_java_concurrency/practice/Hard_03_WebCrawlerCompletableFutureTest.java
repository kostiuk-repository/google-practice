package topic20_modern_java_concurrency.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class Hard_03_WebCrawlerCompletableFutureTest {
    @Test
    public void testWebCrawler() throws Exception {
        Hard_03_WebCrawlerCompletableFuture crawler = new Hard_03_WebCrawlerCompletableFuture();
        // Just verify basic future instancing
        var future = crawler.crawlAsync("https://example.com", 1);
        assertNotNull(future);
    }
}
