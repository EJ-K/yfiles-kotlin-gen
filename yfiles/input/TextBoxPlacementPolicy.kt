// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Describe what policy to use when the [TextEditorInputMode.editorContainer] would be located outside of the current [CanvasComponent.viewport][yfiles.view.CanvasComponent.viewport]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextBoxPlacementPolicy">Online Documentation</a>
 */
external sealed class TextBoxPlacementPolicy: YEnum<TextBoxPlacementPolicy> {
   companion object: EnumMetadata<TextBoxPlacementPolicy> {
       /**
 * Do nothing
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextBoxPlacementPolicy%23NONE">Online Documentation</a>
 */
val NONE: TextBoxPlacementPolicy

/**
 * Move the [CanvasComponent][yfiles.view.CanvasComponent] so that the [TextEditorInputMode.editorContainer] is visible
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextBoxPlacementPolicy%23SCROLL_CANVAS">Online Documentation</a>
 */
val SCROLL_CANVAS: TextBoxPlacementPolicy

/**
 * Move the [TextEditorInputMode.editorContainer] so that it is visible in the current [CanvasComponent.viewport][yfiles.view.CanvasComponent.viewport]
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextBoxPlacementPolicy%23MOVE_TEXT_BOX">Online Documentation</a>
 */
val MOVE_TEXT_BOX: TextBoxPlacementPolicy
   }
}
