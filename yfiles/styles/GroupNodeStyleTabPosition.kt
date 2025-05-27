// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * The possible positions for the tab of a [GroupNodeStyle] instance.
 * @see [GroupNodeStyle.tabPosition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition">Online Documentation</a>
 */
external sealed class GroupNodeStyleTabPosition: YEnum<GroupNodeStyleTabPosition> {
   companion object: EnumMetadata<GroupNodeStyleTabPosition> {
       /**
 * Indicates no tab at all.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23NONE">Online Documentation</a>
 */
val NONE: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the top of the node that is anchored to the node's left side.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23TOP_LEADING">Online Documentation</a>
 */
val TOP_LEADING: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the top of the node that is anchored to the node's right side.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23TOP_TRAILING">Online Documentation</a>
 */
val TOP_TRAILING: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the top of the node that spans the node's width.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23TOP">Online Documentation</a>
 */
val TOP: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the bottom of the node that is anchored to the node's left side.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23BOTTOM_LEADING">Online Documentation</a>
 */
val BOTTOM_LEADING: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the bottom of the node that is anchored to the node's right side.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23BOTTOM_TRAILING">Online Documentation</a>
 */
val BOTTOM_TRAILING: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the bottom of the node that spans the node's width.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23BOTTOM">Online Documentation</a>
 */
val BOTTOM: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the left side of the node that is anchored to the node's top.
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23LEFT_LEADING">Online Documentation</a>
 */
val LEFT_LEADING: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the left side of the node that is anchored to the node's bottom.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23LEFT_TRAILING">Online Documentation</a>
 */
val LEFT_TRAILING: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the left side of the node that spans the node's height.
 * 
 * Value - `9`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23LEFT">Online Documentation</a>
 */
val LEFT: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the right side of the node that is anchored to the node's top.
 * 
 * Value - `10`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23RIGHT_LEADING">Online Documentation</a>
 */
val RIGHT_LEADING: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the right side of the node that is anchored to the node's bottom.
 * 
 * Value - `11`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23RIGHT_TRAILING">Online Documentation</a>
 */
val RIGHT_TRAILING: GroupNodeStyleTabPosition

/**
 * Indicates a tab at the right side of the node that spans the node's height.
 * 
 * Value - `12`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabPosition%23RIGHT">Online Documentation</a>
 */
val RIGHT: GroupNodeStyleTabPosition
   }
}
