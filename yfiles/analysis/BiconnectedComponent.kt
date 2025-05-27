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
 * A single biconnected component, composed of the [nodes][BiconnectedComponent] and [edges][BiconnectedComponent] which belong to this component and its [articulation points][BiconnectedComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponent">Online Documentation</a>
 */
external class BiconnectedComponent private constructor()  {
  /**
   * Gets a collection of all articulation points that belong to this component.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponent%23articulationNodes">Online Documentation</a>
   */
  final val articulationNodes: ResultItemCollection<INode>
  
  /**
   * Gets a collection of all edges which belong to this component.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponent%23edges">Online Documentation</a>
   */
  final val edges: ResultItemCollection<IEdge>
  
  /**
   * Gets a collection of all nodes that belong to this component.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponent%23nodes">Online Documentation</a>
   */
  final val nodes: ResultItemCollection<INode>
  
  companion object : ClassMetadata<BiconnectedComponent> {
  }
}
