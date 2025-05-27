// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.YPoint
import yfiles.lang.ClassMetadata

/**
 * [AlignmentStage] places the nodes of the given layout on automatically determined horizontal and/or vertical lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage">Online Documentation</a>
 * 
 * @constructor Creates a new [AlignmentStage] with the given algorithm as [core layout algorithm][LayoutStageBase.coreLayout] or `null` if no core layout should be applied prior to the alignment stage.
 * @param [coreLayout] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23AlignmentStage-constructor-AlignmentStage">Online Documentation</a>
 */
external open class AlignmentStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the axis, parallel to which the nodes are aligned by the algorithm.
 * 
 * Default value - [AlignmentStageAlignmentPolicy.SNAP_X_Y]. Nodes are aligned horizontally and vertically.
 * @throws ArgumentError if an unknown alignment policy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23alignmentPolicy">Online Documentation</a>
 */
open var alignmentPolicy: AlignmentStageAlignmentPolicy
/**
 * Gets or sets whether node labels are taken into account for snapping nodes on common lines.
 * 
 * Default value - `true`. Node labels are considered for resolving overlaps when determining the alignment of the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets the distance between two adjacent grid lines to which the nodes can be snapped or zero if nodes are aligned on an irregular grid.
 * 
 * Default value - `0.0`. Nodes are aligned on an irregular grid.
 * @throws ArgumentError if a negative value is specified
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23gridSpacing">Online Documentation</a>
 */
open var gridSpacing: Double
/**
 * Gets or sets the minimum horizontal and vertical distance between two nodes.
 * 
 * Default value - `15.0`
 * @throws ArgumentError if the given value is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23minimumNodeDistance">Online Documentation</a>
 */
open var minimumNodeDistance: Double
/**
 * Gets or sets whether nodes are placed in strictly separated rows and strictly separated columns.
 * 
 * Default value - `false`. Rows and Columns are not strictly separated and may overlap.
 * @see [minimumNodeDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23separateStripes">Online Documentation</a>
 */
open var separateStripes: Boolean
/**
 * Gets or sets the maximum distance between two nodes that can be aligned on the same line.
 * 
 * Default value - `50.0`
 * @throws ArgumentError if the given value is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23snapDistance">Online Documentation</a>
 */
open var snapDistance: Double
/**
 * Aligns the nodes of the graph into a grid-like structure.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23AlignmentStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<AlignmentStage> {
/**
 * A data provider key for specifying the points of the nodes that are aligned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23SNAP_OFFSET_DP_KEY">Online Documentation</a>
 */
 val SNAP_OFFSET_DP_KEY: NodeDpKey<YPoint>
}
}

inline fun AlignmentStage(
    block: AlignmentStage.() -> Unit
): AlignmentStage {
    return AlignmentStage()
        .apply(block)
}
