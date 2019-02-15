package hex2Float;

/**
 * 16进制转float（注意高前低后/低前高后）
 */
public class Hex2Float {
    public static void main(String[] args) {
        String s = "4069999a";
        Float value = Float.intBitsToFloat(Integer.valueOf(s.trim(), 16));
        System.out.println(value);

        Float f = 3.65f;
        System.out.println(Integer.toHexString(Float.floatToIntBits(f)));
    }

}
