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
 * Represents the node centrality values as computed by [GraphCentrality].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentralityResult">Online Documentation</a>
 */
external  class GraphCentralityResult 
private constructor () : YObject {

/**
 * Gets the maximum absolute node centrality value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentralityResult%23maximumNodeCentrality">Online Documentation</a>
 */
final val maximumNodeCentrality: Double
/**
 * Gets the minimum absolute node centrality value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentralityResult%23minimumNodeCentrality">Online Documentation</a>
 */
final val minimumNodeCentrality: Double
/**
 * Gets a mapping from each node to its centrality value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentralityResult%23nodeCentrality">Online Documentation</a>
 */
final val nodeCentrality: ResultItemMapping<INode, Double>
/**
 * Gets a mapping from each node to its normalized centrality value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentralityResult%23normalizedNodeCentrality">Online Documentation</a>
 */
final val normalizedNodeCentrality: ResultItemMapping<INode, Double>

companion object : ClassMetadata<GraphCentralityResult> {
}
}
