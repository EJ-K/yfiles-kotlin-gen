// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.seriesparallel

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [DefaultPortAssignment]
 * @see [DefaultPortAssignment.mode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutPortAssignmentMode">Online Documentation</a>
 */
@JsName("SeriesParallelLayoutPortAssignmentMode")
external sealed class PortAssignmentMode: YEnum<PortAssignmentMode> {
   companion object: EnumMetadata<PortAssignmentMode> {
       /**
 * A port assignment specifier which defines that all ports are reset to the center of their nodes.
 * 
 * Value - `0`
 * @see [PortConstraint][yfiles.layout.PortConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutPortAssignmentMode%23CENTER">Online Documentation</a>
 */
val CENTER: PortAssignmentMode

/**
 * A port assignment specifier which defines that the ports of incoming and outgoing edges are distributed evenly at the side of their nodes.
 * 
 * Value - `1`
 * @see [PortConstraint][yfiles.layout.PortConstraint]
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutPortAssignmentMode%23DISTRIBUTED">Online Documentation</a>
 */
val DISTRIBUTED: PortAssignmentMode
   }
}
