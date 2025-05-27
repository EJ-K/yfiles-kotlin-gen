// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.InterfaceMetadata

/**
 * A cursor interface for iterating over edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeCursor">Online Documentation</a>
 */
external interface IEdgeCursor : ICursor<Edge> {
/**
 * Moves the cursor to the cyclic next element of the underlying sequence.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeCursor%23IEdgeCursor-method-cyclicNext">Online Documentation</a>
 */
   fun cyclicNext()
/**
 * Moves the cursor to the cyclic previous element of the underlying sequence.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeCursor%23IEdgeCursor-method-cyclicPrev">Online Documentation</a>
 */
   fun cyclicPrev()

companion object : InterfaceMetadata<IEdgeCursor> {
}
}
