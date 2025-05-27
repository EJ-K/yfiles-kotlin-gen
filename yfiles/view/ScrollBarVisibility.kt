// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

/**
 * Enumeration used by the [horizontalScrollBarPolicy][CanvasComponent] and [verticalScrollBarPolicy][CanvasComponent] properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ScrollBarVisibility">Online Documentation</a>
 */

sealed external class ScrollBarVisibility {
  /**
   * Never display the scroll bar, even if not all of the content fits into the viewport.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ScrollBarVisibility%23HIDDEN">Online Documentation</a>
   */
  object HIDDEN: ScrollBarVisibility
  
  /**
   * Display the scroll bar only when needed, and only if interacting with the scroll bar or if the viewport changed recently.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ScrollBarVisibility%23AUTO">Online Documentation</a>
   */
  object AUTO: ScrollBarVisibility
  
  /**
   * Always display the scroll bar.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ScrollBarVisibility%23VISIBLE">Online Documentation</a>
   */
  object VISIBLE: ScrollBarVisibility
}
