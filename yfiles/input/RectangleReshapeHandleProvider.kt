// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IMutableRectangle
import yfiles.lang.ClassMetadata

/**
 * A simple implementation of an [IReshapeHandleProvider] that returns handles that modify an [IMutableRectangle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleReshapeHandleProvider">Online Documentation</a>
 * 
 * @constructor Creates a default instance that provides handles for each of the positions given for the rectangle.
 * @param [rectangle] The rectangle to create handles for.
 * @param [handlePositions] A bitwise combination of all handle positions this instance should provide a handle for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleReshapeHandleProvider%23RectangleReshapeHandleProvider-constructor-RectangleReshapeHandleProvider">Online Documentation</a>
 * 
 * @property rectangle
 * Gets the rectangle to read the current state from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleReshapeHandleProvider%23rectangle">Online Documentation</a>
 */
open external class RectangleReshapeHandleProvider (
protected final val rectangle: IMutableRectangle,
handlePositions: HandlePositions  = definedExternally) : ReshapeHandleProviderBase {
  /**
   * Provides a [IHandle] that uses the rectangle instance to perform the actual reshaping.
   * @param [context] The context for which the handles are queried.
   * @param [position] The position to provide an instance for.
   * @return A handle implementation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleReshapeHandleProvider%23RectangleReshapeHandleProvider-method-getHandle">Online Documentation</a>
   */
  override fun getHandle(
    context: IInputModeContext,
    position: HandlePositions,
  ): IHandle
  
  companion object : ClassMetadata<RectangleReshapeHandleProvider> {
  }
}
