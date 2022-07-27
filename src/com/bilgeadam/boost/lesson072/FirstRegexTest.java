package com.bilgeadam.boost.lesson072;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;

class FirstRegexTest {

	@Test
	void givenText_WhenSimpleRegexMatches_ThenCorrect() {
		
		Pattern pattern = Pattern.compile("foo");
		Matcher matcher = pattern.matcher("foo");
		
		assertTrue(matcher.find());
	}
	
	@Test
	void givenText_WhenSimpleRegexMatchesTwice_ThenCorrect() {
		
		Pattern pattern = Pattern.compile("foo");
		Matcher matcher = pattern.matcher("foofoo");
		
		int matches = 0;
		while(matcher .find()) {
			matches++;
		}
		assertEquals(matches, 2);
	}

	@Test
	public static int runTest(String regex, String text) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		int matches = 0;
		while(matcher .find()) {
			matches++;
		}
		return matches;
	}
	
	@Test
	public void givenText_WhenMatchesWithoutDot_ThenCorrect() {
		
		int matches = runTest(".", "foo"); //nokta bütün karakterler için yer tutucu olarak çalışıyor	
		assertEquals(matches, 3);
	}
	
	@Test
	public void givenRepeatedText_WhenMatchesOnceWithoutDot_ThenCorrect() {
		
		int matches = runTest("foo.", "fooxfoox");
		assertEquals(2, matches);
	}
	
	@Test
	public void givenCharSet_WhenMatchesAny_ThenCorrect() {
		
		int matches = runTest("[xds]", "d"); //köşeli parantez içinde olunca hepsini ayrı ayrı arıyor
		assertEquals(1, matches);
	}
	
	@Test
	public void givenCharSet_WhenMatchesAll_ThenCorrect() {
		
		int matches = runTest("[xds]", "sxd"); //birden fazla karakterin eşleşme durumunu test ediyoruz
		assertEquals(3, matches);
	}
	
	@Test
	public void givenCharSet_WhenMatchesAllCombinations_ThenCorrect() {
		
		int matches = runTest("[bcr]at", "bat cat rat");
		assertEquals(3, matches);
	}
	
	@Test
	public void givenNotCharSet_WhenMatchesNon_ThenCorrect() {
		
		int matches = runTest("[^abc]","gac");
		assertEquals(1, matches);
	}
	
	@Test
	public void givenNotCharSet_WhenMatchesAllExceptElements_ThenCorrect() {
		
		int matches = runTest("[^bcr]at", "sat mat eat");
		assertEquals(3, matches);
		System.out.println(matches);
		System.out.println(matches);
	}
	
	@Test
	public void givenUpperCaseRange_WhenMatchesUpperCase_ThenCorrect() {
		
		int matches = runTest("[A-Z]", "Two UpperCase alphabets 34 overall");
		assertEquals(3, matches);
		System.out.println(matches);
		
	}
	
	@Test
	public void givenLowerCaseRange_WhenMatchesUpperCase_ThenCorrect() {
		
		int matches = runTest("[a-z]", "Two UpperCase alphabets 34 overall");
		assertEquals(25, matches);
		System.out.println(matches);
		
	}
	@Test
	public void givenBothLoweAndUpperCaseRange_WhenMatcheAllLetter_ThenCorrect() {
		
		int matches = runTest("[a-zA-Z]", "Two UpperCase alphabets 34 overall");
		assertEquals(28, matches);
		System.out.println(matches);
	}
	
	@Test
	public void givenNumberRange_WhenMatchesAccurately_ThenCorrect() {
		
		int matches = runTest("[1-5]", "Two UpperCase alphabets 34 overall");
		assertEquals(2, matches);
		System.out.println(matches);
	}

	@Test
	public void givenNumberRangeAgain_WhenMatchesAccurately_ThenCorrect() {
		
		int matches = runTest("[1-3[7-9]]", "123456789");
		assertEquals(6, matches);
		System.out.println(matches);
	}
	
	@Test
	public void givenTwoSets_WhenMatchesIntersection_ThenCorrect() {
		
		int matches = runTest("[1-6 && 3-9]", "123456789");
		assertEquals(4, matches);
		System.out.println(matches);
	}
	
	
	@Test
	public void givenSetSubstraction_WhenMatchesAccurately_ThenCorrect() {
		
		int matches = runTest("[0-9 && [^2468]]", "123456789");
		assertEquals(5, matches);
		System.out.println(matches);
	}
	//digits
	@Test
	public void givenDigits_WhenMatches_ThenCorrect() {
		
		int matches = runTest("\\d", "123");
		assertEquals(3, matches);
		System.out.println(matches);
	}
	//non-digits
	@Test
	public void givenNonDigits_WhenMatches_ThenCorrect() {
		
		int matches = runTest("\\D", "a1230d z,");
		assertEquals(5, matches);
		System.out.println(matches);
	}
	//Word "\\w" == a-z, A-Z, 0-9
	@Test
	public void givenWordCharacter_WhenMatches_ThenCorrect() {
		
		int matches = runTest("\\w", "hi1!"); //ünlem dışındakileri alıyor
		assertEquals(3, matches);
		System.out.println(matches);
	}
	
	@Test
	public void givenBraceQuantifier_WhenMatches_ThenCorrect() {
		
		int matches = runTest("a{3}", "aaaxxxxxxxxaaa");  //yanyana 3 tane a arıyor
		assertEquals(2, matches);
		System.out.println(matches);
		
	}
	
	@Test
	public void givenBraceQuantifierWithRange_WhenMatches_ThenCorrect() {
		
		int matches = runTest("a{2,3}", "aaaxxxxxxxxaaa");  //büyük olan sayıyı referans alıyor ararken
		assertEquals(2, matches);
		System.out.println(matches);

	}
	
	@Test
	public void givenBraceQuantifierWithRange_WhenMatchesLazily_ThenCorrect() {
		
		int matches = runTest("a{2,3}?", "aaaxxxxxxxxaaa");  //soru işareti koyulunca küçük olan sayıyı referans alıyor
		assertEquals(2, matches);
		System.out.println(matches);
	}
	
	@Test
	public void givenCapturingGruoup_WhenMatches_ThenCorrect() {
		
		int matches = runTest("(\\d\\d)", "12");  //iki tane yanyana rakamları arıyor
		assertEquals(1, matches);
		System.out.println(matches);
	}
	
	@Test
	public void givenCapturingGruoupAgain_WhenMatches_ThenCorrect() {
		
		int matches = runTest("(\\d\\d)", "1212");  //iki tane yanyana rakamları arıyor
		assertEquals(2, matches);
		System.out.println(matches);
	}
	
	@Test
	public void givenCapturingGruoup_WhenMatchesWithReference_ThenCorrect() {
		
		int matches = runTest("(\\d\\d)\\1", "1212");  //search regex in 1 kez tekrar ettiğini gösteriyor 2x2 = 4 4 1 tane olduğu için 1 çıkıyor
		assertEquals(1, matches);
		System.out.println(matches);
	}
}
