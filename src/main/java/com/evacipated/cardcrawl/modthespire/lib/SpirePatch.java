package com.evacipated.cardcrawl.modthespire.lib;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * Annotation to designate a class as a patch for
 * Slay The Spire
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SpirePatch {
	/**
	 * cls is the uri for the class in Slay The Spire
	 * to be patched
	 * 
	 * likely to be "com.megacrit.cardcrawl.somethinggoeshere"
	 */
    String cls();
    
    /**
     * method is the name of the method in the Slay The Spire
     * class that is going to be patched
     */
    String method();
    
    /**
     * paramtypes is a list of the parameter types that make
     * up the method signature of the method in Slay The Spire
     * that you are trying to patch
     */
    String[] paramtypes() default {"DEFAULT"};
}
