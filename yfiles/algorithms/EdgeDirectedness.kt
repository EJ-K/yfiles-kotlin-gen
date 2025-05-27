// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.algorithms

@JsName("Number")
external class EdgeDirectedness
private constructor()

inline fun EdgeDirectedness(value: Double): EdgeDirectedness = 
    value.unsafeCast<EdgeDirectedness>()

object EdgeDirectednesses {
    inline val SOURCE_TO_TARGET: EdgeDirectedness
        get() = EdgeDirectedness(1.0)
    inline val TARGET_TO_SOURCE: EdgeDirectedness
        get() = EdgeDirectedness(-1.0)
    inline val UNDIRECTED: EdgeDirectedness
        get() = EdgeDirectedness(0.0)
}
