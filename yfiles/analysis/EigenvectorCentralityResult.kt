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
 * Represents the node centrality values as computed by [EigenvectorCentrality].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EigenvectorCentralityResult">Online Documentation</a>
 */
external  class EigenvectorCentralityResult 
private constructor () : YObject {

/**
 * Gets whether a valid result could be obtained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EigenvectorCentralityResult%23isValid">Online Documentation</a>
 */
final val isValid: Boolean
/**
 * Gets a mapping from each node to its centrality value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EigenvectorCentralityResult%23nodeCentrality">Online Documentation</a>
 */
final val nodeCentrality: ResultItemMapping<INode, Double>

companion object : ClassMetadata<EigenvectorCentralityResult> {
}
}
