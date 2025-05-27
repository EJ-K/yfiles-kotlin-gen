// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enum constants that specify how group nodes are handled by the [OrganicLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeMode">Online Documentation</a>
 */
external sealed class GroupNodeMode: YEnum<GroupNodeMode> {
   companion object: EnumMetadata<GroupNodeMode> {
       /**
 * A mode constant for placing and resizing the group nodes and their content by the layout algorithm.
 * 
 * Value - `1`
 * @see [OrganicLayout.GROUP_NODE_MODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeMode%23NORMAL">Online Documentation</a>
 */
val NORMAL: GroupNodeMode

/**
 * A mode constant for placing the group nodes and their content with respect to the original bounds of the group node.
 * 
 * Value - `2`
 * @see [OrganicLayout.GROUP_NODE_MODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeMode%23FIX_BOUNDS">Online Documentation</a>
 */
val FIX_BOUNDS: GroupNodeMode

/**
 * A mode constant for placing group nodes with fixed content.
 * 
 * Value - `3`
 * @see [OrganicLayout.GROUP_NODE_MODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeMode%23FIX_CONTENTS">Online Documentation</a>
 */
val FIX_CONTENTS: GroupNodeMode
   }
}
