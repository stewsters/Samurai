package com.stewsters.samurai;

import java.util.Random;

import com.stewsters.samurai.enums.Gender;
import com.stewsters.samurai.enums.SocialClass;

public class NameGenerator
{

	public static boolean female = false;
	public static boolean male = true;

	public static String getName(SocialClass type, Gender gender)
	{
		Random r = new Random();
		String name = "none";
		if (type == SocialClass.SAMURAI)
		{
			name = samuraiFamilyNames[r.nextInt(NameGenerator.samuraiFamilyNames.length)]
                 +" " + samuraiGivenNames[r.nextInt(NameGenerator.samuraiGivenNames.length)];
		}
		return name;
	}

/*	public static void printString()
	{
		ArrayList<String> family = new ArrayList<String>();
		ArrayList<String> given = new ArrayList<String>();

		for (String name : samuraiFamilyNames)
		{
			String[] nameArray = name.split(" ");
			if (!family.contains(nameArray[0]))
				family.add(nameArray[0]);
			if (!given.contains(nameArray[1]))
				given.add(nameArray[1]);
		}

		System.out.println("family");
		for (String famName : family)
		{
			System.out.println("\"" + famName + "\",");
		}

		System.out.println("given");
		for (String givName : given)
		{
			System.out.println("\"" + givName + "\",");
		}
	}
*/
	// family name, given name
	static String[] samuraiFamilyNames =
	{ "Abe", "Adachi", "Aiou", "Marise", "Ayame", "Akechi", "Akao", "Amago",
			"Ankokuji", "Aochi", "Aokage", "Aoki", "Arai", "Araki", "Arima",
			"Asakura", "Azai", "Baba", "Bessho", "Chosokabe", "Date", "Doi",
			"Endo", "Enjoji", "Enomoto", "Era", "Fuwa", "Gamo", "Harada",
			"Hasekura", "Hattori", "Hashiba", "Hatano", "Hasegawa",
			"Hayashizaki", "Hirate", "Hitotsubashi", "Hōjō", "Honda",
			"Hosokawa", "Hotta", "Ii", "Iizasa", "Ijuin", "Imagawa", "Imai",
			"Inugami", "Ishida", "Isshiki", "Itagaki", "Ito", "Iwanari",
			"Jinbo", "Kaneko", "Katagiri", "Kataoka", "Kato", "Kawakami",
			"Kido", "Kikkawa", "Kimotsuki", "Kobayakawa", "Kuroda", "Kusunoki",
			"Kuwana", "Kumagai", "Maeda", "Magome", "Manabe", "Matsudaira",
			"Matsunaga", "Matsuo", "Miura", "Miyamoto", "Miyoshi", "Mizuno",
			"Moniwa", "Mori", "Nagakura", "Nagao", "Nakagawa", "Nakajima",
			"Nanbu", "Naoe", "Nihonmatsu", "Niimi", "Niiro", "Niwa", "Oda",
			"Ogasawara", "Oishi", "Judge", "Okita", "Okubo", "Okunomiya",
			"Ōuchi", "Reizei", "Rokkaku", "Rusu", "Sagara", "Saigō", "Saitō",
			"Saito", "Sakai", "Sakamoto", "Sakuma", "Sanada", "Sasaki",
			"Serizawa", "Shibata", "Shima", "Shimada", "Shimazu", "Shindou",
			"Sogo", "Taigen", "Taira", "Takahashi", "Takasugi", "Takayama",
			"Takeda", "Tani", "Toki", "Tokugawa", "Toyotomi", "Tsukahara",
			"Uesugi", "Ujiie", "Ukita", "Umezawa", "Usami", "Uyama", "Wada",
			"Watanabe", "Yagyu", "Yamada", "Yamagata", "Yamanami",
			"Yanagisawa", "Yonekura", "Yamauchi" };

	static String[] samuraiGivenNames =
	{ "Katsuyoshi", "Masakatsu", "Yasumori", "Kagemori", "Mototsuna",
			"Kagekatsu", "Mitsuhide", "Kiyotsuna", "Haruhisa", "Yoshihisa",
			"Ekei", "Shigetsuna", "Takaakira", "Kazushige", "Hakuseki",
			"Motokiyo", "Murashige", "Muratsugu", "Kihei", "Yoshikage",
			"Hisamasa", "Nagamasa", "Sukemasa", "Nobufusa", "Nagaharu",
			"Morichika", "Motochika", "Nobuchika", "Masamune", "Toshikatsu",
			"Naotsune", "Nobutane", "Takeaki", "Fusahide", "Mitsuharu",
			"Katahide", "Ujisato", "Naomasa", "Tsunenaga", "Hanzo",
			"Hideyoshi", "Hideharu", "Eishin", "Jinsuke", "Masahide", "Keiki",
			"Masako", "Tokimune", "Ujiyasu", "Tadakatsu", "Fujitaka", "Gracia",
			"Tadaoki", "Masatoshi", "Naoaki", "Naomori", "Naonaka", "Naosuke",
			"Naotaka", "Naoyuki", "Naozumi", "Ienao", "Tada'aki", "Yoshimoto",
			"Kanehira", "Nagakatsu", "Mitsunari", "Fujinaga", "Nobukata",
			"Hirobumi", "Tomomichi", "Kiyoshige", "Nagakiyo", "Nagamoto",
			"Nagatsuna", "Yoshikata", "Ietada", "Katsumoto", "Mitsumasa",
			"Kiyomasa", "Gensai", "Takayoshi", "Hiroie", "Kanetsugu",
			"Hideaki", "Hidekane", "Takakage", "Hanbei", "Kiyotaka",
			"Yoshitaka", "Masashige", "Tarozaemon", "Naozane", "Keiji",
			"Nagatane", "Toshiie", "Toshinaga", "Toshitsune", "Kageyu",
			"Akifusa", "Nobutsuna", "Higo", "Sadanobu", "Teru", "Hisahide",
			"Hisamichi", "Bashō", "Motoyasu", "Anjin", "Musashi", "Chokei",
			"Kazuhide", "Masaga", "Masayasu", "Moriyata", "Nagayuki",
			"Yoshitsugu", "Tadakuni", "Yoshinao", "Motonari", "Nagasada",
			"Nagayoshi", "Okimoto", "Ranmaru", "Takamoto", "Tadamasa",
			"Terumoto", "Yoshinari", "Shinpachi", "Harukage", "Kagenobu",
			"Masakage", "Tamekage", "Kiyohide", "Bungo", "Yasunobu",
			"Kagetsuna", "Nishiki", "Tadamoto", "Nagahide", "Nagashige",
			"Hiroyoshi", "Nobuhide", "Nobukiyo", "Nobunaga", "Nobutada",
			"Nobutomo", "Nobukatsu", "Nobuyasu", "Shosai", "Kuranosuke",
			"Ooka", "Soji", "Toshimichi", "Masaie", "Takatoyo", "Sadayori",
			"Yoshiharu", "Taketo", "Takamori", "Dōsan", "Hajime", "Musashibo",
			"Yoshitatsu", "Tadakiyo", "Tadashige", "Tadayo", "Ryoma",
			"Morimasa", "Nobumori", "Masayuki", "Nobuyuki", "Yukimura",
			"Kojiro", "Kamo", "Katsuie", "Sakon", "Ichiro", "Katsuhisa",
			"Tadahisa", "Tadatsune", "Tadayoshi", "Takahisa", "Yoshihiro",
			"Hiroshii", "Nagayasu", "Sessai", "Kiyomori", "Masakado",
			"Shigetane", "Shinsaku", "Justo", "Ukon", "Katsuyori", "Nobushige",
			"Shingen", "Tadasumi", "Yorinari", "Ieyasu", "Hidetada", "Nariaki",
			"Yoshinobu", "Hideyori", "Bokuden", "Kagetora", "Kenshin",
			"Naomoto", "Naoie", "Okiie", "Michiharu", "Sadamitsu", "Hisanobu",
			"Shinsuke", "Tsuna", "Jubei", "Arinaga", "Arinobu", "Keisuke",
			"Yoshiyasu", "Shigetsugu", "Munenori", "Kazutoyo" };
}
