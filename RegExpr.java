package laba3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {

	private Pattern pattern;
	private Matcher matcher;

	public boolean validate(String testString, String s1, String s2) {
		Pattern p = Pattern.compile("\\" + s1 + "\\w*" + "\\" + s2);
		Matcher m = p.matcher(testString);
		return m.matches();
	}

	public static void main(String[] args) {
		String text = "raz (dva] tri";
		String[] s = text.split(" ");
		String s1, s2;
		boolean ch = false;
		RegExpr obj;
		obj = new RegExpr();
		Scanner inp = new Scanner(System.in);
		System.out
				.println("Введите между какими символами хотите удалить текст");
		System.out.println("Первый:");
		s1 = inp.nextLine();
		System.out.println("Второй:");
		s2 = inp.nextLine();
		for (int i = 0; i < s.length; i++)
			if (obj.validate(s[i], s1, s2) == true) {
				ch = true;
				break;
			} else
				ch = false;
		if (ch == true)
			System.out.println(text.replaceAll("\\" + s1 + "\\w*" + "\\" + s2,
					" "));
		else
			System.out.println("Нет ничего похожего");
	}

}
