package com.evacipated.cardcrawl.modthespire.lib;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ByRef {
	/**
	 * cls is the uri for the class in Slay The Spire
	 * that is the type of the localvar we are taking by reference
	 * 
	 * likely to be "com.megacrit.cardcrawl.somethinggoeshere"
	 */
    String cls();
}
