import java.util.*;

public class StringLenth {
public static void main(String args[])
{
	String s ="I Love India";
	System.out.println(Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));
}
}
