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
 * Enumeration for use with the [startDrag][DragSource] method that specifies the allowed actions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropEffects">Online Documentation</a>
 */

sealed external class DragDropEffects {
  /**
   * Indicates that the drop target cannot be used for dropping the data.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropEffects%23NONE">Online Documentation</a>
   */
  object NONE: DragDropEffects
  
  /**
   * Indicates that the data can be copied to the drop target.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropEffects%23COPY">Online Documentation</a>
   */
  object COPY: DragDropEffects
  
  /**
   * Indicates that the data can be moved to the drop target.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropEffects%23MOVE">Online Documentation</a>
   */
  object MOVE: DragDropEffects
  
  /**
   * Indicates that the data can be copied or moved to the drop target.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropEffects%23COPY_MOVE">Online Documentation</a>
   */
  object COPY_MOVE: DragDropEffects
  
  /**
   * Indicates that the data can be linked to the drop target.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropEffects%23LINK">Online Documentation</a>
   */
  object LINK: DragDropEffects
  
  /**
   * Indicates that the data can be copied or linked to the drop target.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropEffects%23COPY_LINK">Online Documentation</a>
   */
  object COPY_LINK: DragDropEffects
  
  /**
   * Indicates that the data can be linked or copied to the drop target.
   * 
   * Value - `6`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropEffects%23LINK_MOVE">Online Documentation</a>
   */
  object LINK_MOVE: DragDropEffects
  
  /**
   * A combination of all the flags.
   * 
   * Value - `7`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropEffects%23ALL">Online Documentation</a>
   */
  object ALL: DragDropEffects
  
  /**
   * Indicates that the value is uninitialized.
   * 
   * Value - `15`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropEffects%23UNINITIALIZED">Online Documentation</a>
   */
  object UNINITIALIZED: DragDropEffects
}
