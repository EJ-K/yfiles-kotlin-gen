// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.styles

@JsName("Object")
external class Converters
private constructor()

inline operator fun Converters.invoke(
    block: Converters.() -> Unit
): Converters =
   apply(block)

fun <V, R : Any> Converters.put(
    name: String,
    converter: (value: V) -> R
): Converters {
    asDynamic()[name] = converter
    return this
}

fun <V, P: String?, R : Any> Converters.put(
    name: String,
    converter: (value: V, parameter: P) -> R
): Converters {
    asDynamic()[name] = converter
    return this
}
