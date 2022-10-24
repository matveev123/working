import java.util;
public class PhoneNumber {
    private final short areaCode,prefix,lineNum;
    PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = checkRange(areaCode, 999, "area code");
            this.prefix = checkRange(prefix, 999, "prefix");
            this.lineNum = checkRange(lineNum, 9999, "line num");
    }
    private static short checkRange(int val, int max, String arg){
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ":" + val);
        return (short)val;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber)o;
        return pn.areaCode == areaCode && pn.prefix == prefix && pn.lineNum == lineNum;
    }
    public static void main(String[]args) {
		Map<PhoneNumber,String> m = new HashMap<>();
		m.put(new PhoneNumber(707,867,5309,"Jenny"));
	}
}
