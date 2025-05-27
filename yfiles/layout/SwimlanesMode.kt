// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [Swimlanes.arrangeSwimlanes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlanesMode">Online Documentation</a>
 */
external sealed class SwimlanesMode: YEnum<SwimlanesMode> {
   companion object: EnumMetadata<SwimlanesMode> {
       /**
 * Swimlane ordering mode specifier defining that node grouping is ignored during the swimlane ordering optimization.
 * 
 * Value - `0`
 * @see [Swimlanes.arrangeSwimlanes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlanesMode%23IGNORE_GROUPS">Online Documentation</a>
 */
val IGNORE_GROUPS: SwimlanesMode

/**
 * Swimlane ordering mode specifier defining that only node grouping is considered during the swimlane ordering optimization.
 * 
 * Value - `1`
 * @see [Swimlanes.arrangeSwimlanes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlanesMode%23ONLY_GROUPS">Online Documentation</a>
 */
val ONLY_GROUPS: SwimlanesMode

/**
 * Swimlane ordering mode specifier defining that both node grouping and edge length are considered during the swimlane ordering optimization.
 * 
 * Value - `2`
 * @see [Swimlanes.arrangeSwimlanes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlanesMode%23MIXED">Online Documentation</a>
 */
val MIXED: SwimlanesMode
   }
}
