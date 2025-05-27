// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata

/**
 * Facilitates decorating [IModelItem]s from an [IGraph] instance.
 * @see [nodes]
 * @see [NodeDecorator]
 * @see [edges]
 * @see [EdgeDecorator]
 * @see [labels]
 * @see [LabelDecorator]
 * @see [ports]
 * @see [PortDecorator]
 * @see [bends]
 * @see [BendDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [GraphDecorator] class.
 * @param [graph] The graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23GraphDecorator-constructor-GraphDecorator">Online Documentation</a>
 */
external class GraphDecorator (
  graph: IGraph,
)  {
  /**
   * Gets a [bends][GraphDecorator] instance that can be used to decorate the [IBend] instances in the graph that this decorator has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23bends">Online Documentation</a>
   */
  final val bends: BendDecorator
  
  /**
   * Gets an [edges][GraphDecorator] instance that can be used to decorate the [IEdge] instances in the graph that this decorator has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23edges">Online Documentation</a>
   */
  final val edges: EdgeDecorator
  
  /**
   * Gets a [labels][GraphDecorator] instance that can be used to decorate the [ILabel] instances in the graph that this decorator has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23labels">Online Documentation</a>
   */
  final val labels: LabelDecorator
  
  /**
   * Gets a [nodes][GraphDecorator] instance that can be used to decorate the [INode] instances in the graph that this decorator has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23nodes">Online Documentation</a>
   */
  final val nodes: NodeDecorator
  
  /**
   * Gets a [ports][GraphDecorator] instance that can be used to decorate the [IPort] instances in the graph that this decorator has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23ports">Online Documentation</a>
   */
  final val ports: PortDecorator
  
  companion object : ClassMetadata<GraphDecorator> {
  }
}

inline operator fun  GraphDecorator.invoke(
    block: GraphDecorator.() -> Unit
): GraphDecorator = apply(block)
