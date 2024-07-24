import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Pan {
private static String generate(String word) {
char middle = word.charAt(0);
int e=0;
Map<Integer,Character> sub = new HashMap<>();
for(char i='a';i<='z';i++) {
sub.put(e++,i);
}
StringBuilder sb = new StringBuilder();
StringBuilder sb1 = new StringBuilder();
for(int j=0;j<4;j++) {
sb.append(sub.get((int)Math.floor(Math.random()*25)));
sb1.append((int)Math.floor(Math.random()*9));
}
int num = Integer.parseInt(sb1.toString());
char last = 0 ;
if(num>=1000) {
last = 'K';
}
if(num <= 999) {
last = 'H';
}
if(num <=99) {
last = 'T';
}
if(num <= 9) {
   last = 'O';
}
String pancard = sb.toString().toUpperCase() + middle + sb1.toString()+ last;
return pancard;
}

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner d = new Scanner(System.in);
System.out.println("ENTER THE NAME");
String a = d.next();
String b = generate(a.toUpperCase());
Set<String> sub = new HashSet<>();
boolean flag = true;
while(flag) {
if(sub.contains(b)) {
b = generate(a.toUpperCase());
}
else {
flag = false;
sub.add(b);

}
}
System.out.println("THE PANCARD GENERATED FOR THE USER IS:"+b);
}

}