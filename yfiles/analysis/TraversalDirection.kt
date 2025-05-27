// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Specifies constants for defining the search direction along edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TraversalDirection">Online Documentation</a>
 */
external sealed class TraversalDirection: YEnum<TraversalDirection> {
   companion object: EnumMetadata<TraversalDirection> {
       /**
 * Only search along incoming edges.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TraversalDirection%23PREDECESSOR">Online Documentation</a>
 */
val PREDECESSOR: TraversalDirection

/**
 * Only search along outgoing edges.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TraversalDirection%23SUCCESSOR">Online Documentation</a>
 */
val SUCCESSOR: TraversalDirection

/**
 * Search along incoming and then along outgoing edges and combine the results.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TraversalDirection%23BOTH">Online Documentation</a>
 */
val BOTH: TraversalDirection

/**
 * Ignore direction and search along both incoming and outgoing edges.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TraversalDirection%23UNDIRECTED">Online Documentation</a>
 */
val UNDIRECTED: TraversalDirection
   }
}
