// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.YPoint
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class is used by [HierarchicLayoutCore] during the various phases to provide the drawing details of the nodes of the graph.
 * @see [HierarchicLayoutCore.NODE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see [EdgeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of a [NodeLayoutDescriptor] with the default values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor%23NodeLayoutDescriptor-constructor-NodeLayoutDescriptor">Online Documentation</a>
 */
@JsName("HierarchicLayoutNodeLayoutDescriptor")
external open class NodeLayoutDescriptor  () : YObject {

/**
 * Gets or sets the node's reference point that will be placed on a grid coordinate.
 * 
 * Default value - [YPoint.ORIGIN]. The reference point is [YPoint.ORIGIN] and the center of the node is placed on the grid.
 * @throws ArgumentError if the given grid reference is null
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor%23gridReference">Online Documentation</a>
 */
open var gridReference: YPoint
/**
 * Gets or sets the alignment of the [node][yfiles.algorithms.Node] of this [NodeLayoutDescriptor] instance within its layer.
 * 
 * Default value - `0.5`. Nodes are center-aligned within their corresponding layers.
 * @throws ArgumentError if the alignment is not within [0.0 .. 1.0]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor%23layerAlignment">Online Documentation</a>
 */
open var layerAlignment: Double
/**
 * Gets or sets the preferred minimum distance to obstacles.
 * 
 * Default value - `5.0`
 * @throws ArgumentError if the minimum length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor%23minimumDistance">Online Documentation</a>
 */
open var minimumDistance: Double
/**
 * Gets or sets the minimum height of the layer to which this node is assigned.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the minimum height is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor%23minimumLayerHeight">Online Documentation</a>
 */
open var minimumLayerHeight: Double
/**
 * Gets or sets the mode that determines how node labels are handled by the algorithm during the layout.
 * 
 * Default value - [NodeLabelMode.CONSIDER_FOR_DRAWING]. Node labels will be considered for node placement and routing, but not for self-loops.
 * @throws ArgumentError if the constant is unknown.
 * @see [HierarchicLayout.considerNodeLabels]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor%23nodeLabelMode">Online Documentation</a>
 */
open var nodeLabelMode: NodeLabelMode
/**
 * Gets or sets the assignment strategy which distributes the ports along the node borders.
 * 
 * Default value - [PortAssignmentMode.DEFAULT]. Ports are distributed evenly along the border of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor%23portAssignment">Online Documentation</a>
 */
open var portAssignment: PortAssignmentMode
/**
 * Sets the port border gap ratio for the port distribution on all sides of the node.
 * 
 * Default value - `0.5`. Ports are distributed along the sides of the node.
 * @throws ArgumentError if the given ratio is negative
 * @see [setPortBorderGapRatio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor%23portBorderGapRatios">Online Documentation</a>
 */
open var portBorderGapRatios: Double
@Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
get
/**
 * Gets or sets the distance between this node and the other child nodes ones if they are part of a tabular group structure ([HierarchicLayout.TABULAR_GROUPS_DP_KEY]).
 * 
 * Default value - `0`
 * @throws ArgumentError if the given distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor%23tabularGroupChildDistance">Online Documentation</a>
 */
open var tabularGroupChildDistance: Double
/**
 * Returns the port border gap ratio for the port distribution at a given side of the node.
 * @param [side] the zero-based clockwise side index for top-to-bottom layouts (i.e., top is 0)
 * @return the border gap ratio of a given side
 * @see [portBorderGapRatios]
 * @see [setPortBorderGapRatio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor%23NodeLayoutDescriptor-method-getPortBorderGapRatio">Online Documentation</a>
 */
 open   fun getPortBorderGapRatio( side: Int ):Double
/**
 * Specifies the port border gap ratio for the port distribution at a given side of the node.
 * @param [side] the zero-based clockwise side index for top-to-bottom layouts (i.e., top is 0)
 * @param [ratio] the given ratio
 * @throws ArgumentError if the given ratio is negative
 * @see [portBorderGapRatios]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutNodeLayoutDescriptor%23NodeLayoutDescriptor-method-setPortBorderGapRatio">Online Documentation</a>
 */
 open   fun setPortBorderGapRatio( side: Int ,
 ratio: Double )

companion object : ClassMetadata<NodeLayoutDescriptor> {
}
}

inline fun NodeLayoutDescriptor(
    block: NodeLayoutDescriptor.() -> Unit
): NodeLayoutDescriptor {
    return NodeLayoutDescriptor()
        .apply(block)
}
