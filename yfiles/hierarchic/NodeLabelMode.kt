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
 * @see [NodeLayoutDescriptor.nodeLabelMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelMode">Online Documentation</a>
 */
external sealed class NodeLabelMode: YEnum<NodeLabelMode> {
   companion object: EnumMetadata<NodeLabelMode> {
       /**
 * A constant that prevents node labels from being considered during the layout.
 * 
 * Value - `0`
 * @see [NodeLayoutDescriptor.nodeLabelMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelMode%23NEVER">Online Documentation</a>
 */
val NEVER: NodeLabelMode

/**
 * A constant that makes the algorithm consider node labels for self-loops, node placement and routing.
 * 
 * Value - `1`
 * @see [NodeLayoutDescriptor.nodeLabelMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelMode%23CONSIDER_FOR_SELF_LOOPS">Online Documentation</a>
 */
val CONSIDER_FOR_SELF_LOOPS: NodeLabelMode

/**
 * A constant that makes the algorithm consider node labels for node placement and routing, but not for self-loops.
 * 
 * Value - `2`
 * @see [NodeLayoutDescriptor.nodeLabelMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelMode%23CONSIDER_FOR_DRAWING">Online Documentation</a>
 */
val CONSIDER_FOR_DRAWING: NodeLabelMode

/**
 * A constant that makes the algorithm consider node labels during routing only.
 * 
 * Value - `3`
 * @see [NodeLayoutDescriptor.nodeLabelMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelMode%23CONSIDER_FOR_ROUTING">Online Documentation</a>
 */
val CONSIDER_FOR_ROUTING: NodeLabelMode
   }
}
