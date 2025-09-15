package cn.edu.swjtu;

public class AqiClassifier {
    public String getAqiLevel(int aqi) {
        if (aqi < 0 || aqi > 500) {
            throw new IllegalArgumentException("AQI out of range: " + aqi);
        }
        if (aqi <= 50) {
            return "优";
        } else if (aqi <= 100) {
            return "良";
        } else if (aqi <= 150) {
            return "轻度污染";
        } else if (aqi <= 200) {
            return "中度污染";
        } else if (aqi <= 300) {
            return "重度污染";
        } else {
            return "严重污染";
        }
    }
}
