// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.lang

external interface YFlags<T: YFlags<T>>

inline val YFlags<*>.value:Int
   get() = unsafeCast<Int>()

inline infix fun <T : YFlags<T>> T.or(other: T): T =
    (value or other.value).unsafeCast<T>()

inline operator fun <T : YFlags<T>> T.contains(other: T): Boolean =
    (value and other.value) == other.value
