package com.evacipated.cardcrawl.modthespire.lib;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * Annotation to provide the necessary information
 * for an Insert patch to work
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SpireInsertPatch {
	/**
	 * loc is the location in the Slay The Spire
	 * file to insert the patch (loc is a line number)
	 * 
	 * line numbers can be found by decompiling the game source
	 */
    int loc() default -1;
    
    /**
     * rloc is a relative line number in the Slay The Spire
     * file to inser the patch
     * 
     * it starts numbering at the beginning of the method
     * rather than the beginning of the file
     */
    int rloc() default -1;
    
    /**
     * localvars is a list of local variables in the method
     * to be patched that your patch needs access to
     */
    String[] localvars() default {};
}
