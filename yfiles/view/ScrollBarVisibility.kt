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
 * Enumeration used by the [CanvasComponent.horizontalScrollBarPolicy] and [CanvasComponent.verticalScrollBarPolicy] properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ScrollBarVisibility">Online Documentation</a>
 */
external sealed class ScrollBarVisibility: YEnum<ScrollBarVisibility> {
   companion object: EnumMetadata<ScrollBarVisibility> {
       /**
 * Never display the scroll bar, even if not all of the content fits into the viewport.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ScrollBarVisibility%23NEVER">Online Documentation</a>
 */
val NEVER: ScrollBarVisibility

/**
 * Display the scroll bar only when needed, i.e., if not all of the content fits into the viewport, and hide it otherwise.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ScrollBarVisibility%23AS_NEEDED">Online Documentation</a>
 */
val AS_NEEDED: ScrollBarVisibility

/**
 * Display the scroll bar only when needed, and only if interacting with the scroll bar or if the viewport changed recently.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ScrollBarVisibility%23AS_NEEDED_DYNAMIC">Online Documentation</a>
 */
val AS_NEEDED_DYNAMIC: ScrollBarVisibility

/**
 * Always display the scroll bar.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ScrollBarVisibility%23ALWAYS">Online Documentation</a>
 */
val ALWAYS: ScrollBarVisibility
   }
}
