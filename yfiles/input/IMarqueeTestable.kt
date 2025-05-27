// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Rect
import yfiles.lang.InterfaceMetadata

/**
 * Interface that is used to test whether a rendered item is deemed to be inside a rectangular marquee selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMarqueeTestable">Online Documentation</a>
 */
external interface IMarqueeTestable  {
  /**
   * Returns `true` if the corresponding item is considered to intersect the given rectangular box.
   * @param [context] the current input mode context
   * @param [rectangle] the box describing the marquee's bounds
   * @return `true` if the item is considered to be captured by the marquee
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMarqueeTestable%23IMarqueeTestable-method-isInBox">Online Documentation</a>
   */
  fun isInBox(
    context: IInputModeContext,
    rectangle: Rect,
  ): Boolean

  
  companion object : InterfaceMetadata<IMarqueeTestable> {
    /**
     * An implementation that always yields `true`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMarqueeTestable%23ALWAYS">Online Documentation</a>
     */
     val ALWAYS: IMarqueeTestable
    
    /**
     * An implementation that always yields `false`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMarqueeTestable%23NEVER">Online Documentation</a>
     */
     val NEVER: IMarqueeTestable
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMarqueeTestable%23IMarqueeTestable-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      isInBox: (context: IInputModeContext, rectangle: Rect) -> Boolean
    ): IMarqueeTestable
  }
}
