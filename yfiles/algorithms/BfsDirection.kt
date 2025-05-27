// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [Bfs.getLayers]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsDirection">Online Documentation</a>
 */
external sealed class BfsDirection: YEnum<BfsDirection> {
   companion object: EnumMetadata<BfsDirection> {
       /**
 * An edge direction specifier for incoming edges.
 * 
 * Value - `1`
 * @see [Bfs.getLayers]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsDirection%23PREDECESSOR">Online Documentation</a>
 */
val PREDECESSOR: BfsDirection

/**
 * An edge direction specifier for outgoing edges.
 * 
 * Value - `2`
 * @see [Bfs.getLayers]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsDirection%23SUCCESSOR">Online Documentation</a>
 */
val SUCCESSOR: BfsDirection

/**
 * An edge direction specifier for an undirected search, following both incoming and outgoing edges.
 * 
 * Value - `3`
 * @see [Bfs.getLayers]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsDirection%23BOTH">Online Documentation</a>
 */
val BOTH: BfsDirection
   }
}
