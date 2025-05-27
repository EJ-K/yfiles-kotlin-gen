// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.lang

@JsName("Object")
abstract external class InterfaceMetadata<T> internal constructor() : IClassMetadata<T>

inline fun jsInstanceOf(
   o: Any?, 
   type: InterfaceMetadata<*>
): Boolean =
    type.asDynamic().isInstance(o)

inline infix fun Any?.yIs(type: InterfaceMetadata<*>): Boolean =
    jsInstanceOf(this, type)

inline infix fun <T : Any> Any?.yOpt(type: InterfaceMetadata<T>): T? =
    if (yIs(type)) {
        unsafeCast<T>()
    } else {
        null
    }

inline infix fun <T : Any> Any?.yAs(type: InterfaceMetadata<T>): T {
   require(this yIs type)

   return unsafeCast<T>()
}
