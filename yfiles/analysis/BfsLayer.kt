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
 * Represents a layer of nodes as a result of a [breadth-first search][Bfs].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsLayer">Online Documentation</a>
 */
external class BfsLayer private constructor()  {
  /**
   * Gets the layer's index within the result.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsLayer%23index">Online Documentation</a>
   */
  final val index: Int
  
  /**
   * Gets a collection of all nodes belonging to this layer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsLayer%23nodes">Online Documentation</a>
   */
  final val nodes: ResultItemCollection<INode>
  
  companion object : ClassMetadata<BfsLayer> {
  }
}
