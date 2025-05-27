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

/**
 * Represents the strongly connected components of a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StronglyConnectedComponentsResult">Online Documentation</a>
 */
external class StronglyConnectedComponentsResult private constructor()  {
  /**
   * Gets a collection of the components in the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StronglyConnectedComponentsResult%23components">Online Documentation</a>
   */
  final val components: ResultItemCollection<ConnectedComponent>
  
  /**
   * Gets a collection of the edges which connect nodes in different components.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StronglyConnectedComponentsResult%23interComponentEdges">Online Documentation</a>
   */
  final val interComponentEdges: ResultItemCollection<IEdge>
  
  /**
   * Gets a map which returns for each node the ID of the component the node belongs to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StronglyConnectedComponentsResult%23nodeComponentIds">Online Documentation</a>
   */
  final val nodeComponentIds: ResultItemMapping<INode, Int>
  
  /**
   * Gets a map which returns for each node the [component][ConnectedComponent] the node belongs to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StronglyConnectedComponentsResult%23nodeComponents">Online Documentation</a>
   */
  final val nodeComponents: ResultItemMapping<INode, ConnectedComponent>
  
  companion object : ClassMetadata<StronglyConnectedComponentsResult> {
  }
}
