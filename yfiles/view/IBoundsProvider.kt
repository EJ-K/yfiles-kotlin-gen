// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.IRectangle
import yfiles.geometry.Rect
import yfiles.lang.InterfaceMetadata

/**
 * Interface that is implemented for elements that can provide rendering bounds in the world coordinate system.
 * @see [IVisualCreator]
 * @see [CanvasComponent]
 * @see [IObjectRenderer]
 * @see [IRenderTreeElement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBoundsProvider">Online Documentation</a>
 */
external interface IBoundsProvider  {
  /**
   * Returns a tight rectangular area where the whole rendering would fit into.
   * @param [context] the context to calculate the bounds for
   * @return the bounds or [EMPTY][Rect] to indicate an unbound area
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBoundsProvider%23IBoundsProvider-method-getBounds">Online Documentation</a>
   */
  fun getBounds(
    context: ICanvasContext,
  ): Rect

  
  companion object : InterfaceMetadata<IBoundsProvider> {
    /**
     * An implementation that returns an [IBoundsProvider] that yields [EMPTY][Rect] bounds.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBoundsProvider%23EMPTY">Online Documentation</a>
     */
     val EMPTY: IBoundsProvider
    
    /**
     * An implementation that returns an [IBoundsProvider] that yields [INFINITE][Rect] bounds.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBoundsProvider%23UNBOUNDED">Online Documentation</a>
     */
     val UNBOUNDED: IBoundsProvider
    
    /**
     * Creates an instance that returns the given rectangle as the bounds.
     * @param [bounds] The rectangle to be used as the bounds.
     * @return An [IBoundsProvider] that returns the given `bounds`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBoundsProvider%23IBoundsProvider-defaultmethod-fromRectangle">Online Documentation</a>
     */
    @JsName("fromRectangle")
    operator fun invoke(
      bounds: IRectangle,
    ): IBoundsProvider
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBoundsProvider%23IBoundsProvider-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      getBounds: (context: ICanvasContext) -> Rect
    ): IBoundsProvider
  }
}
