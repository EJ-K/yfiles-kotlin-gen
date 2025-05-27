// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.lang

import yfiles.lang.yclass

inline fun <reified T: YObject> classMetadata(): IClassMetadata<T> = 
    classMetadata(T::class.js.yclass)
    
fun <T: YObject> classMetadata(yclass: YClass<T>): IClassMetadata<T> = 
    SimpleClassMetadata(yclass)    
    
private class SimpleClassMetadata<T: YObject>(
    override val yclass: YClass<T>
): IClassMetadata<T>
