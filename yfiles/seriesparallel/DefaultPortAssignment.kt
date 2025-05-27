// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.seriesparallel

import yfiles.algorithms.Node
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * [DefaultPortAssignment] implements the default port assignment strategy.
 * @see [PortConstraint][yfiles.layout.PortConstraint]
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSeriesParallelLayoutPortAssignment">Online Documentation</a>
 * 
 * @constructor Creates a new [DefaultPortAssignment] instance using the given [mode] and a given value for the [ratio][borderGapToPortGapRatio] of the gap between the border and the ports to the gap between the ports themselves.
 * @param [mode] one of the predefined port assignment modes
 * @param [borderGapToPortGapRatio] the ratio of the distance between outer ports and the border to the distance between any two ports
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSeriesParallelLayoutPortAssignment%23DefaultPortAssignment-constructor-DefaultPortAssignment">Online Documentation</a>
 * 
 * @property mode
 * Gets or sets the mode that describes how ports are placed.
 * 
 * Default value - [PortAssignmentMode.CENTER]
 * @throws ArgumentError if an unknown mode is specified
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSeriesParallelLayoutPortAssignment%23mode">Online Documentation</a>
 * 
 * @property borderGapToPortGapRatio
 * Gets or sets the ratio of the *border gap* (distance between the outer ports and the node border) to the *port gap* (distance between adjacent ports).
 * 
 * Default value - `0.5`
 * @throws ArgumentError if the specified ratio is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSeriesParallelLayoutPortAssignment%23borderGapToPortGapRatio">Online Documentation</a>
 */
@JsName("DefaultSeriesParallelLayoutPortAssignment")
external open class DefaultPortAssignment  (
open var mode: PortAssignmentMode = definedExternally,
open var borderGapToPortGapRatio: Double = definedExternally) : IPortAssignment {

/**
 * Gets or sets the fork style which influences the port assignment.
 * 
 * Default value - [ForkStyle.OUTSIDE_NODE]
 * @throws ArgumentError if the specified fork style is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSeriesParallelLayoutPortAssignment%23forkStyle">Online Documentation</a>
 */
open var forkStyle: ForkStyle
/**
 * Places the ports of edges connecting to the given node according to the [port assignment mode][mode].
 * @param [graph] the input graph
 * @param [node] the node whose adjacent edges' ports should be placed
 * @see [mode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSeriesParallelLayoutPortAssignment%23DefaultPortAssignment-method-assignPorts">Online Documentation</a>
 */
 override   fun assignPorts( graph: LayoutGraph ,
 node: Node )
/**
 * Determines the distance between the outer ports and the border of the node.
 * @param [sideLength] the width/height of the side
 * @param [edgeCount] the number of edges that connect to this side
 * @return the absolute gap to be used on both sides of the ports
 * @see [assignPorts]
 * @see [borderGapToPortGapRatio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSeriesParallelLayoutPortAssignment%23DefaultPortAssignment-method-getPortBorderGap">Online Documentation</a>
 */
 open protected   fun getPortBorderGap( sideLength: Double ,
 edgeCount: Int ):Double
/**
 * Determines the distance between two adjacent ports.
 * @param [sideLength] the width/height of the side
 * @param [edgeCount] the number of edges/ports that connect to this side
 * @param [portBorderGap] the port border gap (i.e. calculated by [getPortBorderGap])
 * @return the absolute distance to be used between two adjacent ports
 * @see [assignPorts]
 * @see [getPortBorderGap]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSeriesParallelLayoutPortAssignment%23DefaultPortAssignment-method-getPortDistanceDelta">Online Documentation</a>
 */
 open protected   fun getPortDistanceDelta( sideLength: Double ,
 edgeCount: Int ,
 portBorderGap: Double ):Double

companion object : ClassMetadata<DefaultPortAssignment> {
}
}

inline fun DefaultPortAssignment(
    block: DefaultPortAssignment.() -> Unit
): DefaultPortAssignment {
    return DefaultPortAssignment()
        .apply(block)
}
