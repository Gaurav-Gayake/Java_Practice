package java_Basics;
public class LoopConcept {

public static void main(String[] args) {

// for loop
for (int i = 1; i <= 5; i++) {
System.out.println(i);
}
System.out.println("=====End of for loop=====");

// for each loop - for array traversing
Object a[] = { "Selenium", 10.5, 3 > 12, 'c', 5 };
int count = 0;
for (Object b : a) {
if (count == 3) {
break;
}
System.out.println(b);
count++;
}
System.out.println("=====End of for each loop=====");

}

}
