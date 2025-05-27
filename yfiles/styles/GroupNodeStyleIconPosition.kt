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
 * The possible icon positions for the collapse/expand icon of a [GroupNodeStyle] instance.
 * @see [GroupNodeStyle.iconPosition]
 * @see [GroupNodeStyle.tabPosition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconPosition">Online Documentation</a>
 */
external sealed class GroupNodeStyleIconPosition: YEnum<GroupNodeStyleIconPosition> {
   companion object: EnumMetadata<GroupNodeStyleIconPosition> {
       /**
 * Indicates a leading position.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconPosition%23LEADING">Online Documentation</a>
 */
val LEADING: GroupNodeStyleIconPosition

/**
 * Indicates a trailing position.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconPosition%23TRAILING">Online Documentation</a>
 */
val TRAILING: GroupNodeStyleIconPosition
   }
}
