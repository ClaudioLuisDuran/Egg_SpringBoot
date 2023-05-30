
import java.time.Instant;
import java.util.Date;
import javax.xml.ws.Response;



public class BinanceApiExample {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.binance.com/api/v3/klines?symbol=BTCUSDT&interval=1h&limit=2")
                .build();

        Response response = client.newCall(request).execute();
        String responseString = response.body().string();
        // Parse the response JSON
        JSONObject responseJson = new JSONObject(responseString);
        JSONObject lastCandle = responseJson.getJSONArray("klines").getJSONObject(0);
        JSONObject prevCandle = responseJson.getJSONArray("klines").getJSONObject(1);
        // Get the close price of the last candle and the time of the next hour
        double lastClosePrice = lastCandle.getDouble(4);
        long nextHourTimestamp = lastCandle.getLong(6) + 3600_000;
        // Compute the price change percentage of the last hour
        double prevClosePrice = prevCandle.getDouble(4);
        double priceChangePercentage = (lastClosePrice - prevClosePrice) / prevClosePrice;
        // Compute the predicted price of the next hour
        double predictedPrice = lastClosePrice * (1 + priceChangePercentage);
        // Print the results
        System.out.println("Current Bitcoin price: " + lastClosePrice);
        System.out.println("Predicted Bitcoin price in 1 hour: " + predictedPrice);
        System.out.println("Next hour timestamp: " + Date.from(Instant.ofEpochMilli(nextHourTimestamp)));
    }
        }