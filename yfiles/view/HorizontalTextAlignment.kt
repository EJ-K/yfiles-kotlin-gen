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
 * Possible values for the horizontal alignment of text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HorizontalTextAlignment">Online Documentation</a>
 */

sealed external class HorizontalTextAlignment {
  /**
   * Indicates that the text should be centered.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HorizontalTextAlignment%23CENTER">Online Documentation</a>
   */
  object CENTER: HorizontalTextAlignment
  
  /**
   * Indicates that the text should be aligned to the left.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HorizontalTextAlignment%23LEFT">Online Documentation</a>
   */
  object LEFT: HorizontalTextAlignment
  
  /**
   * Indicates that the text should be aligned to the right.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HorizontalTextAlignment%23RIGHT">Online Documentation</a>
   */
  object RIGHT: HorizontalTextAlignment
}
