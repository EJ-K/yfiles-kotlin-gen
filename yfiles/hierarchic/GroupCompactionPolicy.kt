// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * A strategy specifying no horizontal group compaction.
 * @see [SimplexNodePlacer.groupCompactionStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupCompactionPolicy">Online Documentation</a>
 */
external sealed class GroupCompactionPolicy: YEnum<GroupCompactionPolicy> {
   companion object: EnumMetadata<GroupCompactionPolicy> {
       /**
 * A strategy specifying no horizontal group compaction.
 * 
 * Value - `0`
 * @see [SimplexNodePlacer.groupCompactionStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupCompactionPolicy%23NONE">Online Documentation</a>
 */
val NONE: GroupCompactionPolicy

/**
 * A strategy specifying maximal horizontal group compaction.
 * 
 * Value - `1`
 * @see [SimplexNodePlacer.groupCompactionStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupCompactionPolicy%23MAXIMAL">Online Documentation</a>
 */
val MAXIMAL: GroupCompactionPolicy
   }
}
