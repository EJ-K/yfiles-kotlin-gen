// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [DefaultPortAssignment]
 * @see [DefaultPortAssignment.mode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutPortAssignmentMode">Online Documentation</a>
 */
@JsName("TreeLayoutPortAssignmentMode")
external sealed class PortAssignmentMode: YEnum<PortAssignmentMode> {
   companion object: EnumMetadata<PortAssignmentMode> {
       /**
 * A port assignment specifier which defines that all ports are reset to the center of their nodes.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutPortAssignmentMode%23NONE">Online Documentation</a>
 */
val NONE: PortAssignmentMode

/**
 * A port assignment specifier that defines that [PortConstraint][yfiles.layout.PortConstraint]s are considered.
 * 
 * Value - `1`
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutPortAssignmentMode%23PORT_CONSTRAINT">Online Documentation</a>
 */
val PORT_CONSTRAINT: PortAssignmentMode

/**
 * A port assignment specifier which defines that edges are distributed evenly at the northern side of their nodes.
 * 
 * Value - `2`
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutPortAssignmentMode%23DISTRIBUTED_NORTH">Online Documentation</a>
 */
val DISTRIBUTED_NORTH: PortAssignmentMode

/**
 * A port assignment specifier which defines that edges are distributed evenly at the southern side of their nodes.
 * 
 * Value - `3`
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutPortAssignmentMode%23DISTRIBUTED_SOUTH">Online Documentation</a>
 */
val DISTRIBUTED_SOUTH: PortAssignmentMode

/**
 * A port assignment specifier which defines that edges are distributed evenly at the eastern side of their nodes.
 * 
 * Value - `4`
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutPortAssignmentMode%23DISTRIBUTED_EAST">Online Documentation</a>
 */
val DISTRIBUTED_EAST: PortAssignmentMode

/**
 * A port assignment specifier which defines that edges are distributed evenly at the western side of their nodes.
 * 
 * Value - `5`
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutPortAssignmentMode%23DISTRIBUTED_WEST">Online Documentation</a>
 */
val DISTRIBUTED_WEST: PortAssignmentMode
   }
}
