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
 * @see [NodeLayoutDescriptor.portAssignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutPortAssignmentMode">Online Documentation</a>
 */
@JsName("HierarchicLayoutPortAssignmentMode")
external sealed class PortAssignmentMode: YEnum<PortAssignmentMode> {
   companion object: EnumMetadata<PortAssignmentMode> {
       /**
 * A port assignment strategy that distributes ports evenly along the border of the node.
 * 
 * Value - `0`
 * @see [NodeLayoutDescriptor.portAssignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutPortAssignmentMode%23DEFAULT">Online Documentation</a>
 */
val DEFAULT: PortAssignmentMode

/**
 * A port assignment strategy that places all edges on grid lines.
 * 
 * Value - `1`
 * @see [NodeLayoutDescriptor.portAssignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutPortAssignmentMode%23ON_GRID">Online Documentation</a>
 */
val ON_GRID: PortAssignmentMode

/**
 * A port assignment strategy that places all edges on grid lines or sub-grid lines.
 * 
 * Value - `2`
 * @see [NodeLayoutDescriptor.portAssignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutPortAssignmentMode%23ON_SUBGRID">Online Documentation</a>
 */
val ON_SUBGRID: PortAssignmentMode
   }
}
