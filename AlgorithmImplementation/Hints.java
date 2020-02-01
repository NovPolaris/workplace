// 基本类型转换
1. String s and int a
	a = Integer.parseInt(s);
	s = Integer.toString(a);

2. String s and char c
	c = s.charAt(i) or s.toCharArray();
	s = String.valueOf(c);

3. int a and char c
	c = (char)a [ACSII码] or 先转换成String再转换成char or (char)(a + 48);
	a = Integer.parseInt(c.toString());

// String常用方法
String.indexOf(target, startIndex); // target为String类型， startIndex可忽略

// List<List<...>> 转数组
res.toArray(new int[res.size()][res.get(0).size()]);

// 字典构造
public static final Character[] vowelsList ={'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
public static final HashSet<Character> vowels = new HashSet<>(Arrays.asList(vowelsList));

//十六进制字符串和十进制数字互相转换
int num = Integer.parseInt(s, 16);
String s = new String.format("%x", num); (%0n : 表示一共n位，不足左侧补0)