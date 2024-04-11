public class rgb_to_hex {
    // public method takes in String[] args and returns nothing
    public static void main(String[] args) {
        // initialize r, g, and b
        int r = 255;
        int g = 127;
        int b = 0;
        
        // initialize hexColor as the returned value from rgbToHex()
        String hexColor = rgbToHex(r, g, b);
        
        // print out the values
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    public static String rgbToHex(int r, int g, int b) {
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


