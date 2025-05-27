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
 * Object insertion specifier.
 * @see [Edge]
 * @see [Graph.changeEdge]
 * @see [Graph.createEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementInsertion">Online Documentation</a>
 */
external sealed class GraphElementInsertion: YEnum<GraphElementInsertion> {
   companion object: EnumMetadata<GraphElementInsertion> {
       /**
 * Object insertion specifier.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementInsertion%23AFTER">Online Documentation</a>
 */
val AFTER: GraphElementInsertion

/**
 * Object insertion specifier.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphElementInsertion%23BEFORE">Online Documentation</a>
 */
val BEFORE: GraphElementInsertion
   }
}
