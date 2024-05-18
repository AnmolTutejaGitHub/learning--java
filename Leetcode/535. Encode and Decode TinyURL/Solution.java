// package Leetcode.535. Encode and Decode TinyURL;
class Codec {

    static String original = "";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        original = longUrl;
        return "http://tinyurl.com/" + longUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return original;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
