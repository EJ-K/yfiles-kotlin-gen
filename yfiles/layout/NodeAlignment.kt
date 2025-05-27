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
 * @see [LayoutGraphUtilities.alignNodeLayouts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignment">Online Documentation</a>
 */
external sealed class NodeAlignment: YEnum<NodeAlignment> {
   companion object: EnumMetadata<NodeAlignment> {
       /**
 * Node alignment policy that results in top-aligned nodes for vertical alignment and left-aligned nodes for horizontal alignments.
 * 
 * Value - `-1`
 * @see [LayoutGraphUtilities.alignNodeLayouts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignment%23LEADING">Online Documentation</a>
 */
val LEADING: NodeAlignment

/**
 * Node alignment policy that results in center-aligned nodes.
 * 
 * Value - `0`
 * @see [LayoutGraphUtilities.alignNodeLayouts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignment%23CENTERED">Online Documentation</a>
 */
val CENTERED: NodeAlignment

/**
 * Node alignment policy that results in bottom-aligned nodes for vertical alignment and right-aligned nodes for horizontal alignments.
 * 
 * Value - `1`
 * @see [LayoutGraphUtilities.alignNodeLayouts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignment%23TRAILING">Online Documentation</a>
 */
val TRAILING: NodeAlignment

/**
 * Node alignment policy that results in vertically or horizontally distributed nodes.
 * 
 * Value - `2`
 * @see [LayoutGraphUtilities.alignNodeLayouts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignment%23DISTRIBUTED">Online Documentation</a>
 */
val DISTRIBUTED: NodeAlignment
   }
}
