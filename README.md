# ModTheSpireLib

**ModTheSpireLib** is a library used by the [ModTheSpire](https://github.com/kiooeht/ModTheSpire) project to provide annotations that indicate how to patch the main game jar file for **Slay The Spire**

## General Idea

**ModTheSpire** looks at all the jar files in the `mods/` folder and finds every class that has a `SpirePatch` annotation. This means that any time you want to make a patch for Slay The Spire you need to create a new class and annotate it with a `SpirePatch` annotation that includes the class uri in the `cls` field and the name of the method that you want to patch in the `method` field. Additionally the `SpirePatch` annotation allows you to read the parameters of the method you're patching using the `paramtypes` field.

After finding the classes that are annotated as patches, **ModTheSpire** can handle three different types of patching:
* Prefix
* Postfix
* Insert

## Prefix

Prefix patching is done by naming your method `Prefix` and then **ModTheSpire** will inject your code at the *start* of the method you are patching

## Postfix

Postfix patching is done by naming your method `Postfix` and then **ModTheSpire** will inject your code at the *end* of the method you are patching

## Insert

Insert patching is the most complex of the patching methods because it allows for code injection into any point within the method and for accessing local variables internal to the method. It requires another annotation from **ModTheSpireLib**. By naming your method `Insert` and adding a `SpireInsertPatch` annotation to it with the line number where the patch should be inserted in the `loc` field and an array of the local variables to be used by your method in the `localvars` field, **ModTheSpire** will be able to inject your code at **the beginning** of the line number you specified.

To figure out the line numbers you need just decompile **Slay The Spire** with a Java decompiler.