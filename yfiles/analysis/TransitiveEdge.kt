// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents a placeholder for an edge that does not yet exist in a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdge">Online Documentation</a>
 */
external  class TransitiveEdge 
private constructor () : YObject {

/**
 * The source node of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdge%23source">Online Documentation</a>
 */
final val source: INode
/**
 * The target node of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdge%23target">Online Documentation</a>
 */
final val target: INode

companion object : ClassMetadata<TransitiveEdge> {
}
}
