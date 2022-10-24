/* public class Kata {
public static String rps(String p1, String p2) {
if (p1 == p2)
return "Draw!";
switch (p1) {
case "scissors":
if (p2 == "paper")
return "Player 1 won!";
else
return "Player 2 won!";
//break;
case "rock":
if (p2 == "scissors")
return "Player 1 won!";
else
return "Player 2 won!";
}
return "1";
}

public static void main(String[]args) {
System.out.println(new Kata().rps("pape", "paper"));
}
} */

/* public class Kata {
public static void main(String[]args) {
//if(x == 0)
//return x;
int x = -121;//3663
x = x*(-1);

int y = 0,z = 0,c = 10,d = 0;
while(x != y){
y = x % c;
c= c * 10;
z++;
}
char[] mas = new char[z];
y = 0;z = 0;c = 10;
while (x != y){
y = x % c;
d = c;
c =c * 10;
z++;
if(z > 1){
mas[z-1] = (char) ('0' + (y / (d/=10)));
if(z == 2)
mas[0]=(char) ('0' + (y%d));
}
}


for (int i = mas.length-1; i >= 0 ; i--)
if(mas[i] != mas[mas.length -1 - i])
System.out.println(" not poly ");//return false;
else
System.out.println(" poly! ");//return true;

//System.out.println("first = " + mas[i] + "\t and last = " + mas[mas.length-1-i] );

}
} */
public class Kata {
    public static void main(String[]args) {
        System.out.println(Kata.smash("hello", "world", "this", "is", "great"));
    }
    public static String smash(String...words) {
       if((words.length == 1))
        return words[0];
    if (words.length == 0)
      return "";
    String result = words[0] + " ";
        for (int i = 1; i < words.length-1; i++)
            result = result + words[i] + " ";
		result = result + words[words.length-1];
		return result;

    }
}

