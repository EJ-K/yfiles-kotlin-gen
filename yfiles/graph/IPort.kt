// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.lang.InterfaceMetadata
import yfiles.styles.IPortStyle

/**
 * The interface used in an [IGraph] implementation for [IEdge]s to connect to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPort">Online Documentation</a>
 */
external interface IPort : ILabelOwner {
  /**
   * Gets a live view of the location of the port in world coordinates.
   * @see [locationParameter]
   * @see [IPortLocationModel.getLocation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPort%23dynamicLocation">Online Documentation</a>
   */
  final val dynamicLocation: IPoint
  
  /**
   * Gets a snapshot of the current location of the port.
   * @see [locationParameter]
   * @see [IPortLocationModel.getLocation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPort%23location">Online Documentation</a>
   */
  final val location: Point
  
  /**
   * Gets the [IPortLocationModelParameter] that is used to determine the location of this port.
   * @see [IGraph.setPortLocationParameter]
   * @see [location]
   * @see [dynamicLocation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPort%23locationParameter">Online Documentation</a>
   */
  val locationParameter: IPortLocationModelParameter
  
  /**
   * Gets the owner of this port.
   * @throws InvalidOperationError if the port has no owner.
   * @see [IPortOwner.ports]
   * @see [IGraph.addPort]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPort%23owner">Online Documentation</a>
   */
  val owner: IPortOwner
  
  /**
   * Gets the style that is responsible for the visual representation of this port in a [CanvasComponent][yfiles.view.CanvasComponent].
   * @see [IGraph.setStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPort%23style">Online Documentation</a>
   */
  val style: IPortStyle

  
  companion object : InterfaceMetadata<IPort> {
  }
}
