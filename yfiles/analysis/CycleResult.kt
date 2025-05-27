// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents a cycle's nodes and edges as found by [Cycle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleResult">Online Documentation</a>
 */
external  class CycleResult 
private constructor () : YObject {

/**
 * Gets the edges of the cycle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleResult%23edges">Online Documentation</a>
 */
final val edges: ResultItemCollection<IEdge>
/**
 * Gets a collection of nodes in the cycle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleResult%23nodes">Online Documentation</a>
 */
final val nodes: ResultItemCollection<INode>

companion object : ClassMetadata<CycleResult> {
}
}
