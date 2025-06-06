// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.Rect
import yfiles.lang.InterfaceMetadata

/**
 * Interface that is implemented for elements that can determine whether they might be visible in a given clipping rectangle.
 * @see [IVisualCreator]
 * @see [CanvasComponent]
 * @see [IObjectRenderer]
 * @see [IRenderTreeElement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisibilityTestable">Online Documentation</a>
 */
external interface IVisibilityTestable  {
  /**
   * Determines whether an element might intersect the visible region for a given context.
   * @param [context] The context to determine the visibility for.
   * @param [rectangle] The visible region clip.
   * @return `false` if and only if it is safe not to render the element because it would not affect the given clipping region.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisibilityTestable%23IVisibilityTestable-method-isVisible">Online Documentation</a>
   */
  fun isVisible(
    context: ICanvasContext,
    rectangle: Rect,
  ): Boolean

  
  companion object : InterfaceMetadata<IVisibilityTestable> {
    /**
     * An implementation of a [IVisibilityTestable] that always yields `true`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisibilityTestable%23ALWAYS">Online Documentation</a>
     */
     val ALWAYS: IVisibilityTestable
    
    /**
     * An implementation of a [IVisibilityTestable] that always yields `false`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisibilityTestable%23NEVER">Online Documentation</a>
     */
     val NEVER: IVisibilityTestable
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisibilityTestable%23IVisibilityTestable-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      isVisible: (context: ICanvasContext, rectangle: Rect) -> Boolean
    ): IVisibilityTestable
  }
}
