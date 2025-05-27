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
 * Specifies how text is wrapped and trimmed when it overflows its desired box.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping">Online Documentation</a>
 */

sealed external class TextWrapping {
  /**
   * The text should neither be wrapped nor trimmed when it overflows its container.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23NONE">Online Documentation</a>
   */
  object NONE: TextWrapping
  
  /**
   * The text should neither be wrapped nor trimmed when it overflows its container, but is clipped at the container bounds.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23CLIP">Online Documentation</a>
   */
  object CLIP: TextWrapping
  
  /**
   * The text is not wrapped, but trimmed character-wise when it overflows its container.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23TRIM_CHARACTER">Online Documentation</a>
   */
  object TRIM_CHARACTER: TextWrapping
  
  /**
   * The text is not wrapped, but trimmed character-wise when it overflows its container, with an ellipsis character added to indicate trimmed text.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23TRIM_CHARACTER_ELLIPSIS">Online Documentation</a>
   */
  object TRIM_CHARACTER_ELLIPSIS: TextWrapping
  
  /**
   * The text is not wrapped, but trimmed at word boundaries when it overflows its container.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23TRIM_WORD">Online Documentation</a>
   */
  object TRIM_WORD: TextWrapping
  
  /**
   * The text is not wrapped, but trimmed at word boundaries when it overflows its container, with an ellipsis character added to indicate trimmed text.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23TRIM_WORD_ELLIPSIS">Online Documentation</a>
   */
  object TRIM_WORD_ELLIPSIS: TextWrapping
  
  /**
   * The text is wrapped character-wise when it overflows its container and if the wrapped text is bigger than the available container, then it is trimmed character by character to fit the container.
   * 
   * Value - `6`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23WRAP_CHARACTER">Online Documentation</a>
   */
  object WRAP_CHARACTER: TextWrapping
  
  /**
   * The text is wrapped character-wise when it overflows its container and if the wrapped text is bigger than the available container, then it is trimmed character by character to fit the container and an ellipsis is added to indicate trimmed text.
   * 
   * Value - `7`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23WRAP_CHARACTER_ELLIPSIS">Online Documentation</a>
   */
  object WRAP_CHARACTER_ELLIPSIS: TextWrapping
  
  /**
   * The text is wrapped at word boundaries when it overflows its container and if the wrapped text is bigger than the available container, then it is trimmed at word boundaries to fit the container.
   * 
   * Value - `8`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23WRAP_WORD">Online Documentation</a>
   */
  object WRAP_WORD: TextWrapping
  
  /**
   * The text is wrapped at word boundaries when it overflows its container and if the wrapped text is bigger than the available container, then it is trimmed character by character to fit the container and an ellipsis is added to indicate trimmed text.
   * 
   * Value - `9`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23WRAP_WORD_ELLIPSIS">Online Documentation</a>
   */
  object WRAP_WORD_ELLIPSIS: TextWrapping
}
