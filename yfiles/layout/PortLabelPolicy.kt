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
 * Specifies how [ILabel][yfiles.graph.ILabel]s at [IPort][yfiles.graph.IPort]s should be treated by the layout algorithm.
 * @see [LayoutGraphAdapter.portLabelPolicies]
 * @see [LayoutExecutor.portLabelPolicies]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLabelPolicy">Online Documentation</a>
 */
external sealed class PortLabelPolicy: YEnum<PortLabelPolicy> {
   companion object: EnumMetadata<PortLabelPolicy> {
       /**
 * The port label is not visible for the layout algorithm.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLabelPolicy%23NONE">Online Documentation</a>
 */
val NONE: PortLabelPolicy

/**
 * The port label is converted to a node label.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLabelPolicy%23NODE_LABEL">Online Documentation</a>
 */
val NODE_LABEL: PortLabelPolicy

/**
 * The port label is converted to an edge label.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLabelPolicy%23EDGE_LABEL">Online Documentation</a>
 */
val EDGE_LABEL: PortLabelPolicy

/**
 * The port label is converted to an edge label if the port has exactly one incident edge, and to a node label otherwise.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLabelPolicy%23AUTO">Online Documentation</a>
 */
val AUTO: PortLabelPolicy
   }
}
