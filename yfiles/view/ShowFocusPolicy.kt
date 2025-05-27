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
 * The enumeration that describes the possible different policies for displaying the focus of items managed by the [FocusIndicatorManager]
 * @see [FocusIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowFocusPolicy">Online Documentation</a>
 */
external sealed class ShowFocusPolicy: YEnum<ShowFocusPolicy> {
   companion object: EnumMetadata<ShowFocusPolicy> {
       /**
 * Indicates that irrespectively of the keyboard focus, the focus should always be rendered for the [FocusIndicatorManager.focusedItem].
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowFocusPolicy%23ALWAYS">Online Documentation</a>
 */
val ALWAYS: ShowFocusPolicy

/**
 * Indicates that depending on the value of [FocusIndicatorManager.focused] the focus should only be rendered if this property is set to `true`.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowFocusPolicy%23ONLY_WHEN_FOCUSED">Online Documentation</a>
 */
val ONLY_WHEN_FOCUSED: ShowFocusPolicy
   }
}
