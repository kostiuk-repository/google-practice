# Hard_03_WebCrawlerCompletableFuture — Довідка

## Technique: Non-blocking Asynchronous Design

Implement a web crawler that scans links up to a maximum depth asynchronously using HttpClient and CompletableFuture.

### Code Snippet:
```java
client.sendAsync(request, BodyHandlers.ofString()).orTimeout(3, TimeUnit.SECONDS);
```

## Drills

1. **Hard_03_WebCrawlerCompletableFuture_01** — Sending asynchronous non-blocking HTTP requests using HttpClient.sendAsync.\n2. **Hard_03_WebCrawlerCompletableFuture_02** — Parsing href tags asynchronously from HTTP response bodies.\n3. **Hard_03_WebCrawlerCompletableFuture_03** — Traversing paths recursively and combining future lists.\n4. **Hard_03_WebCrawlerCompletableFuture_04** — Throttling parallel connection rates using a non-blocking Semaphore wrapper.\n5. **Hard_03_WebCrawlerCompletableFuture_05** — Applying asynchronous request timeouts via orTimeout().\n
Solve drills sequentially from 01 to 05. Do not peak at Hard_03_WebCrawlerCompletableFuture.java.
