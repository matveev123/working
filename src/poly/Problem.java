public class Problem {
    public static void main(String[]args) {
        GenericFile genericFile = new TextFile();
        genericFile.writeContent("123");
		genericFile.height; // в superclas не будет переменных,которые есть в subclass 

    }
}
// Polypothism Subtyping = upcast + override();
// RTTI = when downcat, use instanceof

// String str = "2" + 2; -  implicit type conversion <- coercion

// String str = "2" + 2; - concatenation(конкаценация)

// int i = 2 + 2; operator overload; всё зависит от контекста




class GenericFile {
    String content;
	String megacontent; // тут

    void writeContent(String content) {// do final method or ise composition(preferred)
	int megacontent = 100; // и тут
        this.content = content;
    }

    /*String toString(String str) {
    return str.toStiring();
    }
     */
    void toString(String str) {// Fragile
        writeContent(str);
    }
}

class TextFile extends GenericFile {
	private int height;
	private int width;
	
/*     @Override
    void writeContent(String content) {
        toString(content);
    } */

}


