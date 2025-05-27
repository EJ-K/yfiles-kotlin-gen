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
 * Node labeling policies defining how node labels are placed by the integrated node labeling mechanism of algorithms [BalloonLayout][yfiles.tree.BalloonLayout], [CactusGroupLayout], [CircularLayout][yfiles.circular.CircularLayout] and [RadialLayout][yfiles.radial.RadialLayout].
 * @see [CircularLayout.nodeLabelingPolicy][yfiles.circular.CircularLayout.nodeLabelingPolicy]
 * @see [CompactDiskLayout.nodeLabelingPolicy][yfiles.circular.CompactDiskLayout.nodeLabelingPolicy]
 * @see [CactusGroupLayout.nodeLabelingPolicy]
 * @see [RadialLayout.nodeLabelingPolicy][yfiles.radial.RadialLayout.nodeLabelingPolicy]
 * @see [BalloonLayout.nodeLabelingPolicy][yfiles.tree.BalloonLayout.nodeLabelingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelingPolicy">Online Documentation</a>
 */
external sealed class NodeLabelingPolicy: YEnum<NodeLabelingPolicy> {
   companion object: EnumMetadata<NodeLabelingPolicy> {
       /**
 * Node labeling policy for ray-like label placement at nodes with zero or one child node or nodes that are placed on the perimeter of a circular component.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelingPolicy%23RAY_LIKE">Online Documentation</a>
 */
val RAY_LIKE: NodeLabelingPolicy

/**
 * Node labeling policy for ray-like label placement at nodes with zero children or nodes that are placed on the perimeter of a circular component.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelingPolicy%23RAY_LIKE_LEAVES">Online Documentation</a>
 */
val RAY_LIKE_LEAVES: NodeLabelingPolicy

/**
 * Node labeling policy for horizontal label placement at all nodes.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelingPolicy%23HORIZONTAL">Online Documentation</a>
 */
val HORIZONTAL: NodeLabelingPolicy
   }
}
