// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Holds the possible drag actions.
 * @see [QueryContinueDragEventArgs.action]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragAction">Online Documentation</a>
 */
external sealed class DragAction: YEnum<DragAction> {
   companion object: EnumMetadata<DragAction> {
       /**
 * Whether the drag should be continued.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragAction%23CONTINUE">Online Documentation</a>
 */
val CONTINUE: DragAction

/**
 * Whether the drag should be finalized by an immediate drop.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragAction%23DROP">Online Documentation</a>
 */
val DROP: DragAction

/**
 * Whether the drag operation should be canceled.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragAction%23CANCEL">Online Documentation</a>
 */
val CANCEL: DragAction
   }
}
