// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.geometry.IPoint
import yfiles.lang.InterfaceMetadata
import yfiles.styles.IEdgeStyle

/**
 * The interface used to model edges in an [IGraph] implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdge">Online Documentation</a>
 */
external interface IEdge : IPortOwner, ILabelOwner, IModelItem {
  /**
   * Gets a collection of [bends][IBend] that describe the geometry of this edge.
   * @see [IGraph.addBend]
   * @see [IGraph.remove]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdge%23bends">Online Documentation</a>
   */
  val bends: IListEnumerable<IBend>
  
  /**
   * Determines whether an [edge][IEdge] is a self-loop, that is, it starts and ends at the same port owner.
   * @see [sourceNode]
   * @see [targetNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdge%23isSelfLoop">Online Documentation</a>
   */
  final val isSelfLoop: Boolean
  
  /**
   * Gets the source node for the given edge or `null`.
   * @throws InvalidOperationError If the edge's [sourcePort][IEdge] is not set or its [owner][IPort] is not an [INode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdge%23sourceNode">Online Documentation</a>
   */
  final val sourceNode: INode
  
  /**
   * Gets the source port instance this edge is connected to.
   * @throws InvalidOperationError if the edge has no source port.
   * @see [sourceNode]
   * @see [IGraph.setEdgePorts]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdge%23sourcePort">Online Documentation</a>
   */
  val sourcePort: IPort
  
  /**
   * Gets the style that is responsible for the visual representation of this edge in a [CanvasComponent][yfiles.view.CanvasComponent].
   * @see [IGraph.setStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdge%23style">Online Documentation</a>
   */
  val style: IEdgeStyle
  
  /**
   * Gets the target node for the given edge or `null`.
   * @throws InvalidOperationError If the edge's [targetPort][IEdge] is not set or its [owner][IPort] is not an [INode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdge%23targetNode">Online Documentation</a>
   */
  final val targetNode: INode
  
  /**
   * Gets the target port instance this edge is connected to.
   * @throws InvalidOperationError if the edge has no target port.
   * @see [targetNode]
   * @see [IGraph.setEdgePorts]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdge%23targetPort">Online Documentation</a>
   */
  val targetPort: IPort
  
  /**
   * Gets the opposite port owner of an [IEdge].
   * @param [owner] The owner of the port that the [IEdge] is connected to.
   * @return The owner of the opposite port.
   * @throws ArgumentError If `owner` is neither the source nor target of the edge.
   * @see [sourcePort]
   * @see [targetPort]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdge%23IEdge-defaultmethod-opposite(IPortOwner)">Online Documentation</a>
   */
  final fun opposite(
    owner: IPortOwner,
  ): IPortOwner = definedExternally
  
  /**
   * Gets the opposite port of an [IEdge].
   * @param [port] The port that the [IEdge] is connected to.
   * @return The opposite port.
   * @throws ArgumentError If `port` is neither the source nor target of the edge.
   * @see [sourcePort]
   * @see [targetPort]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdge%23IEdge-defaultmethod-opposite(IPort)">Online Documentation</a>
   */
  final fun opposite(
    port: IPort,
  ): IPort = definedExternally

  
  companion object : InterfaceMetadata<IEdge> {
    /**
     * Gets a snapshot of the points describing the path of an edge.
     * @receiver The edge whose path points are returned.
     * @return A list of [points][yfiles.geometry.Point] which describe the current path of the given `edge`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdge%23IEdge-defaultmethod-getPathPoints">Online Documentation</a>
     */
    fun IEdge.getPathPoints(): IListEnumerable<IPoint>
  }
}
