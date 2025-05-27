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
 * Represents the connected components of a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectedComponentsResult">Online Documentation</a>
 */
external  class ConnectedComponentsResult 
private constructor () : YObject {

/**
 * Gets a collection of all connected components in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectedComponentsResult%23components">Online Documentation</a>
 */
final val components: ResultItemCollection<Component>
/**
 * Gets a map which returns for each node the ID of the component the node belongs to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectedComponentsResult%23nodeComponentIds">Online Documentation</a>
 */
final val nodeComponentIds: ResultItemMapping<INode, Int>
/**
 * Gets a map which returns for each node the [component][Component] the node belongs to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectedComponentsResult%23nodeComponents">Online Documentation</a>
 */
final val nodeComponents: ResultItemMapping<INode, Component>

companion object : ClassMetadata<ConnectedComponentsResult> {
}
}
