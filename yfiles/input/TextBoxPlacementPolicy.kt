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
 * Describe what policy to use when the [editorContainer][TextEditorInputMode] would be located outside of the current [viewport][yfiles.view.CanvasComponent]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextBoxPlacementPolicy">Online Documentation</a>
 */

sealed external class TextBoxPlacementPolicy {
  /**
   * Do nothing
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextBoxPlacementPolicy%23NONE">Online Documentation</a>
   */
  object NONE: TextBoxPlacementPolicy
  
  /**
   * Move the [yfiles.view.CanvasComponent] so that the [editorContainer][TextEditorInputMode] is visible
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextBoxPlacementPolicy%23SCROLL_CANVAS">Online Documentation</a>
   */
  object SCROLL_CANVAS: TextBoxPlacementPolicy
  
  /**
   * Move the [editorContainer][TextEditorInputMode] so that it is visible in the current [viewport][yfiles.view.CanvasComponent]
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextBoxPlacementPolicy%23MOVE_TEXT_BOX">Online Documentation</a>
   */
  object MOVE_TEXT_BOX: TextBoxPlacementPolicy
}
