// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

/**
 * Enumeration with different options on how to handle previews during a gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Visualization">Online Documentation</a>
 */

sealed external class Visualization {
  /**
   * No preview during the gesture, although some sort of visual feedback may be present.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Visualization%23NONE">Online Documentation</a>
   */
  object NONE: Visualization
  
  /**
   * A primitive visualization is displayed during the gesture.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Visualization%23GHOST">Online Documentation</a>
   */
  object GHOST: Visualization
  
  /**
   * A helper item is displayed during the gesture, while the original one is hidden.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Visualization%23PLACEHOLDER">Online Documentation</a>
   */
  object PLACEHOLDER: Visualization
  
  /**
   * The item is changed directly during the gesture.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Visualization%23LIVE">Online Documentation</a>
   */
  object LIVE: Visualization
}
