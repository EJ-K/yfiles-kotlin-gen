// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.lang.InterfaceMetadata

/**
 * Interface that is implemented for elements that can be hit or picked in a coordinate system.
 * @see [CanvasComponent][yfiles.view.CanvasComponent]
 * @see [IObjectRenderer][yfiles.view.IObjectRenderer]
 * @see [IRenderTreeElement][yfiles.view.IRenderTreeElement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHitTestable">Online Documentation</a>
 */
external interface IHitTestable  {
  /**
   * Determines if something has been hit at the given coordinates in the world coordinate system.
   * @param [context] the context the hit test is performed in
   * @param [location] the coordinates in world coordinate system
   * @return whether something has been hit
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHitTestable%23IHitTestable-method-isHit">Online Documentation</a>
   */
  fun isHit(
    context: IInputModeContext,
    location: Point,
  ): Boolean

  
  companion object : InterfaceMetadata<IHitTestable> {
    /**
     * An [IHitTestable] that always returns true.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHitTestable%23ALWAYS">Online Documentation</a>
     */
     val ALWAYS: IHitTestable
    
    /**
     * An [IHitTestable] that always returns false.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHitTestable%23NEVER">Online Documentation</a>
     */
     val NEVER: IHitTestable
  
    /**
     * Wraps a hit testable handler into an [IHitTestable] interface.
     * @param [handler] The hit testable handler instance to wrap.
     * @return An [IHitTestable] implementation that wraps the provided handler.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHitTestable%23IHitTestable-defaultmethod-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      isHit: (context: IInputModeContext, location: Point) -> Boolean
    ): IHitTestable
  }
}
