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
 * Represents the longest directed path in an acyclic graph as computed by [LongestPath].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LongestPathResult">Online Documentation</a>
 */
external  class LongestPathResult 
private constructor () : YObject {

/**
 * Gets the path's length.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LongestPathResult%23distance">Online Documentation</a>
 */
final val distance: Double
/**
 * Gets the path's edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LongestPathResult%23edges">Online Documentation</a>
 */
final val edges: ResultItemCollection<IEdge>
/**
 * Gets the path's nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LongestPathResult%23nodes">Online Documentation</a>
 */
final val nodes: ResultItemCollection<INode>
/**
 * Gets the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LongestPathResult%23path">Online Documentation</a>
 */
final val path: Path?

companion object : ClassMetadata<LongestPathResult> {
}
}
