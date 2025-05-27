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
 * Represents the nodes that are reachable from a given set of other nodes as computed by [Reachability].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReachabilityResult">Online Documentation</a>
 */
external  class ReachabilityResult 
private constructor () : YObject {

/**
 * Gets a collection of nodes that are reachable from the [Reachability.startNodes].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReachabilityResult%23reachableNodes">Online Documentation</a>
 */
final val reachableNodes: ResultItemCollection<INode>
/**
 * Determines whether a given node is reachable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReachabilityResult%23ReachabilityResult-method-isReachable">Online Documentation</a>
 */
 final   fun isReachable( node: INode ):Boolean

companion object : ClassMetadata<ReachabilityResult> {
}
}
