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

/**
 * Represents the results of a breadth-first search as computed by [Bfs].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsResult">Online Documentation</a>
 */
external class BfsResult private constructor()  {
  /**
   * Gets a collection of all layers.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsResult%23layers">Online Documentation</a>
   */
  final val layers: ResultItemCollection<BfsLayer>
  
  /**
   * Gets a mapping from each node to its layer index.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsResult%23nodeLayerIds">Online Documentation</a>
   */
  final val nodeLayerIds: ResultItemMapping<INode, Int>
  
  /**
   * Gets a mapping from each node to its layer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsResult%23nodeLayers">Online Documentation</a>
   */
  final val nodeLayers: ResultItemMapping<INode, BfsLayer>
  
  /**
   * Gets a collection of nodes that are either not reachable from the [coreNodes][Bfs] or which are in layers beyond the [layerCount][Bfs].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsResult%23unreachableNodes">Online Documentation</a>
   */
  final val unreachableNodes: ResultItemCollection<INode>
  
  companion object : ClassMetadata<BfsResult> {
  }
}
