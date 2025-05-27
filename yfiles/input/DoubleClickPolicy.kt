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
 * Policy to determine how single and double click events are raised in response to mouse clicks.
 * @see [ClickInputMode.doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DoubleClickPolicy">Online Documentation</a>
 */
external sealed class DoubleClickPolicy: YEnum<DoubleClickPolicy> {
   companion object: EnumMetadata<DoubleClickPolicy> {
       /**
 * In case of a double click, only the double click event is raised, but no single click events.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DoubleClickPolicy%23DOUBLE_CLICK_ONLY">Online Documentation</a>
 */
val DOUBLE_CLICK_ONLY: DoubleClickPolicy

/**
 * In case of a double click, one single click event is raised, followed by a double click event.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DoubleClickPolicy%23INITIAL_SINGLE_AND_DOUBLE_CLICK">Online Documentation</a>
 */
val INITIAL_SINGLE_AND_DOUBLE_CLICK: DoubleClickPolicy

/**
 * In case of a double click, two single click events are raised, followed by a double click event.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DoubleClickPolicy%23BOTH_SINGLE_CLICKS_AND_DOUBLE_CLICK">Online Documentation</a>
 */
val BOTH_SINGLE_CLICKS_AND_DOUBLE_CLICK: DoubleClickPolicy
   }
}
