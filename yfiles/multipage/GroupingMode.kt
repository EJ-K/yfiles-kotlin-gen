// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [MultiPageLayout.groupingMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingMode">Online Documentation</a>
 */
external sealed class GroupingMode: YEnum<GroupingMode> {
   companion object: EnumMetadata<GroupingMode> {
       /**
 * Node grouping specifier used when group nodes should be ignored.
 * 
 * Value - `0`
 * @see [MultiPageLayout.groupingMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingMode%23IGNORE">Online Documentation</a>
 */
val IGNORE: GroupingMode

/**
 * Node grouping specifier used when only original nodes should be assigned to group nodes.
 * 
 * Value - `1`
 * @see [MultiPageLayout.groupingMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingMode%23ORIGINAL_NODES_ONLY">Online Documentation</a>
 */
val ORIGINAL_NODES_ONLY: GroupingMode

/**
 * Node grouping specifier used when special nodes like, e.g., connector and proxy nodes (see [NodeType.CONNECTOR] and [NodeType.PROXY]) should be assigned to group nodes, too.
 * 
 * Value - `2`
 * @see [MultiPageLayout.groupingMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingMode%23ALL_NODES">Online Documentation</a>
 */
val ALL_NODES: GroupingMode
   }
}
