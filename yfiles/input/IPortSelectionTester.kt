// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IEnumerable
import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.IPort
import yfiles.lang.InterfaceMetadata

/**
 * Interface that can be used to find ports at specific locations in the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortSelectionTester">Online Documentation</a>
 */
external interface IPortSelectionTester  {
  /**
   * Returns the port at the given world coordinate position or `null` if there is no such port.
   * @param [context] The input mode context to use for querying the position.
   * @param [location] The coordinates of the position in the world coordinate system.
   * @return The port at the position or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortSelectionTester%23IPortSelectionTester-method-getHitPort">Online Documentation</a>
   */
  fun getHitPort(
    context: IInputModeContext,
    location: Point,
  ): IPort?
  
  /**
   * Returns the ports for the given marquee rectangle.
   * @param [context] The input mode context to use for querying the position.
   * @param [rectangle] The marquee selection box in the world coordinate system.
   * @return An enumerable over the ports inside the marquee selection box.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortSelectionTester%23IPortSelectionTester-method-getPortsInBox">Online Documentation</a>
   */
  fun getPortsInBox(
    context: IInputModeContext,
    rectangle: Rect,
  ): IEnumerable<IPort>
  
  /**
   * Returns the ports within the given lasso path.
   * @param [context] The input mode context to use for querying the position.
   * @param [lassoPath] A lasso path in world coordinates.
   * @return An enumerable over the ports inside the `lassoPath`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortSelectionTester%23IPortSelectionTester-method-getPortsInPath">Online Documentation</a>
   */
  fun getPortsInPath(
    context: IInputModeContext,
    lassoPath: GeneralPath,
  ): IEnumerable<IPort>

  
  companion object : InterfaceMetadata<IPortSelectionTester> {
  }
}
